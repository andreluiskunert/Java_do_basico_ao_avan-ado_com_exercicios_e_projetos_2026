
// Terça-feira_D'noite,01/09/2028
package hellofx;
import javafx.application.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;


public class CSSTtylingExample extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        
        
        Label label = new Label("Usei seu teclado.");
  Label label1 = new Label("Label estilizada");

        label1.getStyleClass().add("label-custom");


        Button button = new Button("Botão estilizado");

        button.getStyleClass().add("button-custom");


        VBox vbox = new VBox(10);

        vbox.getChildren().addAll(label1, button);
        // Criando uma cena com o layout
        Scene scene = new Scene(vbox, 500, 500);
      
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());

        // configuração do Stage
        primaryStage.setTitle("_Curso de Java_Hora de Codar_JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void updateCheckboxLabel(CheckBox cb1, CheckBox cb2, Label label) {

        String selected = "Checkbox selecionados: ";
        if(cb1.isSelected()) selected += cb1.getText() + " ";
        if(cb2.isSelected()) selected += cb2.getText();

        label.setText(selected);

    }


    public static void main(String[] args) {
        launch(args);
    }
}



