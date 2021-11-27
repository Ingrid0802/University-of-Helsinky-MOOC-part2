package buttonandtextfield;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.control.TextField;

public class ButtonAndTextFieldApplication extends Application {
    
    public void start(Stage window){
        Button buttonComponent = new Button("Button");
        TextField textFieldComponent = new TextField("Text field");
        
        FlowPane componentGroup = new FlowPane();
        componentGroup.getChildren().add(buttonComponent);
        componentGroup.getChildren().add(textFieldComponent);
        
        Scene view = new Scene(componentGroup);
        
        window.setScene(view);
        window.show();
        
    }
    
    public static void main(String[] args) {
        launch(ButtonAndTextFieldApplication.class);
    }

}
