package hellofx;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.*;;;
public class   StackPaneExample extends Application{
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
        // stackpane
       StackPane stackPane = new StackPane();
        StackPane stackPane1 = new StackPane();

        stackPane1.getChildren().addAll(btn1, btn2);

        Scene stackpScene = new Scene(stackPane1, 400, 400);
 // criar o anchorpane
        AnchorPane anchorPane = new AnchorPane();

        AnchorPane.setTopAnchor(btn3, 10.0);
        AnchorPane.setRightAnchor(btn3, 10.0);

        anchorPane.getChildren().add(btn3);

        Scene anchorScene = new Scene(anchorPane, 400, 400);

        // configuração do Stage
        primaryStage.setTitle("__Curso de Java com JavaFX_");
        Scene stackScene = null;
        primaryStage.setScene(stackScene);
        primaryStage.show();

        // mudar a cena apos 2seg
        new Thread(() -> {
             try {
                Thread.sleep(2000);

                Platform.runLater(() -> primaryStage.setScene(anchorScene));
            } catch (Exception e) {
                System.out.println("Aqui tdeu certo");
            }
        }).start();
    }
    

    public static void main(String[] args) {
        launch(args);
    }
    
    
}
