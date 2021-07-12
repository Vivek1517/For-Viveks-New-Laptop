import java.util.Scanner;

public class GreatestNumber4 {
    public static void main(String[] args) {
        String yesNo="yes";
        int lowest=0;
        int greatest=0;
        while(yesNo.equals("yes")){
            Scanner inputValue= new Scanner(System.in);
            System.out.println("Enter a numerical value");
            int userInput=inputValue.nextInt();
            System.out.println("Would you like to put another value?");
            Scanner userAnswer= new Scanner(System.in);
            yesNo=userAnswer.nextLine();
            if(userInput<lowest){
                lowest=userInput;
                }
          if(userInput>greatest){
              greatest=userInput;
          }
        }
        System.out.println(lowest+" is the lower value");
        System.out.println(greatest+" is the greater value");
    }
}
