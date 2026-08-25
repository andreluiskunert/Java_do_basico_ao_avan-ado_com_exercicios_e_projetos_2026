package hellofx;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.*;;;

public class StageSceneExample extends Application {
    // Segunda-feira_D'Noite,24/08/2026
   @Override
    public void start(Stage primaryStage) throws Exception{
        // Certifique-se de que o nome do arquivo aqui está exatamente igual ao seu
        // Criar botão
        Button btn = new Button("cliqe aqui");
        // Criar layout  + botão
        StackPane root = new StackPane();
        root.getChildren().add(btn);
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
