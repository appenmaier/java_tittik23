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

    LightBulb blueLightBulb = new LightBulb();
    blueLightBulb.color = "blau";

    TableLight tableLight1 = new TableLight();
    tableLight1.switchOn();
    tableLight1.plugIn();
    tableLight1.changeLightBulb(blueLightBulb);
    tableLight1.switchOff();

    boolean isShining = tableLight1.isShining();
    String color = tableLight1.lightBulb.color;
    System.out.println(isShining ? "Die Leuchte leuchtet in der Farbe " + color : "Dunkel");

  }

}
