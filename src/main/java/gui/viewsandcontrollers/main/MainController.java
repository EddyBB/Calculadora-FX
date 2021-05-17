package gui.viewsandcontrollers.main;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MainController {

	@FXML
	private Label label;

	@FXML
	private TextField num1;

	@FXML
	private TextField num2;

	@FXML
	private TextField resul;

	public void initialize() {
	}

	@FXML
	private void sumar(ActionEvent event) throws IOException {

		try {

			double n1 = Double.parseDouble(this.num1.getText());
			double n2 = Double.parseDouble(this.num2.getText());

			Suma s = new Suma(n1, n2);

			double resultado = s.suma();

			this.resul.setText(resultado + "");

		} catch (NumberFormatException e) {
			System.out.println("Solo se aceptan enteros");
			this.resul.setText("ERROR");

			Stage dialog = new Stage();
			Node source = (Node) event.getSource();
			Stage parent = (Stage) source.getScene().getWindow();

			dialog.initOwner(parent);
			dialog.initModality(Modality.APPLICATION_MODAL);
			Parent root = FXMLLoader.load(getClass().getResource("../modal/Modal.fxml"));
			Scene scene = new Scene(root);
			Label label = (Label) root.getChildrenUnmodifiable().get(0);
			label.setText("Introduzca solo enteros");
			dialog.setScene(scene);
			dialog.show();

		}

	}

	@FXML
	private void restar(ActionEvent event) throws IOException {

		try {

			double n1 = Double.parseDouble(this.num1.getText());
			double n2 = Double.parseDouble(this.num2.getText());

			Resta r = new Resta(n1, n2);

			double resultado = r.resta();

			this.resul.setText(resultado + "");

		} catch (NumberFormatException e) {
			System.out.println("Solo se aceptan enteros");
			this.resul.setText("ERROR");

			Stage dialog = new Stage();
			Node source = (Node) event.getSource();
			Stage parent = (Stage) source.getScene().getWindow();

			dialog.initOwner(parent);
			dialog.initModality(Modality.APPLICATION_MODAL);
			Parent root = FXMLLoader.load(getClass().getResource("../modal/Modal.fxml"));
			Scene scene = new Scene(root);
			Label label = (Label) root.getChildrenUnmodifiable().get(0);
			label.setText("Introduzca solo enteros");
			dialog.setScene(scene);
			dialog.show();

		}
	}

	@FXML
	private void multiplicacion(ActionEvent event) throws IOException {

		try {

			double n1 = Double.parseDouble(this.num1.getText());
			double n2 = Double.parseDouble(this.num2.getText());

			Multi m = new Multi(n1, n2);

			double resultado = m.multi();

			this.resul.setText(resultado + "");

		} catch (NumberFormatException e) {
			
			System.out.println("Solo se aceptan enteros");
			this.resul.setText("ERROR");

			Stage dialog = new Stage();
			Node source = (Node) event.getSource();
			Stage parent = (Stage) source.getScene().getWindow();

			dialog.initOwner(parent);
			dialog.initModality(Modality.APPLICATION_MODAL);
			Parent root = FXMLLoader.load(getClass().getResource("../modal/Modal.fxml"));
			Scene scene = new Scene(root);
			Label label = (Label) root.getChildrenUnmodifiable().get(0);
			label.setText("Introduzca solo enteros");
			dialog.setScene(scene);
			dialog.show();

		}
	}

	@FXML
	private void division(ActionEvent event) throws IOException {

		try {

			double n1 = Double.parseDouble(this.num1.getText());
			double n2 = Double.parseDouble(this.num2.getText());

			Division d = new Division(n1, n2);

			double resultado = d.division();

			this.resul.setText(resultado + "");

		} catch (NumberFormatException e) {
			System.out.println("Solo se aceptan enteros");
			this.resul.setText("ERROR");

			Stage dialog = new Stage();
			Node source = (Node) event.getSource();
			Stage parent = (Stage) source.getScene().getWindow();

			dialog.initOwner(parent);
			dialog.initModality(Modality.APPLICATION_MODAL);
			Parent root = FXMLLoader.load(getClass().getResource("../modal/Modal.fxml"));
			Scene scene = new Scene(root);
			Label label = (Label) root.getChildrenUnmodifiable().get(0);
			label.setText("Introduzca solo enteros");
			dialog.setScene(scene);
			dialog.show();

		} catch (ArithmeticException e) {
			System.out.println("No se puede dividir entre 0");
			this.resul.setText("ERROR");

		}

	}

	public class Suma {

		private double a;
		private double b;

		public Suma(double a, double b) {
			this.a = a;
			this.b = b;
		}

		public double getA() {
			return a;
		}

		public void setA(double a) {
			this.a = a;
		}

		public double getB() {
			return b;
		}

		public void setB(double b) {
			this.b = b;
		}

		public double suma() {
			return a + b;
		}

	}

	public class Resta {

		private double a;
		private double b;

		public Resta(double a, double b) {
			this.a = a;
			this.b = b;
		}

		public double getA() {
			return a;
		}

		public void setA(double a) {
			this.a = a;
		}

		public double getB() {
			return b;
		}

		public void setB(double b) {
			this.b = b;
		}

		public double resta() {
			return a - b;
		}

	}

	public class Multi {

		private double a;
		private double b;

		public Multi(double op1, double op2) {
			this.a = op1;
			this.b = op2;
		}

		public double getA() {
			return a;
		}

		public void setA(double a) {
			this.a = a;
		}

		public double getB() {
			return b;
		}

		public void setB(double b) {
			this.b = b;
		}

		public double multi() {
			return a * b;
		}

	}

	public class Division {

		private double a;
		private double b;

		public Division(double a, double b) {
			this.a = a;
			this.b = b;
		}

		public double getA() {
			return a;
		}

		public void setA(double a) {
			this.a = a;
		}

		public double getB() {
			return b;
		}

		public void setB(double b) {
			this.b = b;
		}

		public double division() {
			return a / b;
		}
	}
}