package main;

import model.LightBulb;
import model.TableLight;

/**
 * Klassen, Attribute, Methoden und Objekte
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D02_Objects {

  public static void main(String[] args) {

    LightBulb blueLightBulb = new LightBulb("blau");

    TableLight tableLight1 = new TableLight();
    tableLight1.switchOn();
    tableLight1.plugIn();
    tableLight1.changeLightBulb(blueLightBulb);

    boolean isShining = tableLight1.isShining();
    LightBulb lightBulb = tableLight1.getLightBulb();
    String color = lightBulb.getColor();
    System.out.println(isShining ? "Die Leuchte leuchtet in der Farbe " + color : "Dunkel");
    System.out.println(
        isShining ? "Die Leuchte leuchtet in der Farbe " + tableLight1.getLightBulb().getColor()
            : "Dunkel");

  }

}
