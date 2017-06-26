/**
 * Created by ROM on 6/25/2017.
 */
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import javax.swing.*;

public class Main  extends Application implements EventHandler<ActionEvent>{

    Button button;
    public static void main(String[] args){
        launch(args);

    }
    @Override
    public void start(Stage primaryStage) throws Exception{
        //Main javafx code inside of the braces

        primaryStage.setTitle("Log In to password manager");
        button = new Button();
        button.setText("Click In");
        button.setOnAction(this);//this says that when ever the button is clicked it will call the handle method

        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void handle(ActionEvent event) {//when ever the button is clicked
        if(event.getSource()==button){
            System.out.println("Would you like to log in??");
        }

    }
}
