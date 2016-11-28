package util;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Avisos {
	public static Alert geraAvisoConfirmaCadastro(){
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("");
		alert.setHeaderText("Cadastro feito com sucesso!");
		alert.setContentText("");
		alert.showAndWait();
		return alert;
	}
	public static Alert geraAvisoFalhaCadastro(){
		Alert alert = new Alert(AlertType.WARNING);
		alert.setTitle("Cadastro incompleto");
		alert.setHeaderText("Preencha todos os campos!");
		alert.setContentText("");
		alert.showAndWait();
		return alert;
	}
	public static Alert geraAvisoAddColab(){
		Alert alert = new Alert(AlertType.WARNING);
		alert.setTitle("Falha ao adicionar novo colaborador");
		alert.setHeaderText("Por favor, insira um usuário já cadastrado");
		alert.setContentText("");
		alert.showAndWait();
		return alert;
	}
	
	public static Alert geraAvisoLoginIncorreto(){
		Alert alert = new Alert(AlertType.WARNING);
		alert.setTitle("Falha no login");
		alert.setHeaderText("Login incorreto");
		alert.setContentText("");
		alert.showAndWait();
		return alert;
	}
}
