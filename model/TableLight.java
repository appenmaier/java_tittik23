package model;

/**
 * Tischleuchte
 *
 * @author Daniel Appenmaier
 * @version 2.0
 *
 */
public class TableLight {

  /* Attribute */
  private boolean isOn;
  private boolean isConnected;
  private LightBulb lightBulb;

  /* Methoden */
  /**
   * Schaltet die Tischleuchte ein
   */
  public void switchOn() {
    isOn = true;
  }

  /**
   * Schaltet die Tischleuchte aus
   */
  public void switchOff() {
    isOn = false;
  }

  /**
   * Steckt die Tischleuchte ein
   */
  public void plugIn() {
    isConnected = true;
  }

  /**
   * Steckt die Tischleuchte aus
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

  public boolean isShining() {
    // if (isOn == true && isConnected == true && lightBulb != null) {
    // return true;
    // } else {
    // return false;
    // }
    return isOn && isConnected && lightBulb != null;
  }

  public boolean isOn() {
    return isOn;
  }

  public boolean isConnected() {
    return isConnected;
  }

  public LightBulb getLightBulb() {
    return lightBulb;
  }

}
