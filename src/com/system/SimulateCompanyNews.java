package com.system;

import java.util.Random;

public class SimulateCompanyNews {
    public SimulateCompanyNews(){
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

    private static String[] newsList;
//    private String companyName;
}
