package Package1;

import javax.xml.namespace.QName;

public class Class1 {
    int age= 40;
    char gender= 'M';
    String name="Vivek";
    double yearlyWifesIncome= 120000.987;
    byte salary=0;
    short child =1;
    float height=6.1f;
    long numberOfKids=251123;
    boolean male=true;

    public static void main(String[] args) {
        Class1 printValue= new Class1();
        System.out.println(printValue.name);
        System.out.println(printValue.age);
        System.out.println(printValue.height);
        System.out.println(printValue.gender);
        System.out.println(printValue.child);
        System.out.println(printValue.salary);
        System.out.println(printValue.yearlyWifesIncome);
        System.out.println(printValue.numberOfKids);
        System.out.println(printValue.male);
           }
}
