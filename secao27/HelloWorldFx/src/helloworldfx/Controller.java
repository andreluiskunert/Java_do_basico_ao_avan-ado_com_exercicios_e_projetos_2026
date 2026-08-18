package secao27.HelloWorldFx.src.helloworldfx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private Label label;

    @FXML
    public void initialize() {
        label.setText("Olá Mundo JavaFX!");
    }
}