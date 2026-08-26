package hellofx;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
public class VBoxHboxExample extends Application{
      // terça-feira_D'Noite,25/08/2026
   @Override
    public void start(Stage primaryStage) throws Exception{
        // Certifique-se de que o nome do arquivo aqui está exatamente igual ao seu
        // Criar botão
        Button btn1 = new Button("Botão 01");
        Button btn2 = new Button("Botão 02");
        Button btn3 = new Button("Botão 03");    
        VBox vbox = new VBox(15);
        vbox.getChildren().addAll(btn1, btn2, btn3);
        // Criar o hbox:
         Button btn4 = new Button("Botão 04");
        Button btn5 = new Button("Botão 05");
        Button btn6 = new Button("Botão 06"); 
        HBox hbox = new HBox(15);
        vbox.getChildren().addAll(btn4, btn5, btn6);
        VBox root = new VBox(15);
        root.getChildren().addAll(vbox, hbox);

        // StackPane root = new StackPane();
        // root.getChildren().add();
        // Criar cena
        Scene scene = new Scene(root, 500, 500);

        primaryStage.setTitle("Exemplo de Stage..");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
    
}
