package smiley;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SmileyApplication extends Application{
    
    public void start(Stage window){
        Canvas canvas = new Canvas(300, 300);
        GraphicsContext graphics = canvas.getGraphicsContext2D();
        
        draw(graphics);
        
        BorderPane layout = new BorderPane();
        layout.setCenter(canvas);
        
        Scene view = new Scene(layout);
        
        window.setScene(view);
        window.show();
        
        
    }
    
    public void draw(GraphicsContext gc){
        gc.setFill(Color.BLACK);
        //left eye
        gc.fillRect(70, 60, 25, 25);
        //right eye
        gc.fillRect(200, 60, 25, 25);
        //mouth
        gc.fillRect(75, 200, 150, 25);
        //left mouth side
        gc.fillRect(75, 175, 25, 25);
        //right mouth side
        gc.fillRect(200, 175, 25, 25);
    }

    public static void main(String[] args) {
        launch(SmileyApplication.class);
    }

}
