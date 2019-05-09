/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.safaricomhackathon.restapi.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

/**
 *
 * @author jngetich
 */
public class httpGet {

    public String getRequest(String urlObj) throws IOException {
        URL obj = new URL(urlObj);
        StringBuilder response = null;
        String res = "";

        try {

            HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();

            int timeout = 60000;
            con.setConnectTimeout(500000);
            con.setReadTimeout(timeout);
            con.setRequestMethod("GET");
            con.setRequestProperty("content-type", "application/json");
            con.setDoOutput(true);
            con.setRequestProperty("User-Agent", "Mozilla 5.0 (Windows; U; "
                    + "Windows NT 5.1; en-US; rv:1.8.0.11) ");
            response = new StringBuilder();
            InputStreamReader input = new InputStreamReader(con.getInputStream());
            BufferedReader in = new BufferedReader(input);
            String inputLine = null;
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            res = response.toString();

        } catch (Exception ex) {
            res = ex.toString();

        }

        return res;
    }


}
