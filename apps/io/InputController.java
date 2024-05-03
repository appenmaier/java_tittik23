package apps.io;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class InputController {

  @FXML
  private TextField valueTextField;
  private Model model;

  @FXML
  public void goToOutput(ActionEvent event) throws IOException {
    System.out.println(event.getSource() + " wurde betätigt");
    String value = valueTextField.getText();
    System.out.println(value);

    model = Model.getInstance();
    System.out.println(model);
    model.setValue(value);

    Parent root = FXMLLoader.load(getClass().getResource("OutputView.fxml"));
    Scene scene = new Scene(root);
    Node node = (Node) event.getSource();
    Stage primaryStage = (Stage) node.getScene().getWindow();
    primaryStage.setScene(scene);
    primaryStage.show();
  }

}
