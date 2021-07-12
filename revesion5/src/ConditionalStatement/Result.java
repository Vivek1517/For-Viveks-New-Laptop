package ConditionalStatement;

public class Result {
    int passPercentage=36;
    public void percentage(int percentageRecieved){
        if(percentageRecieved>=passPercentage){
            System.out.println("Congratulations you hae passed as you scored "+percentageRecieved+"%");
        }
        else{
            System.out.println("You have failed your exam as you scored only "+percentageRecieved+"%");
        }

    }

    public static void main(String[] args) {
        Result passCriteria= new Result();
        passCriteria.percentage(36);
        passCriteria.percentage(35);
        passCriteria.percentage(90);

        }
}
