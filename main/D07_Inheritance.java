package main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import model.FlashLight;
import model.Light;
import model.TableLight;
import model.Toaster;
import model.WiredDevice;

/**
 * Vererbung und Polymorphie
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D07_Inheritance {

  @SuppressWarnings("unused")
  public static void main(String[] args) {

    /* Ansatz ohne Vererbung */
    List<TableLight> tableLights = new ArrayList<>();
    List<FlashLight> flashLights = new LinkedList<>();

    tableLights.add(new TableLight());
    tableLights.add(new TableLight());
    tableLights.add(new TableLight());

    flashLights.add(new FlashLight());
    flashLights.add(new FlashLight());
    flashLights.add(new FlashLight());

    for (TableLight t : tableLights) {
      t.switchOn();
      System.out.println(t);
      t.switchOff();
    }

    for (FlashLight f : flashLights) {
      f.switchOn();
      System.out.println(f);
      f.switchOff();
    }

    /* Ansatz mit Vererbung */
    ArrayList<Light> lights = new ArrayList<>();

    TableLight tableLight = new TableLight();
    FlashLight flashLight = new FlashLight();
    Light light;
    light = tableLight; // Upcast
    lights.add(light);
    light = flashLight; // Upcast
    lights.add(light);
    lights.add(new TableLight()); // Upcast
    lights.add(new FlashLight()); // Upcast

    for (Light l : lights) { // Dynamische Polymorphie
      l.switchOn();
      // bis Java 16
      if (l instanceof TableLight) {
        TableLight t = (TableLight) l; // Downcast
        t.plugIn();
      }
      // seit Java 16
      if (l instanceof FlashLight f) { // Downcast
        f.recharge();
      }
      System.out.println(l.isShining());
      System.out.println(l); // Statische Polymorphie
      l.switchOff();
    }

    ArrayList<WiredDevice> wiredDevices = new ArrayList<>();
    wiredDevices.add(new Toaster()); // Upcast
    wiredDevices.add(new TableLight()); // Upcast

    for (WiredDevice w : wiredDevices) {
      w.plugIn(); // Polymorphie
      if (w instanceof TableLight t) { // Downcast
        t.switchOn();
      }
      System.out.println(w);

    }

    List<Light> lights2 = List.of(new TableLight(), new FlashLight(), new TableLight(),
        new TableLight(), new TableLight(), new TableLight(), new TableLight(), new TableLight(),
        new TableLight(), new TableLight(), new TableLight());

  }

}
