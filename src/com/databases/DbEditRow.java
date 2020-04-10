package com.databases;

import com.stocksAPI.ApiCallRealTime;

import java.sql.*;

public class DbEditRow {

    public static void main(String[] args)
    {
        updateRowsUserWatch("Jes","SNAP");
    }

    public static void updateRowsUserWatch(String user, String companyCode){
        try{
            //String[] apiOutput = ApiCallRealTime.call_me();
            Connection myCon = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/shares?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
                    "root","");
            //String apiOutputJoined = "'"+apiOutput[0]+"'" +","+ "'"+apiOutput[1]+"'"+","+ "'"+apiOutput[2]+"'"+","+ "'"+apiOutput[3]+"'"+","+ "'"+apiOutput[4]+"'" +","+ "'"+apiOutput[5]+"'";
            //System.out.println(apiOutputJoined);
            String query = "UPDATE `stockslistdbtbl` SET `watchedBy` = '"+user+"' WHERE `stockslistdbtbl`.`code` = '"+companyCode+"';";
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


