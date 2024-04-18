package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import model.Pet;
import model.PetType;

/**
 * Arbeiten mit Dateien
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D06_WorkingWithFiles {

  public static void main(String[] args) throws FileNotFoundException {

    ArrayList<Pet> pets = new ArrayList<>();

    File file = new File("resources/pets.csv");

    Scanner scanner = new Scanner(file);

    while (scanner.hasNextLine()) {
      String line = scanner.nextLine();
      String[] tokens = line.split(";");

      String name = tokens[0];
      PetType type = PetType.valueOf(tokens[1]);
      double weightInKg = Double.parseDouble(tokens[2]);
      // Double weightInKg = Double.valueOf(tokens[2]);

      Pet pet = new Pet(name, type, weightInKg);
      pets.add(pet);
    }

    for (Pet p : pets) {
      System.out.println(p);
    }

  }

}
