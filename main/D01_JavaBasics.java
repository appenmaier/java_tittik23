package main;

import java.util.Random;

public class D01_JavaBasics {

  public static void arithmeticOperations() {
    int result1 = 5 + 3;
    int result2 = 5 - 3;
    int result3 = 5 * 3;
    int result4 = 5 / 3;
    int result5 = 5 % 3;
    double result6 = (double) 5 / 3;

    double d1 = 4; // widening cast
    int i1 = (int) 4.9; // narrowing cast

    int c = 0;
    c = c + 1;
    c += 1;
    c++;

    double result7 = Math.sqrt(49);

    Random myRandom = new Random();
    int randomNumber = myRandom.nextInt(1, 101);

    System.out.println("result1: " + result1);
    System.out.println("result2: " + result2);
    System.out.println("result3: " + result3);
    System.out.println("result4: " + result4);
    System.out.println("result5: " + result5);
    System.out.println("result6: " + result6);
    System.out.println("d1: " + d1);
    System.out.println("i1: " + i1);
    System.out.println("result7: " + result7);
    System.out.println("randomNumber: " + randomNumber);
  }

  public static void cases() {
    /* Bedingte Anweisungen */
    int age = 17;
    char gender = 'w';

    // Logische Operatoren: &&, ||, !
    // Vergleichsoperatoren: >, <, >=, <=, !=, ==
    // Bedingungs-Operator: ?
    if (gender == 'm' && age >= 12 && age < 18) {
      System.out.println("männlicher Teenager");
    } else if (gender == 'w') {
      System.out.println("weiblich");
    } else {
      System.out.println("divers, männliches Kind, Mann");
    }

    String genderText;
    if (gender == 'm') {
      genderText = "männlich";
    } else if (gender == 'w') {
      genderText = "weiblich";
    } else {
      genderText = "divers";
    }
    System.out.println(genderText);

    genderText = (gender == 'm') ? "männlich" : (gender == 'w') ? "weiblich" : "divers";
    System.out.println(genderText);

    /* Fallunterscheidungen */
    switch (gender) {
      case 'M':
      case 'm':
        genderText = "männlich";
        break;
      case 'W':
      case 'w':
        genderText = "weiblich";
        break;
      default:
        genderText = "divers";
        break;
    }
    System.out.println(genderText);

    genderText = switch (gender) {
      case 'M', 'm' -> "männlich";
      case 'W', 'w' -> "weiblich";
      default -> "divers";
    };
    System.out.println(genderText);

  }

  public static void loops() {
    int i = 0;
    while (i < 10) {
      System.out.println(i + 1);
      i++;
    }

    i = 0;
    do {
      System.out.println(i + 1);
      i++;
    } while (i < 10);

    for (i = 0; i < 1000; i++) {
      if (i % 2 == 0) {
        continue; // break;
      }
      System.out.println(i + 1);
    }
  }

  public static void main(String[] args) {

    /* Primitive Datentypen */
    primitiveDatatypes();
    System.out.println();

    /* Arithmetische Operatoren und Typumwandlungen */
    arithmeticOperations();
    System.out.println();

    /* Bedingte Anweisungen und Fallunterscheidungen */
    cases();
    System.out.println();

    /* Schleifen */
    loops();
    System.out.println();

  }

  public static void primitiveDatatypes() {
    /* Ganze Zahlen: byte, short, int, long */
    int i = 42;

    /* Gleitkommazahlen: float, double */
    double salaryInEuro = 4_999.33;

    /* Boolscher Wahrheitswert: boolean */
    boolean isSuper = true;

    /* Zeichen: char */
    char a1 = 'A';
    char a2 = 65;
    char a3 = 0b1000001; // 0b (Binär), 0 (Oktal), 0x (Hexadezimal)
    char a4 = '\u0041';

    System.out.println("i: " + i); // C: printf("i: %d\n", i); // C++: cout << "i: " << i << endl;
    System.out.println("salsalaryInEuro: " + salaryInEuro);
    System.out.println("isSuper: " + isSuper);
    System.out.println("a1: " + a1);
    System.out.println("a2: " + a2);
    System.out.println("a3: " + a3);
    System.out.println("a4: " + a4);
  }

}
