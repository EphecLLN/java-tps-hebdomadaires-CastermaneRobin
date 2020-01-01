/**
 * 
 */
package q2;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * @author robin
 *
 */
public class BibliothequeController {

	@FXML
	private TextField titreField;
	@FXML
	private TextField auteurField;
	@FXML
	private TextArea allText;
	
	Bibliotheque bibliotheque;

	/**
	 *  constructeur par défaut
	 */
	public BibliothequeController() {
		super();
	}
	
	/**
	 * @param bibli
	 */
	public void setBibliotheque(Bibliotheque bibli) {
		this.bibliotheque = bibli;
	}
	
	public void showBibliothequeDetails() {
		allText.setEditable(false);
		allText.setText(bibliotheque.listeLivres());
	}
	
	public void handleEncoder() {
		Livre livre = new Livre();
		livre.setAuteur(auteurField.getText());
		livre.setNom(titreField.getText());
		
		if(auteurField.getText() != null && auteurField.getText().length() > 0) {
			if(titreField.getText() != null && titreField.getText().length() > 0) {
				bibliotheque.getLivres().add(livre);
			}
		}
		auteurField.setText("");
		titreField.setText("");
		
		showBibliothequeDetails();
	}
	
	public void handleReinitialiser() {
		auteurField.setText("");
		titreField.setText("");
	}
	
}
