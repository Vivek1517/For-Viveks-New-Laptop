import java.util.Scanner;

public class DisplayStudentData {

    public static void main(String[] args) {
        String enterName;
        StudentData s= new StudentData();
        Scanner input= new Scanner(System.in);
        System.out.println("Please fill in the below details");
        do {System.out.println("Type in your full name");

        enterName=input.nextLine();

            if(enterName.contains("1")||enterName.contains("0")||enterName.contains("2")||enterName.contains("3")||
                    enterName.contains("4")){
                System.out.println("Please enter only letters");
            }
        }
        while(enterName.contains("1")||enterName.contains("0")||enterName.contains("2")||enterName.contains("3")||
                enterName.contains("4"));



      //  System.out.println("You have entered: "+enterName);
        System.out.println("Type in your contact number");
        String contact=input.nextLine();
      //  System.out.println("you have entered : "+contact);
        System.out.println("How tall are you");
        float height= input.nextFloat();
       // System.out.println("You entered your height as: "+height);
        System.out.println("Enter your age");
        int age=input.nextInt();
       // System.out.println("You are: "+age);
      //  System.out.println("Gender: "+s.getStudentGender());
       // System.out.println("ID: "+s.getStudentID());

    //    s.setStudentName("Vivek K Salgaonkar");
      //s.setStudentGender('M');
       // s.setStudentAge(40);
        //s.setHeight(6.1f);
        //s.setEnrolledCourse("QA Java Masterclass");
       //s.setStudentID(425);
        //s.setStudentContact("07957653672");



    }
}
