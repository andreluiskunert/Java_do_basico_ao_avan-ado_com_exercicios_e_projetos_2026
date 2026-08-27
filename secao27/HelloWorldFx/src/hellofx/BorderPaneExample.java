package hellofx;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
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
public class BorderPaneExample extends Application{
      // terça-feira_D'Noite,25/08/2026
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
    //  Criar borderpane
     BorderPane borderpane = new BorderPane();
        borderpane.setTop(btn1);
        borderpane.setBottom(btn2);
        borderpane.setLeft(btn3);
        borderpane.setRight(btn4);
        borderpane.setCenter(btn5);
        // substituir 1 pelo 6

        primaryStage.setTitle("Curso de Java com JavaFX ");
        primaryStage.setScene(new Scene(borderpane, 600, 400));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
    
}
