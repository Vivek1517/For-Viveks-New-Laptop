package Inheritance1;

import org.junit.Test;

public class Regression extends Base{
String email="jgfk";
String pwd="48939";
    @Test
    public void test1(){
        automationLibrary.createAccount(email,pwd);
    }
}
