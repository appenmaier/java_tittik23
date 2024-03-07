package main;

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

    System.out.println("result1: " + result1);
    System.out.println("result2: " + result2);
    System.out.println("result3: " + result3);
    System.out.println("result4: " + result4);
    System.out.println("result5: " + result5);
    System.out.println("result6: " + result6);
    System.out.println("d1: " + d1);
    System.out.println("i1: " + i1);
  }

  public static void main(String[] args) {

    /* Primitive Datentypen */
    primitiveDatatypes();
    System.out.println();

    /* Arithmetische Operatoren und Typumwandlungen */
    arithmeticOperations();
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
