package GreenFoxOrganisation;

public class Mentor extends Person {

  String level;

  public Mentor() {
    level = "intermediate";
  }

  public Mentor(String name, int age, String gender, String level) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.level = level;
  }

  @Override
  public void getGoal() {
    System.out.println("My goal is: educate brilliant junior software developers.");
  }

  @Override
  public void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age + " year old " +
                        gender + " " + level + " mentor.");
  }
}
