package Hooks;

import io.cucumber.java.Before;
import io.cucumber.java.After;

import java.net.MalformedURLException;

import Notepad.LaunchApp;
public class Hooks {
    private LaunchApp launchApp;

    @Before
    public void setUp() throws MalformedURLException, InterruptedException {
        launchApp = new LaunchApp();
        launchApp.launch(); 
    }

    @After
    public void tearDown() {
        launchApp.quit(); 
    }


    
}
