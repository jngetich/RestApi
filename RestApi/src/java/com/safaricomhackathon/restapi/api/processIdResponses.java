/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.safaricomhackathon.restapi.api;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author jngetich
 */
public class processIdResponses {

    DbFunctions dbf = new DbFunctions();

    //processing response for people with blue eyes
    public void processPeopleBlueEyes(String request) {

        JSONObject requestjson = new JSONObject(request);

        //Getting results from the JSON response from the endpoint
        JSONArray jsonArray = new JSONArray(requestjson.get("results").toString());
        
        //iterate jsonarray to store each record 
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject personDetails = new JSONObject(jsonArray.get(i).toString());
            dbf.blueEyesDetails(personDetails);

        }
    }

    //processing response for person with ID one
    public void processPersonId1(String request) {

        JSONObject requestjson = new JSONObject(request);
        dbf.blueEyesDetails(requestjson);

    }

}
