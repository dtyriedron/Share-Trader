package com.system;



public class RecommendBrokers {
    //good broker is someone who is doing well recently and someone with a good rating
    //get the brokers from the broker table
    String[] gary = com.databases.DbGetData.getDbBrokerData();

    //sort them in descending order by the last three share profits added together and if they have at least three star rating
    //recommend them to user

}
