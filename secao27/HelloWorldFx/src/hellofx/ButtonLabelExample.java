package hellofx;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
public class ButtonLabelExample  extends Application{
      // Sexta-feira _D'tarde,28/08/2026
   @Override
    public void start(Stage primaryStage) throws Exception{
        Label label = new Label("Aqui tem uma Label");
        Button button = new Button("Clicar");
        // evento no button
        button.setOnAction(event -> label.setText("Clicou no botão"));
        VBox    vbox = new VBox();
        vbox.getChildren().addAll(label, button);

   
        primaryStage.setTitle("Curso de Java com JavaFX ");
        primaryStage.setScene(new Scene(vbox, 600, 400));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
    
}
