package question2;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AppLabo extends Application {

	Experience experience;
	Stage primaryStage;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			experience = new Experience();
			experience.ajouterMesure(2.0);
			experience.ajouterMesure(5.0);
			experience.ajouterMesure(5.5);
			experience.ajouterMesure(6.0);
			experience.ajouterMesure(-3.0);
			experience.ajouterMesure(-2.2);
			
			this.primaryStage = primaryStage;
			
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(AppLabo.class.getResource("LaboratoireGUI.fxml"));
			
			AnchorPane anchorePane;
			anchorePane = (AnchorPane) loader.load();
			
			Scene scene = new Scene(anchorePane);
			this.primaryStage.setScene(scene);
			this.primaryStage.show();
			
			LaboratoireGUIController controller = loader.getController();
			controller.setExperience(experience);
			controller.setAppLabo(this);
			controller.showExperienceDetail();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
