package Inheritance1;

import org.junit.Before;

public class Base {
    public static AutomationLibrary automationLibrary;
    @Before
    public void open(){
        System.out.println("Open before method");
    }
}
