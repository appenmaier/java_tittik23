package apps.io;

public class Model {

  /* Singleton */
  private static Model instance;

  private Model() {}

  public static Model getInstance() {
    if (instance == null) {
      instance = new Model();
    }
    return instance;
  }

  /* Model */
  private String value;

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

}
