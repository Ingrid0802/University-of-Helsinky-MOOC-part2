package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JokeApplication extends Application{
    
    public void start(Stage window) {
        
        // create main layout
        BorderPane layout = new BorderPane();
        
        // create menu for main layout
        HBox menu = new HBox();
        
        // create buttons for menu
        Button firstButton = new Button("Joke");
        Button secondButton = new Button("Answer");
        Button thirdButton = new Button("Explanation");
        
        menu.getChildren().addAll(firstButton, secondButton, thirdButton);
        
        layout.setTop(menu);
        
        //create subview layout
        StackPane firstLayout = createView("What do you call a bear with no teeth?");
        StackPane secondLayout = createView("A gummy bear.");
        StackPane thirdLayout = createView("Gummy bears cannot bite you");
        
        //event handleing -> pressing the buttons will change the view
        firstButton.setOnAction((event) -> layout.setCenter(firstLayout));
        secondButton.setOnAction((event) -> layout.setCenter(secondLayout));
        thirdButton.setOnAction((event) -> layout.setCenter(thirdLayout));
        
        // set initial view
        layout.setCenter(firstLayout);
        
        Scene scene = new Scene(layout);
        
        window.setScene(scene);
        window.show();
    }
    
    private StackPane createView(String text){
        StackPane layout = new StackPane();
        layout.setPrefSize(300, 180);
        layout.getChildren().add(new Label(text));
        layout.setAlignment(Pos.CENTER);
        
        return layout;
    }


    public static void main(String[] args) {
        launch(JokeApplication.class);
    }
}
