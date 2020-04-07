package com.stocksAPI;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONObject;

public class ApiCallHistoric {
    public static void main(String[] args) {
        try {
            ApiCallHistoric.call_me();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void call_me() throws Exception {
        String url = "https://api.worldtradingdata.com/api/v1/history?symbol=SNAP&api_token=demo";
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        // optional default is GET
        con.setRequestMethod("GET");
        //add request header
        con.setRequestProperty("User-Agent", "Mozilla/5.0");
        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);
        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        //print in String
        System.out.println(response.toString());
        //Read JSON response and print
        JSONObject myResponse = new JSONObject(response.toString());
        System.out.println("result after Reading JSON Response");
        //get all the data from the api: high, low, volume
        //need to assign a random buyer and seller to this share

        String[] filterStrings = new String[]{"high", "low", "volume"};
        for(int i=0; i<filterStrings.length;++i){
            System.out.println(filterStrings[i] + ": " +myResponse.getJSONObject("history").getJSONObject("2018-03-07").get(filterStrings[i]));
        }





    }
}
