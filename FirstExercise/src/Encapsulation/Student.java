package Encapsulation;

public class Student {
    private int age;
    private String subject;
    private long contactNumber;
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getSubject(){
        return subject;
    }
    public void setSubject(String subject){
        this.subject=subject;
    }
    public long getContactNumber(){
        return contactNumber;
    }
    public void setContactNumber(long contactNumber){
        this.contactNumber=contactNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
