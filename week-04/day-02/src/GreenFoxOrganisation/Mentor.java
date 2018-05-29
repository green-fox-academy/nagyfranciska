package GreenFoxOrganisation;

public class Mentor extends Person {

  String level;

  public Mentor(String name, int age, String gender) {
    super(name, age, gender);
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
    System.out.println("Educate brilliant junior software developers.");
  }

  @Override
  public void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age + " year old " +
                        gender + level + " mentor.");
  }
}
