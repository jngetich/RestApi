/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.safaricomhackathon.restapi.api;

import org.json.JSONObject;

/**
 *
 * @author jngetich
 */
public class RequestProcessor {

    public String processrequest(String request) {
        String response = "";

        try {
            JSONObject requestJson = new JSONObject(request);
            String service = requestJson.toString();
            httpGet http = new httpGet();

            switch (service) {

                case "peopleid1":
                    //getting people with ID 1
                    response = http.getRequest("https://swapi.co/api/people/1");
                    
                    break;
                case "blueyes":
                    //getting people with blue eye color
                    response = http.getRequest("https://swapi.co/api/people/?eye_color=blue");

                    
                    break;

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return response;
    }

    public static void main(String[] args) {
        try {

            System.out.println();
        } catch (Exception e) {
        }
    }

}
