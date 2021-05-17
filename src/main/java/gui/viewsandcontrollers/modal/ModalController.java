package gui.viewsandcontrollers.modal;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class ModalController {

	@FXML
	private Label label;

	public void initialize() {
	}

	@FXML
	private void cerrarVentanaAction(ActionEvent event) {
		Node source = (Node) event.getSource();
		Stage stage = (Stage) source.getScene().getWindow();
		stage.close();
	}

}