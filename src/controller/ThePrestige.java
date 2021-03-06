package controller;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class ThePrestige extends Application {

	public static void main(String[] args) { 
		launch(args);
	}

    @Override
    public void start(Stage primaryStage) throws Exception{
        Path currentRelativePath = Paths.get("");
        String path = currentRelativePath.toAbsolutePath().toString() + "\\src\\view\\TheStage.fxml";
        Parent root = FXMLLoader.load(new File(path).toURI().toURL());
        primaryStage.setOnCloseRequest(event -> primaryStage.close());
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setTitle("Wizard Hat ...");
        primaryStage.setScene(new Scene(root, 900, 670));
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}
