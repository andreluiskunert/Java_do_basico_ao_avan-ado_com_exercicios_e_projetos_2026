package hellofx;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import secao11.loops;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.*;;;
public class CheckboxRadioButtonExample extends Application{
      // Sexta-feira _D'noite,28/08/2026
   @Override
    public void start(Stage primaryStage) throws Exception{
        // checkBox
        CheckBox checkBox1 = new CheckBox("Opção 01");
        CheckBox checkBox2 = new CheckBox("Opção 02");
        
     Label checkBoxLabel = new Label("Checkbox selecionados:");
     checkBox1.setOnAction( event -> updatecheckboxLabel(checkBox1, checkBox2, checkBoxLabel) );
    checkBox2.setOnAction( event -> updatecheckboxLabel(checkBox1, checkBox2, checkBoxLabel) );
    // Button
       RadioButton radioButton1 = new RadioButton("Opção A");
       RadioButton radioButton2 = new RadioButton("Opção B");
     
       ToggleGroup toggleGroup = new ToggleGroup();
       radioButton1.setToggleGroup(toggleGroup);
       radioButton2.setToggleGroup(toggleGroup);
    Label radioLabel = new Label("Checkbox selecionados:");
    toggleGroup.selectedToggleProperty().addListener((observable, oldValue, newValue)->{
          if(newValue != null) {
                RadioButton selecteRadioButton = (RadioButton) toggleGroup.getSelectedToggle();

                radioLabel.setText("Radio button Selecionado: " + selecteRadioButton.getText());
            }
    });

      

        VBox vbox1 = new VBox();
        vbox1.getChildren().addAll(checkBoxLabel, checkBox1, checkBox2,radioLabel ,radioButton1, radioButton2 );

        primaryStage.setTitle("Curso de Java com JavaFX ");
        primaryStage.setScene(new Scene(vbox1, 600, 400));
        primaryStage.show();
    }
    public void updatecheckboxLabel(CheckBox cb1, CheckBox cb2, Label  label){
         String selected = "Checkbox selecionados:";
         if(cb1.isSelected()) selected += cb1.getText() + " ";
         if(cb2.isSelected()) selected += cb2.getText();
         label.setText(selected);

    }

    public static void main(String[] args) {
        launch(args);
    }
    
    
}
