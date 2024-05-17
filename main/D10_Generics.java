package main;

import model.GenericBox;
import model.IntegerBox;
import model.StringBox;

/**
 * Generische Programmierung mit Java Generics
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D10_Generics {

  @SuppressWarnings("unused")
  public static void main(String[] args) {

    /* Integer Box */
    IntegerBox integerBox = new IntegerBox();

    integerBox.setContentA(4);
    integerBox.setContentB(7);

    Integer i1 = integerBox.getContentA();
    Integer i2 = integerBox.getContentB();

    /* String Box */
    StringBox stringBox = new StringBox();

    stringBox.setContentA("Hans");
    stringBox.setContentB("Peter");

    String s1 = stringBox.getContentA();
    String s2 = stringBox.getContentA();

    /* Generic Box */
    GenericBox<Integer, String> genericBox = new GenericBox<>();

    genericBox.setContentA(4);
    genericBox.setContentB("Peter");

    Integer i3 = genericBox.getContentA();
    String s3 = genericBox.getContentB();
  }

}
