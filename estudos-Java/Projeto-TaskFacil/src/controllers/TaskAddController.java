
package controllers;

import java.io.IOException;
import java.net.URL;
import java.security.NoSuchAlgorithmException;
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


public class TaskAddController implements Initializable {
	private Stage dialogStage;
	@FXML
	private Button btnAdd;
	@FXML
	private Button buttonCancelar;
	@FXML
	private Button btnCancel;
	@FXML
	private TextField lblTitulo;
	@FXML
	private TextField lblLocal;
	@FXML
	private TextField txtColaborador;
	@FXML
	private DatePicker datePicka;
	@FXML
	private TextArea descricao;
	@FXML
	private AnchorPane aPane;
		
	private TarefaDAO tarefaDAO;
	private Tarefa tarefa;
	private Usuarios user;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.tarefaDAO = new TarefaDAO();
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
	
	public void setUsuario(Usuarios user){
		this.user = user;
	}
	
	@FXML
	public void handleButtonCancel() throws IOException {
	    this.dialogStage.close();
	}
	
	@FXML
	public void handleButtonAdd() throws IOException {		 		
		if (!descricao.getText().equals("") && 
				!lblLocal.getText().equals("") && 
				!datePicka.getValue().toString().equals("") && 
				!descricao.getText().equals("")){
			
			this.tarefa.setTitulo(this.lblTitulo.getText());
			this.tarefa.setLocal(this.lblLocal.getText());
			this.tarefa.setData(this.datePicka.getValue().toString());
			this.tarefa.setDescricao(this.descricao.getText());
			this.tarefa.setUsuarioDono(this.user);
			this.user.getTarefas().add(tarefa);
			this.tarefaDAO.insert(tarefa);
			
			UsuariosDAO dao = new UsuariosDAO();
			String emailColab = this.txtColaborador.getText();
			EmailValidator valida = new EmailValidator();
			
			if(!emailColab.equals("")) {
				if(dao.checkLogin(emailColab).getEmail() != null && valida.validate(emailColab) ){
					
					Usuarios colaborador = dao.checkLogin(emailColab);
					this.tarefa.getUsuariosColaborador().add(colaborador);
					limpaCampoEmail();
				} else {
					Avisos.geraAvisoAddColab();
					return;
				}	
			}
			
			this.tarefaDAO.update(tarefa);
			Avisos.geraAvisoConfirmaCadastro();
			limpaCamposCadastro();
			
			this.dialogStage.close();
		} else {
			Avisos.geraAvisoFalhaCadastro();
		}
	}
	
	public void limpaCamposCadastro(){
		this.lblTitulo.setText("");
		this.lblLocal.setText("");
		this.descricao.setText("");
	}
	public void limpaCampoEmail(){
		this.txtColaborador.setText("");
	}
}
