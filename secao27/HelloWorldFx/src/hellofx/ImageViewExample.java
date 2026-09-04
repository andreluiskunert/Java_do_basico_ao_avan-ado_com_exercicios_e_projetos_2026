


// Quinta-feira_D'noite,03/09/2028
package hellofx;
import javafx.application.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.*;


public class  ImageViewExample  extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        
      Image image = new Image("file:secao27/HelloWorldFx/src/hellofx/image.png");
      ImageView imageview = new ImageView(image);
      imageview.setFitWidth(200);
      imageview.setFitHeight(300);
      imageview.setPreserveRatio(true);
  VBox vbox = new VBox(10);
   vbox.getChildren().addAll(imageview);
            // configuração do Stage
            Scene scene = new Scene(vbox, 500, 500);
        primaryStage.setTitle("_Curso de Java_Hora de Codar_JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void showAlert(AlertType alertType, String title, String message ){
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);

        alert.showAndWait();
    }


    public static void main(String[] args) {
        launch(args);
    }
}



