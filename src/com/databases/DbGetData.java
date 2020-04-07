package com.databases;

import javax.swing.*;
import java.sql.*;

public class DbGetData {

    public static void main(String[] args){

    }

    public String[] getDbStocksData(){
        String[] output = new String[6];
        try{
            Connection myCon = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/shares?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
                    "root","");
            String query = "SELECT * from stockslistdbtbl";
            var statement = myCon.prepareStatement(query);
            ResultSet r = statement.executeQuery();
            while(r.next()){
                String code = r.getString("code");
                String name = r.getString("name");
                String cur = r.getString("cur");
                double price = r.getDouble("price");
                double riseOrFall = r.getDouble("+/-");
                double riseOrFallPercent = r.getDouble("+/-%");
                output[0] = code;
                output[1] = name;
                output[2] = cur;
                output[3] = String.valueOf(price);
                output[4] = String.valueOf(riseOrFall);
                output[5] = String.valueOf(riseOrFallPercent);
                return output;
            }

            if(myCon != null){
                System.out.println("Successful");
            }
            myCon.close();
        }
        catch (SQLException sqlEx){
            sqlEx.printStackTrace();
        }
        return output;
    }

    public static void getDbUserData(String[] data){
        String[] output = new String[6];
        try {
            Connection myCon = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/shares?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
                    "root", "");
            String query = "SELECT * from shareholderstbl WHERE `username` = " + "'" + data[0] + "'" + "AND `password`= " + "'" + data[1] + "'";
            var statement = myCon.prepareStatement(query);
            ResultSet r = statement.executeQuery();
            if (!r.next()){
                System.out.println("wrong pass or whateva");
                com.userInterface.Login lg = new com.userInterface.Login();
                lg.setVisible(true);
                lg.pack();
                lg.setLocationRelativeTo(null);
                lg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                JOptionPane.showMessageDialog(lg, "username or password invalid.");
            }
            else{
                String username = r.getString("username");
                String password = r.getString("password");
                System.out.println(username + ", " + password + ", " + data[0] + ", " + data[1]);
                if (username.equals(data[0]) && password.equals(data[1])) {
                    com.userInterface.StocksList sl = new com.userInterface.StocksList();
                    sl.setVisible(true);
                    sl.pack();
                    sl.setLocationRelativeTo(null);
                    sl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
            }



            if(myCon != null){
                System.out.println("Successful");
            }
            myCon.close();
        }
        catch (SQLException sqlEx){
            sqlEx.printStackTrace();
        }
    }

    public static String[] getDbBrokerData(){
        String[] output = new String[6];
        try {
            Connection myCon = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/shares?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
                    "root", "");
            //order the the table by date
            String query1 = "SELECT * from brokerssharestbl WHERE brokerssharestbl.date < @CurrentDate\n" +
                    "ORDER BY brokerssharestbl.date DESC";
            var statement = myCon.prepareStatement(query1);
            ResultSet r = statement.executeQuery();
//            String


//            String query2 = "SELECT * from brokerstbl WHERE `id` = " + "'" + data[0] + "'" + "AND `password`= " + "'" + data[1] + "'";


            if(myCon != null){
                System.out.println("Successful");
            }
            myCon.close();
        }
        catch (SQLException sqlEx){
            sqlEx.printStackTrace();
        }
        return output;
    }

}

