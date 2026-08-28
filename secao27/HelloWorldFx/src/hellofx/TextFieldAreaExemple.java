
package hellofx;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import secao11.loops;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.*;;;
public class TextFieldAreaExemple extends Application{
      // Sexta-feira _D'tarde,28/08/2026
   @Override
    public void start(Stage primaryStage) throws Exception{
    //    TextField
    TextField textField = new TextField();
        textField.setPromptText("What's your name? please");
           TextField textField2 = new TextField();
        textField2.setPromptText("How old are you, please?");
         VBox    vbox = new VBox();
        vbox.getChildren().addAll(textField, textField2);
            // limitar os caracteres
        textField2.textProperty().addListener((observable, oldValue, newValue) -> {
            if(newValue.length() > 3) {
                textField2.setText(oldValue);
            }
        });

        // textarea
        TextArea textArea = new TextArea();
        textArea.setPromptText("Escreva como foi o seu dia");
        textArea.setPrefRowCount(5);

        Label label = new Label("Texto do textArea:");

        textArea.textProperty().addListener((observable, oldValue, newValue) -> {
            label.setText("Texto do textArea: " + newValue);
        });

        VBox vbox1 = new VBox();
        vbox1.getChildren().addAll(textField, textField2, textArea, label);

        primaryStage.setTitle("Curso de Java com JavaFX ");
        primaryStage.setScene(new Scene(vbox1, 600, 400));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
    
}
