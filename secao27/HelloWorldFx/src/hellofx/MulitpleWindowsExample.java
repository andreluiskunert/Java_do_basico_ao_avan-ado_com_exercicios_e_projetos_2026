

// Quarta-feira_D'noite,02/09/2028
package hellofx;
import javafx.application.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;


public class MulitpleWindowsExample extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        
        Button button = new Button("Abrir Janela");

        

        StackPane primaryLayout = new StackPane();
        primaryLayout.getChildren().add(button);
         Scene primaryScene = new Scene(primaryLayout, 300, 300);
        // Scene scene = new Scene(vbox, 500, 500);
      
            // configuração do Stage
        primaryStage.setTitle("_Curso de Java_Hora de Codar_JavaFX");
        primaryStage.setScene(primaryScene);
        primaryStage.show();
    }

   public void openSecundaryWindow(){
      
       Stage secondaryStage = new Stage();

        Label label = new Label("Janela secundária");

        StackPane secondaryLayout = new StackPane();

        secondaryLayout.getChildren().add(label);

        Scene secondaryScene = new Scene(secondaryLayout, 400, 400);

        secondaryStage.setTitle("Janela secundária");
        secondaryStage.setScene(secondaryScene);
        secondaryStage.show();
   }

    public static void main(String[] args) {
        launch(args);
    }
}



