
package controllers;

import java.io.IOException;
import java.net.URL;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDate;
import java.util.ResourceBundle;

import dao.TarefaDAO;
import dao.UsuariosDAO;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import models.Tarefa;
import models.Usuarios;
import util.Avisos;
import util.EmailValidator;
import util.SHAGenerator;


public class TaskEditController implements Initializable {
	private Stage dialogStage;
	@FXML
	private Button btnAdd2;
	@FXML
	private Button buttonCancelar2;
	@FXML
	private Button btnCancel2;
	@FXML
	private TextField lblTitulo2;
	@FXML
	private TextField lblLocal2;
	@FXML
	private DatePicker datePicka2;
	@FXML
	private TextArea descricao2;
	@FXML
	private AnchorPane aPane;
		
	private TarefaDAO tarefaDAO;
	private Tarefa tarefa;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.tarefaDAO = new TarefaDAO();
        
    }    
    
    public void start(){
    	this.lblTitulo2.setText(this.tarefa.getTitulo());
    	this.lblLocal2.setText(this.tarefa.getLocal());
    	this.descricao2.setText(this.tarefa.getDescricao());
    	 LocalDate today = LocalDate.now();
    	 this.datePicka2.setValue(today);
    }

	public Stage getDialogStage() {
		return dialogStage;
	}
    
	public void setDialogStage(Stage dialogStage) {
		this.dialogStage = dialogStage;
	}

	public void setTarefa(Tarefa tarefa) {
		this.tarefa = tarefa;
	}
	
	
	@FXML
	public void handleButtonCancel() throws IOException {
	    this.dialogStage.close();
	}
	
	@FXML
	public void handleButtonEdit() throws IOException {		 		
		if (!descricao2.getText().equals("") && 
				!lblLocal2.getText().equals("") && 
				!descricao2.getText().equals("")) {
			
			this.tarefa.setTitulo(this.lblTitulo2.getText());
			this.tarefa.setLocal(this.lblLocal2.getText());
			this.tarefa.setData(this.datePicka2.getValue().toString());
			this.tarefa.setDescricao(this.descricao2.getText());
			this.tarefaDAO.update(tarefa);
			Avisos.geraAvisoConfirmaCadastro();
			limpaCamposCadastro();
			this.dialogStage.close();
		} else {
			Avisos.geraAvisoFalhaCadastro();	
		}
	}
	
	public void limpaCamposCadastro(){
		this.lblTitulo2.setText("");
		this.lblLocal2.setText("");
		this.descricao2.setText("");
	}

    
}
