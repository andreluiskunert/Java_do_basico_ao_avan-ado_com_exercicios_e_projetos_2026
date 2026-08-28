
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
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.*;;;
public class  GridPanExample extends Application{
      // Quinta-feira _D'Noite,27/08/2026
   @Override
    public void start(Stage primaryStage) throws Exception{
        // Certifique-se de que o nome do arquivo aqui está exatamente igual ao seu
        // Criar botão
        Button btn1 = new Button("Botão 01");
        Button btn2 = new Button("Botão 02");
        Button btn3 = new Button("Botão 03");    
        Button btn4 = new Button("Botão 04");
        Button btn5 = new Button("Botão 05");
        Button btn6 = new Button("Botão 06"); 
        // gridpane
        GridPane gridPane = new GridPane();
         gridPane.add(btn1, 2, 3);
         gridPane.add(btn2, 0, 0);
         gridPane.add(btn3, 1, 7);
         gridPane.add(btn4, 5, 4);
         gridPane.add(btn5, 4, 5);
         gridPane.add(btn6, 5, 5);
   
        primaryStage.setTitle("Curso de Java com JavaFX_Gridpane ");
        primaryStage.setScene(new Scene(gridPane, 600, 400));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
    
}
