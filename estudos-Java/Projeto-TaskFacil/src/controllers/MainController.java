
package controllers;

import java.io.IOException;
import java.net.URL;
import java.security.NoSuchAlgorithmException;
import java.util.ResourceBundle;

import dao.UsuariosDAO;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import models.Usuarios;
import util.Avisos;
import util.EmailValidator;
import util.SHAGenerator;


public class MainController implements Initializable {
	@FXML
	private Button buttonCadastrar;
	@FXML
	private Button buttonLogin;
	@FXML
	private TextField txtNomeCadastro;
	@FXML
	private TextField txtEmailCadastro;
	@FXML
	private PasswordField txtSenhaCadastro;
	@FXML
	private TextField txtEmailLogin;
	@FXML
	private PasswordField txtSenhaLogin;
	@FXML
	private AnchorPane aPane;
	
	private UsuariosDAO usuarioDAO;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.usuarioDAO = new UsuariosDAO();
    }    
   
	
	@FXML
	public void handleButtonCadastrar() throws IOException {
		 Usuarios usuario = new Usuarios();
				
		if (!txtNomeCadastro.getText().equals("") && !txtEmailCadastro.getText().equals("") && !txtSenhaCadastro.getText().equals("")){
			
			usuario.setNome(this.txtNomeCadastro.getText());
			
			EmailValidator valida = new EmailValidator();
			if(valida.validate(this.txtEmailCadastro.getText())) {
				usuario.setEmail(this.txtEmailCadastro.getText());
				try {
					usuario.setSenha(SHAGenerator.generateHash(this.txtSenhaCadastro.getText()));
				} catch (NoSuchAlgorithmException e) {
					e.printStackTrace();
				}
				this.usuarioDAO.insert(usuario);
				Avisos.geraAvisoConfirmaCadastro();
				limpaCamposCadastro();
			} else {
				Avisos.geraAvisoFalhaCadastro();
			}

		} else {
			Avisos.geraAvisoFalhaCadastro();	
		}
	}
	
	@FXML
	public void handleButtonLogin() throws IOException {
		
		if(!this.txtEmailLogin.getText().equals("") && !this.txtSenhaLogin.getText().equals("")){
			Usuarios usuario = null;
				usuario = this.usuarioDAO.checkLogin(this.txtEmailLogin.getText());
			if (usuario != null) {
				try {
					if (SHAGenerator.generateHash(this.txtSenhaLogin.getText()).equals(usuario.getSenha()) ){
						
						showNextScreen(usuario);

					} else {
						Avisos.geraAvisoLoginIncorreto();
					}
				} catch (NoSuchAlgorithmException e) {
					e.printStackTrace();
				}
			}
		} else {
			Avisos.geraAvisoLoginIncorreto();
		}
	}
	
	public void limpaCamposLogin(){
		this.txtEmailLogin.setText("");
		this.txtEmailLogin.setText("");
	}
	
	public void limpaCamposCadastro(){
		this.txtNomeCadastro.setText("");
		this.txtEmailCadastro.setText("");
		this.txtSenhaCadastro.setText("");
	}
    
	
	public void showNextScreen(Usuarios usuario) throws IOException {
		
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(TasksDialogController.class.getResource("/views/tasks.fxml"));
		
		Stage dialogStage = new Stage();
		dialogStage.setTitle("Cadastro de Tasks");	
		
		AnchorPane page = (AnchorPane) loader.load();
		Scene scene = new Scene(page);
		dialogStage.setScene(scene);
		
		TasksDialogController controller = loader.getController();
		controller.setUsuario(usuario);	
		controller.start();
			
		controller.setDialogStage(dialogStage);
		
		dialogStage.show();
	}
}
