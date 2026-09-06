// Sábado_D'noite,05/09/2028
package hellofx;
import javafx.application.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.*;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.stage.*;


public class  CanvasExample extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Canvas canvas = new Canvas(450, 450);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        // Desenhar...
        drawShapes(gc);

        VBox vbox = new VBox(10);

        vbox.getChildren().addAll(canvas);

        // configuração do Stage
        Scene scene = new Scene(vbox, 500, 500);

        primaryStage.setTitle("Curso de Java_2026_HoradeCordar_JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

     private  void  drawShapes(GraphicsContext gc){
        // Desenhar linha
        gc.setStroke(Color.BLUE);
        gc.setLineWidth(2);
        gc.strokeLine(50, 50, 350, 50);
        // Desenhar retangulo
        gc.setFill(Color.LIGHTBLUE);
        gc.fillRect(100, 100, 250, 150);
        // Desenhar Circulo:
        gc.setStroke(Color.RED);
        gc.strokeOval(250, 300, 100, 100);

     }

    public static void main(String[] args) {
        launch(args);
    }
}



