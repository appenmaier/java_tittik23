package model;

/**
 * Steckertyp
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public enum PlugType {

  TYPE_F("Type F", "CEE 7/4", "Europe"), TYPE_B("Type B", "NEMA-5", "North America");

  private final String description;
  private final String norm;
  private final String region;

  PlugType(String description, String norm, String region) {
    this.description = description;
    this.norm = norm;
    this.region = region;
  }

  public String getDescription() {
    return description;
  }

  public String getNorm() {
    return norm;
  }

  public String getRegion() {
    return region;
  }

  @Override
  public String toString() {
    return "PlugType [description=" + description + ", norm=" + norm + ", region=" + region + "]";
  }

}
