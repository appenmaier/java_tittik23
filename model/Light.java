package model;

/**
 * Lampe
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public abstract class Light {

  /* Attribute */
  protected boolean isOn;

  /* Methoden */
  public void switchOn() {
    isOn = true;
  }

  public final void switchOff() {
    isOn = false;
  }

  public abstract boolean isShining();

  public boolean isOn() {
    return isOn;
  }

}
