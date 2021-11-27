package application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application{
    
    public void start(Stage windows){
        //first view
        BorderPane firstBorderPane = new BorderPane();
        firstBorderPane.setTop(new Label("First view!"));
        Button button = new Button("To the second view!");
        firstBorderPane.setCenter(button);
        Scene firstScene = new Scene(firstBorderPane);
        
        //second view
        VBox vbox = new VBox();
        Button secondButton = new Button("To the third view!");
        Label text = new Label("Second view!");
        vbox.getChildren().addAll(secondButton, text);
        Scene secondScene = new Scene(vbox);
        
        //third view
        GridPane gridPane = new GridPane();
        Label secondText = new Label("Third view!");
        Button thirdButton = new Button("To the first view!");
        gridPane.add(secondText, 0, 0);
        gridPane.add(thirdButton, 1, 1);
        Scene thirdScene = new Scene(gridPane);
        
        //events
        button.setOnAction((event)-> {
            windows.setScene(secondScene);
        });
        
        secondButton.setOnAction((event) -> {
            windows.setScene(thirdScene);
        });
        
        thirdButton.setOnAction((event)-> {
            windows.setScene(firstScene);
        });
        
        
        
        windows.setScene(firstScene);
        windows.show();
        
        
    }

    public static void main(String[] args) {
        launch(MultipleViews.class);
    }

}
