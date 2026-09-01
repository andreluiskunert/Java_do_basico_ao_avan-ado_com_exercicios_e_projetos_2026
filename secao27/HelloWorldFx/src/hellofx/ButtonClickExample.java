package hellofx;
import javafx.application.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;


public class ButtonClickExample extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        
        
        Label label = new Label("Clique no botão pra observa o Resultado.");
        Button button = new Button("Clique Aqui");
         button.setOnAction(event ->{
            label.setText("Curioso né....");
         });
     
        VBox vbox = new VBox();
        vbox.getChildren().addAll(label, button);

        // Criando uma cena com o layout
        Scene scene = new Scene(vbox, 500, 500);

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



