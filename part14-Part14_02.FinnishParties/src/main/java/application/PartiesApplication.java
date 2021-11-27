package application;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;


public class PartiesApplication extends Application{
    private HashMap<String, HashMap<Integer, Double>> values;
    
    public PartiesApplication(){
        this.values = readFile("partiesdata.tsv");
        
    }
    
    public void start(Stage stage){
        NumberAxis xAxis = new NumberAxis(1968, 2008, 4);
        NumberAxis yAxis = new NumberAxis(0, 30, 5);
        
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Relative support of the parties");
        
        values.keySet().stream().forEach(party -> {
            XYChart.Series data = new XYChart.Series();
            data.setName(party);
            values.get(party).entrySet().stream().forEach(pair -> {
                data.getData().add(new XYChart.Data(pair.getKey(), pair.getValue()));
            });
            lineChart.getData().add(data);
        });
        
        Scene view = new Scene(lineChart, 400, 300);
        stage.setScene(view);
        stage.show();
    }
    
    private HashMap<String, HashMap<Integer, Double>> readFile(String filename){
        HashMap<String, HashMap<Integer, Double>> values1 = new HashMap<>();
        ArrayList<Integer> years = new ArrayList<>();
        
        try(Scanner data = new Scanner(Paths.get(filename))){
            String row = data.nextLine();
            String[] parts = row.split("\t");
            for(int i = 1; i < parts.length; i++){
                years.add(Integer.parseInt(parts[i]));
            }
            
            while(data.hasNext()){
                String next = data.nextLine();
                parts = next.split("\t");
                String party = parts[0];
                HashMap<Integer, Double> map = new HashMap<>();
                for(int i = 1; i < parts.length; i++){
                    if(!parts[i].equals("-")){
                        int year = years.get(i-1);
                        String val = parts[i];
                        double number = Double.parseDouble(val);
                        map.put(year, number);
                        
                    }
                }
                values1.put(party, map);
            }
        } catch(Exception e){
            System.out.println("Error: " + e.toString());
        }
        
        return values1;
    }

    public static void main(String[] args) {
        launch(PartiesApplication.class);
       
    }

}
