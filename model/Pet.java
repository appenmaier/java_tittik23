package model;

/**
 * Haustier
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Pet {

  /* Attribute */
  private final String name;
  private final String type;
  private int age;
  private double weightInKg;

  /* Methoden */
  public Pet(String name, String type, double weightInKg) {
    this.name = name;
    this.type = type;
    this.weightInKg = weightInKg;
  }

  public void getOlder() {
    age++;
    System.out.println(name + " ist wieder 1 Jahr älter geworden");
  }

  public void eat() {
    weightInKg *= 1.1;
    System.out.println(name + " frisst und wiegt nun " + weightInKg + "kg");
  }

  public void move() {
    weightInKg *= 0.95;
    System.out.println(name + " bewegt sich");
  }

  public String getName() {
    return name;
  }

  public String getType() {
    return type;
  }

  public int getAge() {
    return age;
  }

  public double getWeightInKg() {
    return weightInKg;
  }

  @Override
  public String toString() {
    return "Pet [name=" + name + ", type=" + type + ", age=" + age + ", weightInKg=" + weightInKg
        + "]";
  }

}
