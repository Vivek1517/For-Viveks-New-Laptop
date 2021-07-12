public class LowestNumber {
    public void miniumValue(int a, int b, int c){
        if(a<b && a<c){
            System.out.println(a+" is the lowest number");
        }
        else{
            if(b<c && b<a){
                System.out.println(b+"B is the loest number");
            }
            else{
                System.out.println(c+"C is the lowest number");
            }
        }
    }

    public static void main(String[] args) {
        LowestNumber lowestNumber= new LowestNumber();
        lowestNumber.miniumValue(0, 20, 15);
    }
}
