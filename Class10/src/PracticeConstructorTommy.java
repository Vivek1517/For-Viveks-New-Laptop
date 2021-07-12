public class PracticeConstructorTommy {
    PracticeConstructorTommy(){
        System.out.println("I'm defualt constructor");
    }
    // Instance variable or Global variable.
    String name;
    int age;
    String colour;
    Double weight;

    static int BREED=3;

    PracticeConstructorTommy(String name, int age, String colour, Double weight){
        this.name=name;
        this.age=age;
        this.colour=colour;
        this.weight=weight;
    }
    public void printTom(){
        System.out.println(name+" "+" "+age+" "+colour+" "+weight);
    }

    static void tommyFood(){
       String food="Chicken";
        System.out.println(food);
    }

    public int addDogAge(int a, int b){
        this.age=a+b;
        return age;
    }
    public void displayResult(){
        System.out.println(age);
    }
    //public void setAge(int age)
    //    this.age=age;

    public static void main(String[] args) {
        PracticeConstructorTommy dog = new PracticeConstructorTommy("Tommy",20, "Black", 20.5);
       dog.printTom();
        PracticeConstructorTommy dog1 = new PracticeConstructorTommy();
        System.out.println(PracticeConstructorTommy.BREED);
        PracticeConstructorTommy.tommyFood();
        System.out.println("Dogs age "+dog1.addDogAge(10, 20));


    }
}
