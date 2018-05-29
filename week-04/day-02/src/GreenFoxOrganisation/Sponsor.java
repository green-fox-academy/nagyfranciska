package GreenFoxOrganisation;

public class Sponsor extends Person {

  String company;
  int hiredStudents;

  public Sponsor() {
    company = "Google";
    hiredStudents = 0;
  }

  public Sponsor(String name, int age, String gender, String company) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.company = company;
    hiredStudents = 0;
  }

  @Override
  public void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age + " year old " +
                       gender + " who represents " + company + " and hired " +
                       hiredStudents + " students so far.");
  }

  public int hire() {
    hiredStudents += 1;
    return hiredStudents;
  }

  @Override
  public void getGoal() {
    System.out.println("My goal is : hire brilliant junior software developers.");
  }
}
