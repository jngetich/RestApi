/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.safaricomhackathon.restapi.api;

import org.json.JSONObject;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jngetich
 */
public class DbFunctionsIT {

    public DbFunctionsIT() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of blueEyesDetails method, of class DbFunctions.
     */
    @Test
    public void testBlueEyesDetails() {
        System.out.println("Storing blue eyes details");
        JSONObject json = null;
        DbFunctions instance = new DbFunctions();
        boolean expResult = true;
        boolean result = instance.blueEyesDetails(json);
        assertEquals(expResult, result);
        fail("Test case failed");
    }

    /**
     * Test of userDetails method, of class DbFunctions.
     */
    @Test
    public void testUserDetails() {
        System.out.println("Saving user  Details");
        JSONObject json = null;
        DbFunctions instance = new DbFunctions();
        boolean expResult = true;
        boolean result = instance.userDetails(json);
        assertEquals(expResult, result);
        fail("Test case failed");
    }

}
