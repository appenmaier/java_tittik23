package model;

import java.util.Map;
import java.util.Set;

/**
 * Studierender
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public record Student(String id, String name, Map<String, Double> grades)
    implements Comparable<Student> {

  public void setGrade(String lecture, Double grade) throws InvalidGradeException {
    if (grade <= 0) {
      throw new InvalidGradeException(grade);
    }

    grades.put(lecture, grade);
  }

  public Double getAverageRating() {
    double total = 0;

    // for(Entry<String, Double> entry : grades.entrySet()) {
    // total += entry.getValue();
    // }

    for (Double grade : grades.values()) {
      total += grade;
    }

    return total / grades.size();
  }

  public Set<String> getLectures() {
    return grades.keySet();
  }

  @Override
  public int compareTo(Student o) {
    return name.compareTo(o.name);
  }

}
