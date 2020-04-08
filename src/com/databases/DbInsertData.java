package com.databases;

import com.stocksAPI.ApiCallRealTime;

import java.sql.*;

public class DbInsertData {

    public static void main(String[] args) {
        insertData("stockslistdbtbl", new String[]{"data"});
    }

    public static void insertNewPriceForStock(String[] updateStock) {
        try {
            //connect to the db
            Connection myCon = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/shares?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
                    "root", "");
            String tableColumns = "(`code`, `name`, `cur`, `price`, `+/-`, `+/-%`, `date`)";

            String[] currentStock = DbGetData.getStock(updateStock[0]);
            String tableValues1 = "'"+currentStock[0]+"'" +","+ "'"+currentStock[1]+"'"+","+ "'"+currentStock[2]+"'"+","+ "'"+currentStock[3]+"'"+","+ "'"+currentStock[4]+"'" +","+ "'"+currentStock[5]+"', '"+currentStock[6]+"'";

            //first need to put old stock in historic
            String query = "INSERT INTO `historicstocklisttbl` " + tableColumns + " VALUES (" + tableValues1 + ")";
            var statement = myCon.prepareStatement(query);
            statement.executeUpdate();

            DbEditStocksData.update(updateStock);


            if (myCon != null) {
                System.out.println("Successful");
            }
            myCon.close();
        }catch (SQLException sqlEx){
            sqlEx.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void insertData(String tableName, String[] data){
        try{
            //call the api for updating the stock data
            String[] apiOutput = ApiCallRealTime.call_me();
            String apiOutputJoined = "'"+apiOutput[0]+"'" +","+ "'"+apiOutput[1]+"'"+","+ "'"+apiOutput[2]+"'"+","+ "'"+apiOutput[3]+"'"+","+ "'"+apiOutput[4]+"'" +","+ "'"+apiOutput[5]+"'";
            System.out.println(apiOutputJoined);
            //connect to the db
            Connection myCon = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/shares?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
                    "root","");
            String tableColumns = "";
            String tableValues = "";
            switch(tableName){
                case "stockslistdbtbl":
                    tableColumns = "(`code`, `name`, `cur`, `price`, `+/-`, `+/-%`)";
                    tableValues = apiOutputJoined;
                    break;
                case "shareholderstbl":
                    tableColumns = "(`username`, `password`, `id`, `isAdmin`, `announcements`, `firstname`, `lastname`)";

                    tableValues = "'"+data[0] +"', '"+ data[1] +"', " +"NULL, '0', '', '"+data[2] +"', '"+data[3]+"'";
//                    INSERT INTO `shareholderstbl` (`username`, `password`, `id`, `isAdmin`, `announcements`, `firstname`, `lastname`)
//                    VALUES ('admin', 'root', NULL, '1', '', 'Dylan', 'Tyrie-Dron');
                    break;
                case "shareholdersharestbl":
                    //todo: add case for this
                default:
                    break;
            }


            String query = "INSERT INTO `"+tableName+"` "+tableColumns+" VALUES ("+tableValues+");";
            var statement = myCon.prepareStatement(query);
            statement.executeUpdate();

            if(myCon != null){
                System.out.println("Successful");
            }
            myCon.close();
        }
        catch (SQLException sqlEx){
            sqlEx.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

