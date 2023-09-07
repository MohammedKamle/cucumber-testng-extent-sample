package com.example.definitions;

import com.example.utils.HelperClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.net.MalformedURLException;

public class Hooks {

    @Before
    public static void setUp() throws MalformedURLException {

        HelperClass.setUpDriver();
    }

    @After
    public static void tearDown() {

        HelperClass.tearDown();
    }
}
