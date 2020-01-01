package q2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Bibliotheque extends Application {

	private List<Livre> livres = new ArrayList<Livre>();
	
	/**
	 * Constructeurs par défaut
	 */
	public Bibliotheque() {
		livres.add(new Livre("Plk", "Dingue"));
		livres.add(new Livre("Plk", "Pas les mêmes"));
		livres.add(new Livre("Plk", "Monégasque"));
		livres.add(new Livre("Plk", "Ténébreux"));
	}
	
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Bibliotheque.class.getResource("BibliothequeGui.fxml"));
			
			AnchorPane root = (AnchorPane) loader.load();
			
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.show();
			
			BibliothequeController controller = loader.getController();
			controller.setBibliotheque(this);
			controller.showBibliothequeDetails();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * @return the livres
	 */
	public List<Livre> getLivres() {
		return livres;
	}

	/**
	 * @param livres the livres to set
	 */
	public void setLivres(List<Livre> livres) {
		this.livres = livres;
	}

	/**
	 * @return la liste des livres
	 */
	public String listeLivres() {
		String liste = "";
		for(Livre livre : livres) {
			liste += "\t" + livre + "\n";
		}
		return "Nombre de livre: " + livres.size() + "\n" + liste;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);		
	}
}
