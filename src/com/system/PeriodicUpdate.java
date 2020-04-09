package com.system;

import com.databases.DbGetData;
import com.databases.DbInsertData;
import com.userInterface.StocksList;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Timer;

public class PeriodicUpdate extends TimerTask {
    public String codeForCompany = "";
    public double minForUser = 0;
    public double maxForUser = 0;
    public boolean companyNewsAlert = false;


    public PeriodicUpdate(String companyCode, double max, double min, boolean isNews) {
        codeForCompany = companyCode;
        minForUser = min;
        maxForUser = max;
        companyNewsAlert = isNews;
    }

    public static void main(String[] args) {
        update("SNAP", 16, 10, false);
    }

    public static void update(String code, double max, double min, boolean isNews){
        // And From your main() method or any other method
        Timer timer = new Timer();
        timer.schedule(new PeriodicUpdate(code, max, min, isNews), 0, 30000);
    }

    @Override
    public void run() {

        //insert data into db where code is equal to input, setting day ahead and putting price either down or up
        //then get that new data and check if alert needs to be posted
        if(!companyNewsAlert){
            try {
                updateStock();
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        else{
            updateNews();
        }

    }

    public void updateNews(){
        StocksList sl = new StocksList();
        JOptionPane.showMessageDialog(sl, "News: " + Simulate.simulateNews());
    }

    public void updateStock() throws ParseException {
        //get data where

        String[] data = DbGetData.getStock(codeForCompany);

        //add one to this stocks date
        java.util.Date date = null;

        date = new SimpleDateFormat("yyyy-MM-dd").parse(data[6]);


        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DAY_OF_MONTH, 1);
        Date datePlusOne = c.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        data[6] = sdf.format(datePlusOne);
        System.out.println(data[6]);

        //change the price of this stock
        double price = Double.valueOf(data[3]);

        data[4] = String.valueOf(1);
        data[5] = String.valueOf((1.0/price)*100);
        data[3] = String.valueOf(price+1.0);

        DbInsertData.insertNewPriceForStock(data);
        System.out.println("updated");
        if(Double.valueOf(DbGetData.getStock(codeForCompany)[3]) > maxForUser){
            StocksList sl = new StocksList();
            JOptionPane.showMessageDialog(sl,"hit maximum");
        }
        if(Double.valueOf(DbGetData.getStock(codeForCompany)[3]) < minForUser){
            StocksList sl = new StocksList();
            JOptionPane.showMessageDialog(sl,"hit minimum");
        }
    }
}

