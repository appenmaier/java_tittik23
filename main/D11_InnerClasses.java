package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;
import model.InvalidGradeException;
import model.Student;

/**
 * Innere Klassen
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D11_InnerClasses {

  public static void main(String[] args) {

    List<Student> students = new ArrayList<>();
    students.add(new Student("7264326", "Hans", new HashMap<String, Double>()));
    students.add(new Student("9182743", "Peter", new HashMap<String, Double>()));
    students.add(new Student("2237185", "Lisa", new HashMap<String, Double>()));
    students.add(new Student("9028572", "Fritz", new HashMap<String, Double>()));

    try {
      students.get(0).setGrade("Mathe", 3.2);
      students.get(1).setGrade("Mathe", 2.7);
      students.get(2).setGrade("Informatik", 1.4);
      students.get(3).setGrade("Mathe", 4.0);
    } catch (InvalidGradeException e) {
      e.printStackTrace();
    }

    /* Lokale Klassen */
    class StudentByAverageRatingAscendingComparator implements Comparator<Student> {
      @Override
      public int compare(Student o1, Student o2) {
        return o1.getAverageRating().compareTo(o2.getAverageRating());
      }
    }

    class StudentPrinter implements Consumer<Student> {
      @Override
      public void accept(Student t) {
        System.out.println(t);
      }
    }

    Collections.sort(students, new StudentByAverageRatingAscendingComparator());
    students.forEach(new StudentPrinter());
    System.out.println();

    /* Anonyme Klassen */
    Collections.sort(students, new Comparator<Student>() {
      @Override
      public int compare(Student o1, Student o2) {
        return o2.getAverageRating().compareTo(o1.getAverageRating());
      }
    });
    students.forEach(new Consumer<Student>() {
      @Override
      public void accept(Student t) {
        System.out.println(t);
      }
    });
    System.out.println();

    /* Lambda Ausdrücken */
    Collections.sort(students,
        (student1, student2) -> student1.getAverageRating().compareTo(student2.getAverageRating()));
    students.forEach(student -> System.out.println(student));
    students.forEach(student -> student.greet());
    System.out.println();

    /* Methodenreferenzen */
    students.forEach(System.out::println);
    students.forEach(Student::greet);

    Collections.sort(students, (o1, o2) -> o2.id().compareTo(o1.id()));

    /* Beispiel Java Stream API */
    double total = 0;
    int numberOfGrades = 0;
    for (Student s : students) {
      if (s.grades().containsKey("Mathe")) {
        total += s.grades().get("Mathe");
        numberOfGrades++;
      }
    }
    System.out.println(total / numberOfGrades);

    System.out.println(students.stream().filter(s -> s.grades().containsKey("Mathe"))
        .mapToDouble(s -> s.grades().get("Mathe")).average());

  }

}
