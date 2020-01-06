package question2;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class LaboratoireGUIController {

	@FXML
	private TextArea allMesureField;
	@FXML
	private TextField mesureField;

	Experience experience;
	AppLabo appLabo;
	
	/**
	 * Default constructor
	 */
	public LaboratoireGUIController() {
		
	}
	
	/**
	 * @param experience
	 */
	public void setExperience(Experience experience) {
		this.experience = experience;
	}
	
	/**
	 * @param appLabo
	 */
	public void setAppLabo(AppLabo appLabo) {
		this.appLabo = appLabo;
	}
	
	public void showExperienceDetail() {
		allMesureField.setText(experience.toString());
		allMesureField.setEditable(false);
	}
	
	public boolean isDigit(String chaine) {
		try {
			Integer.parseInt(chaine);
		}catch (NumberFormatException e) {
			return false;
		}
		return true;
	}
	@FXML
	public void handleAjouter() {
		if(isDigit(mesureField.getText())) {
			double mesure = Double.parseDouble(mesureField.getText());
			experience.ajouterMesure(mesure);
			mesureField.setText("");
			showExperienceDetail();
		}
		else {
			allMesureField.setText("ERREUR MESURE");
		}
	}
	
	@FXML
	public void handleSupprimerDernier() {
		if(experience.getListMesure().size() > 0) {
			experience.supprimerDerniereMesure();
			showExperienceDetail();
		}
	}
	
	@FXML
	public void handleNettoyerTout() {
		if(experience.getListMesure().size() > 0) {
			experience.viderMesures();
			showExperienceDetail();
		}
	}
	
	@FXML
	public void handleFin() {
		appLabo.primaryStage.close();
	}
}
