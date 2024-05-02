package model;

/**
 * Taschenlampe
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public final class FlashLight extends Light {

  /* Attribute */
  private double energyLevel;

  /* Methoden */
  public FlashLight() {
    energyLevel = 1;
  }

  @Override
  public void switchOn() {
    isOn = true;
    energyLevel -= 0.1;
  }

  public void recharge() {
    energyLevel = 1;
  }

  @Override
  public boolean isShining() {
    return isOn && energyLevel > 0;
  }

  @Override
  public String toString() {
    return "FlashLight [isOn=" + isOn + ", energyLevel=" + energyLevel + "]";
  }

}
