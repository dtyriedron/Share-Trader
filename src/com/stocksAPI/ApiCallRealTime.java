package com.stocksAPI;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONObject;

public class ApiCallRealTime {
    public static void main(String[] args) {
        try {
            ApiCallRealTime.call_me();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String[] call_me() throws Exception {
        String url = "https://api.worldtradingdata.com/api/v1/stock?symbol=USA&api_token=5lIA1yRD2Cf5Qxb6d9AvYnoIUiy5qgDpxkWacf1LQ4Ks0eTukl7UaHxvtoH1";
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
        //get all the data from the api: code, name, cur, price, +/-, +/-%
        //which is: symbol, name, currency, price, day_change, change_pct
        String[] apiNames = new String[]{"symbol", "name", "currency", "price", "day_change", "change_pct"};
        String[] returnStrings = new String[6];
        for (int i =0; i<apiNames.length; ++i) {
            System.out.println(apiNames[i] + ": " +myResponse.getJSONArray("data").getJSONObject(0).get(apiNames[i]));
            returnStrings[i] = myResponse.getJSONArray("data").getJSONObject(0).get(apiNames[i]).toString();
        }
        return returnStrings;

    }
}
