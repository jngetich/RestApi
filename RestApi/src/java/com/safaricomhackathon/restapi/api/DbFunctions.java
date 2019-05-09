/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.safaricomhackathon.restapi.api;

import java.sql.PreparedStatement;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/**
 *
 * @author jngetich
 */
public class DbFunctions {

    private DbConnection dbConn = new DbConnection();

    private void getDBconn() {
        this.dbConn = new DbConnection();
    }

    //Inserting user with blue eyes to the database
    public boolean blueEyesDetails(JSONObject json) {
        boolean excecute = false;
        try {
            String sqlString = "INSERT INTO TBBLUEEYES "
                    + "(height,homeworld,gender,skin_color,hair_color,birth_year,eye_color,name)\n"
                    + "VALUES(?,?,?,?,?,?,?,?)";
            Map<Integer, Object> params = new HashMap<>();
            PreparedStatement preparedStatement = dbConn.conn.prepareStatement(sqlString);
            preparedStatement.setString(1, json.getString("height"));
            preparedStatement.setString(2, json.getString("homeworld"));
            preparedStatement.setString(3, json.getString("gender"));
            preparedStatement.setString(4, json.getString("skin_color"));
            preparedStatement.setString(5, json.getString("hair_color"));
            preparedStatement.setString(6, json.getString("birth_year"));
            preparedStatement.setString(7, json.getString("eye_color"));
            preparedStatement.setString(8, json.getString("name"));

            excecute = preparedStatement.execute();
            excecute = true;
        } catch (Exception ex) {
            ex.printStackTrace();

        }

        return excecute;

    }

    //saving details  of user ID 1
    public boolean userDetails(JSONObject json) {
        boolean excecute = false;
        try {
            String sqlString = "INSERT INTO TBUSERDETAILS (name,eye_color,birth_year) VALUES(?,?,?,)";
            Map<Integer, Object> params = new HashMap<>();
            PreparedStatement preparedStatement = dbConn.conn.prepareStatement(sqlString);
            preparedStatement.setString(1, json.getString("name"));
            preparedStatement.setString(2, json.getString("eye_color"));
            preparedStatement.setString(3, json.getString("birth_year"));

            excecute = preparedStatement.execute();
            excecute = true;
        } catch (Exception ex) {
            ex.printStackTrace();

        }

        return excecute;

    }

}
