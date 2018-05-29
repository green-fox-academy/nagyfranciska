package GreenFoxOrganisation;

public class Student extends Person {

  String previousOrganisation;
  int skippedDays;

  public Student () {
    skippedDays = 0;
    previousOrganisation = "The School of Life";
  }

  public Student (String name, int age, String gender, String previousOrganisation) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.previousOrganisation = previousOrganisation;
    skippedDays = 0;
  }

  @Override
  public void getGoal() {
    System.out.println("Be a junior software developer.");
  }

  @Override
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
