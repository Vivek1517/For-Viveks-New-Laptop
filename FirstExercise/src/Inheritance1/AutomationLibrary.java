package Inheritance1;

public class AutomationLibrary extends Base{

    public void createAccount(String email, String password){
        System.out.println("Creating an account"+email);
        System.out.println("Entering password"+password);
    }

}
