package model;

/**
 * Tischleuchte
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class TableLight {

  /* Attribute */
  public boolean isOn;
  public boolean isConnected;
  public LightBulb lightBulb;

  /* Methoden */
  /**
   * Schaltet die Leuchte ein
   */
  public void switchOn() {
    isOn = true;
  }

  /**
   * Schaltet die Leuchte aus
   */
  public void switchOff() {
    isOn = false;
  }

  /**
   * Steckt die Leuchte ein
   */
  public void plugIn() {
    isConnected = true;
  }

  /**
   * Steckt die Leuchte aus
   */
  public void pullThePlug() {
    isConnected = false;
  }

  /**
   * Wechselt die Glühbirne
   *
   * @param newLightBulb neue Glühbirne
   * @return alte Glühbirne
   *
   */
  public LightBulb changeLightBulb(LightBulb newLightBulb) {
    LightBulb oldLightBulb = lightBulb;
    lightBulb = newLightBulb;
    return oldLightBulb;
  }

  /**
   * Leuchtet die Leuchte?
   *
   * @return Leuchte leuchtet
   */
  public boolean isShining() {
    // if (isOn == true && isConnected == true && lightBulb != null) {
    // return true;
    // } else {
    // return false;
    // }

    return isOn && isConnected && lightBulb != null;
  }

}
