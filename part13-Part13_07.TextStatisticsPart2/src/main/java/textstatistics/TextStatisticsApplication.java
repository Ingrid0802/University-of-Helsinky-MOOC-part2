package textstatistics;
import java.util.Arrays;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TextStatisticsApplication extends Application{

    public void start(Stage window){
        BorderPane layout = new BorderPane();
        TextArea textArea = new TextArea();
        layout.setCenter(textArea);
        
        HBox texts = new HBox();
        Label label1 = new Label("Letters: 0");
        Label label2 = new Label("Words: 0");
        Label label3 = new Label("The longest word is: ");
        
        texts.getChildren().addAll(label1, label2, label3);
        
        layout.setBottom(texts);
        
        Scene view = new Scene(layout);
        window.setScene(view);
        window.show();
        
        textArea.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            String[]parts = newValue.split(" ");
            int words = parts.length;
            String longest = Arrays.stream(parts)
                .sorted((s1, s2) -> s2.length() - s1.length())
                .findFirst()
                .get();
            
            //set values of text elements
            label1.setText("Letters: " + String.valueOf(characters));
            label2.setText("Words: " + String.valueOf(words));
            label3.setText("The longest word is: " + longest);
            });
        
    }

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

}
