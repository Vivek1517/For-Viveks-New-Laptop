package Automation;

import org.junit.*;

public class JunitTrial {

    @Before
    public void openBrowser(){
        System.out.println("Opening Browser");
    }
    @Test
    public void test2(){
        System.out.println("Test 2");
    }
    @Test
    public void test1(){
        System.out.println("Test 1");
    }
    @After
    public void closeBwoser(){
        System.out.println("Closing Browser");
    }


}
