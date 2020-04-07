package com.databases;

import com.stocksAPI.ApiCallRealTime;

import java.sql.*;

public class DbUpdateStocksData {

    public static void main(String[] args){
        update("SNAP");
    }

    public static void update(String companyCode){
        try{
            String[] apiOutput = ApiCallRealTime.call_me();
            Connection myCon = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/shares?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
                    "root","");
            String apiOutputJoined = "'"+apiOutput[0]+"'" +","+ "'"+apiOutput[1]+"'"+","+ "'"+apiOutput[2]+"'"+","+ "'"+apiOutput[3]+"'"+","+ "'"+apiOutput[4]+"'" +","+ "'"+apiOutput[5]+"'";
            System.out.println(apiOutputJoined);
            String query = "UPDATE  `stockslistdbtbl` SET `code` = '"+apiOutput[0]+"', `name` = '"+apiOutput[1]+"'," +
                    " `cur` = '"+apiOutput[2]+"', `price` = '"+apiOutput[3]+"'" +"," +
                    "`+/-` = '"+apiOutput[4]+"', `+/-%` = '"+apiOutput[5]+"' WHERE `stockslistdbtbl`.`code` = '"+companyCode+"';";
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

