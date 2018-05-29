package GreenFoxOrganisation;
import java.util.ArrayList;

public class Cohort {

  String name;
  ArrayList<Student> students;
  ArrayList<Mentor> mentors;

  public Cohort(String name) {
    this.name = name;
    students = new ArrayList<>();
    mentors = new ArrayList<>();
  }

  public ArrayList addStudent(Student student) {
    students.add(student);
    return students;
  }

  public ArrayList addMentor(Mentor mentor) {
    mentors.add(mentor);
    return mentors;
  }

  public void info() {
    System.out.println("The " + name + "cohort has " + students.size() +
                       " students and " + mentors.size() + " mentors.");
  }
}
