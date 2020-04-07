package com.system;

import com.databases.DbUpdateStocksData;

import java.util.Timer;
import java.util.TimerTask;

public class PeriodicUpdate extends TimerTask {
    public String companyName = "";

    public PeriodicUpdate(String nameOfCompany) {
        companyName = nameOfCompany;
    }

    public static void main(String[] args) {
        update("SNAP");
    }

    public static void update(String nameOfCompany){
        // And From your main() method or any other method
        Timer timer = new Timer();
        timer.schedule(new PeriodicUpdate(nameOfCompany), 0, 5000);
    }

    @Override
    public void run() {
        DbUpdateStocksData.update(companyName);
        System.out.println("updated");
    }
}
