package main;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import model.InvalidGradeException;
import model.Student;

/**
 * Assoziativspeicher
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D09_Maps {

  public static void main(String[] args) {

    Student student = new Student("81272643", "Hans", new TreeMap<>());

    try {
      student.setGrade("Programmieren", 2.3);
      student.setGrade("Mathematik 1", 2.8);
      student.setGrade("NT", 3.5);
      student.setGrade("Programmieren", 2.2);
    } catch (InvalidGradeException e) {
      System.out.println(e.getMessage());
    }

    Double grade = student.grades().get("Programmieren");
    System.out.println(grade);
    System.out.println();

    System.out.println(student.getAverageRating());
    System.out.println();

    System.out.println(student.getLectures());
    System.out.println();

    System.out.println(student.grades());
    System.out.println();

    Map<Student, String> students = new TreeMap<>();
    students.put(new Student("1827432", "Hans", new HashMap<>()), "TIA23");
    students.put(new Student("9182743", "Hans", new HashMap<>()), "TIB23");
    students.put(new Student("8102843", "Hans", new HashMap<>()), "TIC23");

    System.out.println(students.get(new Student("9182743", "Hans", new HashMap<>())));
  }

}
