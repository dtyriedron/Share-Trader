package com.databases;

import com.stocksAPI.ApiCallRealTime;

import java.sql.*;

public class DbEditStocksData {

    public static void main(String[] args){
        //update("SNAP");
    }

    public static void update(String[] row){
        try{
//            String[] apiOutput = ApiCallRealTime.call_me();
            Connection myCon = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/shares?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
                    "root","");
            String query = "UPDATE  `stockslistdbtbl` SET `code` = '"+row[0]+"', `name` = '"+row[1]+"'," +
                    " `cur` = '"+row[2]+"', `price` = '"+row[3]+"'" +"," +
                    "`+/-` = '"+row[4]+"', `+/-%` = '"+row[5]+"', `date` = '"+row[6]+"' WHERE `stockslistdbtbl`.`code` = '"+row[0]+"';";
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

