package main;

import java.util.ArrayList;
import model.Pet;

/**
 * Wiederholung: OO
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D03_Repetition {

  public static void main(String[] args) {

    Pet pet1 = new Pet("Max", "Katze", 2);
    Pet pet2 = new Pet("Moritz", "Hund", 3.5);

    ArrayList<Pet> pets = new ArrayList<>();
    pets.add(pet1);
    pets.add(pet2);

    for (Pet p : pets) {
      p.getOlder();
      p.eat();
      p.move();
      System.out.println(p);
    }

  }

}
