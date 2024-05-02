package model;

/**
 * Tischleuchte
 *
 * @author Daniel Appenmaier
 * @version 3.0
 *
 */
public class TableLight extends Light implements WiredDevice {

  /* Attribute */
  private boolean isConnected;
  private LightBulb lightBulb;
  private final PlugType plugType;

  public PlugType getPlugType() {
    return plugType;
  }

  /* Methoden */
  public TableLight(PlugType plugType) {
    this.plugType = plugType;
  }

  public TableLight() {
    plugType = PlugType.TYPE_F;
    lightBulb = new LightBulb("weiss");
  }

  /**
   * Steckt die Tischleuchte ein
   */
  @Override
  public void plugIn() {
    isConnected = true;
  }

  /**
   * Steckt die Tischleuchte aus
   */
  @Override
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

  @Override
  public boolean isShining() {
    // if (isOn == true && isConnected == true && lightBulb != null) {
    // return true;
    // } else {
    // return false;
    // }
    return isOn && isConnected && lightBulb != null;
  }

  public boolean isConnected() {
    return isConnected;
  }

  public LightBulb getLightBulb() {
    return lightBulb;
  }

  @Override
  public String toString() {
    return "TableLight [isOn=" + isOn + ", isConnected=" + isConnected + ", lightBulb=" + lightBulb
        + ", plugType=" + plugType + "]";
  }

}
