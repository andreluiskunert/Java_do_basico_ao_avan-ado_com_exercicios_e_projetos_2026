// import javafx.animation.*;
// import javafx.application.*;
// import javafx.stage.*;
// import javafx.util.Duration;
// import javafx.scene.*;
// import javafx.scene.control.*;
// import javafx.scene.layout.*;
// import javafx.scene.input.*;
// import javafx.geometry.Insets;


// public class Quiz extends Application {

//     private int currentQuestion = 0;
//     private int score = 0;

//     // Perguntas e Respostas
//     private String[] questions = {
//         "Qual é a capital da França?",
//         "Quem escreveu 'Dom Quixote'?",
//         "Qual é o maior planeta do sistema solar?"
//     };

//     private String[][] options = {
//         {"Paris", "Londres", "Roma", "Berlim"},
//         {"Miguel de Cervantes", "William Shakespeare", "Mark Twain", "Jorge Amado"},
//         {"Terra", "Marte", "Júpiter", "Saturno"}
//     };

//     // Indices das respostas
//     private int[] correctAnswers = {0, 0, 2};

//     private Label questionLabel;
//     private ToggleGroup toggleGroup;
//     private VBox root;

//     @Override
//     public void start(Stage primaryStage) throws Exception{

//         primaryStage.setTitle("Quiz");

//         // Layout principal
//         root = new VBox();
//         root.setPadding(new Insets(20));
//         root.setSpacing(10);

//         // Mostrar a pergunta
//         questionLabel = new Label(questions[currentQuestion]);
//         questionLabel.getStyleClass().add("label");
//         root.getChildren().add(questionLabel);

//         // Adicionar as opções de resposta
//         toggleGroup = new ToggleGroup();

//         for(String option : options[currentQuestion]) {
//             RadioButton radioButton = new RadioButton(option);
//             radioButton.setToggleGroup(toggleGroup);
//             radioButton.getStyleClass().add("radio-button");
//             root.getChildren().add(radioButton);
//         }

//         // Botão para prox. pergunta
//         Button nextButton = new Button("Próxima");
//         // evento
//         nextButton.setOnAction(e -> handleNextQuestion());
//         nextButton.getStyleClass().add("button");
//         root.getChildren().add(nextButton);

//         // Configurar a cena
//         Scene scene = new Scene(root, 600, 450);
//         scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
//         primaryStage.setScene(scene);
//         primaryStage.show();
 
//     }

//     private void handleNextQuestion() {

//         RadioButton selectedRadioButton = (RadioButton) toggleGroup.getSelectedToggle();

//         if(selectedRadioButton != null) {

//             int selectedIndex = getSelectedIndex();

//             if(selectedIndex == correctAnswers[currentQuestion]) {
//                 score++;
//             }

//             // mudar de pergunta
//             currentQuestion++;

//             if(currentQuestion < questions.length) {
//                 // atualizar para nova pergunta
//                 updateQuestion();
//             } else {
//                 // mostrar resultado
//                 showScore();
//             }

//         }

//     }

//     private void updateQuestion() {

//         //atualizar a questao
//         questionLabel.setText(questions[currentQuestion]);

//         // remover as opcoes anteriores
//         root.getChildren().removeIf(node -> node instanceof RadioButton);

//         // adicionar as novas opcoes
//         toggleGroup = new ToggleGroup();

//         // inverter array
//         String[] reversedOptions = new String[options[currentQuestion].length];

//         for(int i = 0; i < options[currentQuestion].length; i++) {
//             reversedOptions[i] = options[currentQuestion][options[currentQuestion].length - 1 - i];
//         }

//         for(String option : reversedOptions) {
//             RadioButton radioButton = new RadioButton(option);
//             radioButton.setToggleGroup(toggleGroup);
//             radioButton.getStyleClass().add("radio-button");
//             // label = 0; opcoes = 1; botao = 2;
//             root.getChildren().add(1, radioButton);
//         }
//     }

//     private void showScore() {
//         root.getChildren().clear();
//         Label scoreLabel = new Label("Sua pontuação foi de " + score + " de um total de " + questions.length);
//         root.getChildren().add(scoreLabel);
//     }

//     private int getSelectedIndex() {
//         RadioButton selectedRadioButton = (RadioButton) toggleGroup.getSelectedToggle();
//         return root.getChildren().indexOf(selectedRadioButton) - 1;
//     }

//     public static void main(String[] args) {
//         launch(args);
//     }
// }

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;

public class Quiz extends Application {

    private int currentQuestion = 0;
    private int score = 0;

    // Perguntas
    private String[] questions = {
        "Qual é a capital da França?",
        "Quem escreveu 'Dom Quixote'?",
        "Qual é o maior planeta do sistema solar?"
    };

    // Opções
    private String[][] options = {
        {"Paris", "Londres", "Roma", "Berlim"},
        {"Miguel de Cervantes", "William Shakespeare", "Mark Twain", "Jorge Amado"},
        {"Terra", "Marte", "Júpiter", "Saturno"}
    };

    // Índices das respostas corretas
    private int[] correctAnswers = {0, 0, 2};

    private Label questionLabel;
    private ToggleGroup toggleGroup;
    private VBox root;
    private Button nextButton;

    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("Quiz JavaFX");

        // Layout principal
        root = new VBox();
        root.setPadding(new Insets(20));
        root.setSpacing(10);

        // Pergunta
        questionLabel = new Label();
        questionLabel.setStyle("-fx-font-size: 20px; -fx-font-weight: bold;");

        root.getChildren().add(questionLabel);

        // Botão
        nextButton = new Button("Próxima");
        nextButton.setOnAction(e -> handleNextQuestion());

        root.getChildren().add(nextButton);

        // Mostrar primeira pergunta
        updateQuestion();

        // Cena
        Scene scene = new Scene(root, 600, 450);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void updateQuestion() {

        // Atualiza a pergunta
        questionLabel.setText(questions[currentQuestion]);

        // Remove os RadioButtons antigos
        root.getChildren().removeIf(node -> node instanceof RadioButton);

        // Novo grupo
        toggleGroup = new ToggleGroup();

        // Adiciona as opções
        for (String option : options[currentQuestion]) {

            RadioButton radioButton = new RadioButton(option);

            radioButton.setToggleGroup(toggleGroup);

            radioButton.setStyle("-fx-font-size: 16px;");

            // Coloca depois da pergunta
            root.getChildren().add(
                root.getChildren().size() - 1,
                radioButton
            );
        }
    }

    private void handleNextQuestion() {

        // Verifica se uma opção foi selecionada
        if (toggleGroup.getSelectedToggle() == null) {

            Alert alert = new Alert(
                Alert.AlertType.WARNING
            );

            alert.setTitle("Atenção");
            alert.setHeaderText(null);
            alert.setContentText(
                "Selecione uma resposta antes de continuar."
            );

            alert.showAndWait();

            return;
        }

        // Obtém a resposta selecionada
        RadioButton selectedRadioButton =
            (RadioButton) toggleGroup.getSelectedToggle();

        String selectedAnswer =
            selectedRadioButton.getText();

        // Descobre o índice da resposta
        int selectedIndex = -1;

        for (int i = 0; i < options[currentQuestion].length; i++) {

            if (options[currentQuestion][i].equals(selectedAnswer)) {

                selectedIndex = i;

                break;
            }
        }

        // Verifica resposta
        if (selectedIndex == correctAnswers[currentQuestion]) {
            score++;
        }

        // Próxima pergunta
        currentQuestion++;

        if (currentQuestion < questions.length) {

            updateQuestion();

        } else {

            showScore();
        }
    }

    private void showScore() {

        root.getChildren().clear();

        Label scoreLabel = new Label(
            "Sua pontuação foi de "
            + score
            + " de "
            + questions.length
        );

        scoreLabel.setStyle(
            "-fx-font-size: 24px; -fx-font-weight: bold;"
        );

        root.getChildren().add(scoreLabel);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
