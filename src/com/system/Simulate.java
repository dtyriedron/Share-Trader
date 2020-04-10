package com.system;

import com.databases.DbGetData;
import com.userInterface.BrokerList;
import com.userInterface.StocksList;

import javax.swing.*;
import java.util.Random;
import java.util.Vector;

public class Simulate {
    public Simulate(){
        newsList = new String[]{"adrien smith has become our owner", "john smith has left his role as financial director",
                "Corona virus Update", "quarterly update", "yearly update"};
    }

    public static void main(String[] args) {

        simulateNews();
    }
    public static String simulateNews(){
        newsList = new String[]{"adrien smith has become our owner", "john smith has left his role as financial director",
                "Corona virus Update", "quarterly update", "yearly update"};
        Random r = new Random();
        int low = 0;
        int high = 4;
        int result = r.nextInt(high-low) + low;
        System.out.println(newsList[result]);
        return newsList[result];
    }
    public static String simulateShareholder(){
        Vector<String> shareholderList = DbGetData.getDbAllUsers();
        Random r = new Random();
        int low = 0;
        int high = shareholderList.size()-1;
        int result = r.nextInt(high-low) + low;
        return shareholderList.get(result);
    }
    public static String simulateAnnoucement(){
        String[] announcements = new String[] {"bought new share, new chairmen appointed"};
        Random r = new Random();
        int low = 0;
        int high = announcements.length;
        int result = r.nextInt(high-low) + low;
        return announcements[result];
    }

    public static void recommendBroker(){
        BrokerList bl = new BrokerList();
        String[] data = DbGetData.getDbBrokerData();
        JOptionPane.showMessageDialog(bl,"Recommended Broker: " + data[0] + " " + data[1]);
    }

    private static String[] newsList;
//    private String companyName;
}
