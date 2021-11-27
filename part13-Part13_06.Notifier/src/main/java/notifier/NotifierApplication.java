package notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NotifierApplication extends Application{
    
    public void start(Stage window){
        TextField upperText = new TextField();
        Button button = new Button("Update");
        Label label = new Label();
        
        VBox componentGroup = new VBox();
        componentGroup.getChildren().addAll(upperText,button,label);
        
        button.setOnAction((event)->{
                label.setText(upperText.getText());
        });
        
        
        
        Scene scene = new Scene(componentGroup);
        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

}
