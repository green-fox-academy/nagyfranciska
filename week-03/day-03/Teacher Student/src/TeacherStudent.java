public class TeacherStudent {
  public static void main(String[] args) {

    Student student = new Student();
    Teacher teacher = new Teacher();

    teacher.teach(student);
    student.learn();
    student.question(teacher);
    teacher.answer();

  }
}
