package shape;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;



public class MyJavaFX extends Application {
    public void start(Stage primaryStage){
        Button btOK = new Button("OK");
        Scene scene = new Scene(btOK, 200, 250);
        primaryStage.setTitle("MyJavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args){
        //GeometricObject c = new Circle(1, "white",true);
        //c.setColor("black");
        //c.setFilled(false);

        //System.out.println(c.toString());

        Application.launch(args);
    }
}
