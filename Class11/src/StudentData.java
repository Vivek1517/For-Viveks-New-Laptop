import java.lang.invoke.StringConcatFactory;

public class StudentData {
  private  String studentName;
  private  String studentContact;
  private  char studentGender;
  private  int studentID;
  private  String enrolledCourse;
  private  int studentAge;
  private  float height;

  public String getStudentName(){
      return studentName;
  }
  public String getStudentContact(){
      return studentContact;
  }
  public char getStudentGender(){
      return studentGender;
  }

    public int getStudentID() {
        return studentID;
    }
    public String getEnrolledCourse(){
      return enrolledCourse;
    }
    public int getStudentAge(){
      return studentAge;
    }

    public float getHeight() {
        return height;
    }

    public void setStudentName(String Name) {

        this.studentName = Name;
    }

    public void setStudentContact(String contact) {
        this.studentContact = contact;
    }

    public void setStudentGender(char gender) {
        this.studentGender = gender;
    }

    public void setStudentID(int id) {
      if(id>100 && id<200){
          this.studentID = id;
                }
      else{
          System.out.println("Print value between 100 to 200");
      }

    }

    public void setEnrolledCourse(String course) {
        this.enrolledCourse = course;
    }

    public void setHeight(float sHeight) {
        this.height = sHeight;
    }

    public void setStudentAge(int age) {
        this.studentAge = age;
    }


}
