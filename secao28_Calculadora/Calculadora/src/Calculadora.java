import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.input.*;
import javafx.geometry.Insets;
public class   Calculadora extends Application{
      // Terça-feira _D'Noite,08/09/2026
      private  Label display = new Label("");
      private String currentInput = "";
      private String operador = "";
      private double previousVale = 0;

   @Override
    public void start(Stage primaryStage) throws Exception{
       
 primaryStage.setTitle("Calculadora simples");

        // Layout principal
        VBox root = new VBox();
        root.setPadding(new Insets(20));
        root.setSpacing(10);
        //  Exibir
        Scene scene = new Scene(root,300, 400);
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();

       
    }
    

    public static void main(String[] args) {
        launch(args);
    }
    
    
}
 