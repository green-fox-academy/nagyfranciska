package GreenFoxOrganisation;

public class Student extends Person {

  String previousOrganisation;
  int skippedDays;

  public Student (String name, int age, String gender) {
    super(name, age, gender);
    skippedDays = 0;
  }

  public Student (String name, int age, String gender, String previousOrganisation) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    previousOrganisation = "The School of Life";
    skippedDays = 0;
  }

  public void getGoal() {
    System.out.println("Be a junior software developer.");
  }

  public void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender +
                       " from " + previousOrganisation + " skipped " + skippedDays +
                       " days from the course already.");
  }

  public int skipDays(int numberOfDays) {
    skippedDays += numberOfDays;
    return skippedDays;
  }
}
