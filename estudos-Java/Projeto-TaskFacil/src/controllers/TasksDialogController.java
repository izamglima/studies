package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;

import javax.swing.event.ChangeListener;

import dao.TarefaDAO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import models.Tarefa;
import models.Usuarios;

public class TasksDialogController implements Initializable {
	private Stage dialogStage;
	private Usuarios user;
	@FXML
	private Label lblNome;
	@FXML
	private Button btnAdicionar;
	@FXML
	private Button btnEditar;
	@FXML
	private Button btnDeletar;
	@FXML
	private Button btnAtualiza;
	@FXML
	private TableView<Tarefa> tableViewTarefas;
	@FXML
	private ListView<Usuarios> listViewColaboradores;
	@FXML
	private TableColumn<Usuarios, String> tableColumnColaborador;
	@FXML
	private TableColumn<Tarefa, String> tableColumnTitulo;
	@FXML
	private TableColumn<Tarefa, String> tableColumnLocal;
	@FXML
	private TableColumn<Tarefa, String> tableColumnDescricao;
	@FXML
	private TableColumn<Tarefa, String> tableColumnDataEvento;
	@FXML
	private AnchorPane aPane;
	@FXML
	private Label label2;
//	@FXML
//	private Label label3;	
	
	private ObservableList<Tarefa> tarefaObservableList;
	
	private ObservableList<Usuarios> colaboradoresObservableList;
	
	private List<Tarefa> loadTarefas;
	
	private TarefaDAO tarefaDAO;

	private Tarefa tarefa;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		this.tarefaDAO = new TarefaDAO();
	}
	
	public void start(){
		listaTasks();
		
        this.tableViewTarefas.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue) -> selectItemTableViewTarefas(newValue));
	}	
	
	public Stage getDialogStage() {
		return dialogStage;
	}
    
	public void setDialogStage(Stage dialogStage) {
		this.dialogStage = dialogStage;
	}

	public void setUsuario(Usuarios usuario) {
		this.user = usuario;
		this.lblNome.setText(String.valueOf(this.user.getNome()));
	}	
	
	private void listaTasks() {
		this.loadTarefas = this.tarefaDAO.all(this.user.getId());
		
		this.tableColumnTitulo.setCellValueFactory(new PropertyValueFactory<>("titulo"));
		this.tableColumnDescricao.setCellValueFactory(new PropertyValueFactory<>("descricao"));
		this.tableColumnLocal.setCellValueFactory(new PropertyValueFactory<>("local"));
		this.tableColumnDataEvento.setCellValueFactory(new PropertyValueFactory<>("dataevento"));

		this.tarefaObservableList = FXCollections.observableArrayList(this.loadTarefas);
		this.tableViewTarefas.setItems(this.tarefaObservableList);
		this.tableViewTarefas.refresh();
	}
	
	public void selectItemTableViewTarefas(Tarefa task) {
		if(task == null) {
			System.out.println("2--"+task);
		} else {
			if(task.getUsuariosColaborador().size() > 0){
				this.colaboradoresObservableList = FXCollections.observableArrayList(task.getUsuariosColaborador());
				this.listViewColaboradores.setItems(this.colaboradoresObservableList);		
			} else {
				this.listViewColaboradores.setItems(null);
			}	
		}
	}

	@FXML
	public void handleButtonAtualizar() throws IOException {
//		this.tableViewTarefas.getSelectionModel().select(0);
//		listaTasks();
		this.tableViewTarefas.getSelectionModel().select(0);
		start();
	}
	
	@FXML
	public void handleButtonAdicionar() throws IOException {
		this.tarefa = new Tarefa();
		showNextScreen(tarefa, this.user);
	}
	
	@FXML
	public void handleButtonEditar() throws IOException {
		if (loadTarefas.isEmpty()) {
			this.label2.setText("Você não tem tarefas cadastradas!");
		} else {
			this.tarefa = this.tableViewTarefas.getSelectionModel().getSelectedItem();
			showEditScreen(tarefa);
		}
		start();
	}
	
	@FXML
	public void handleButtonDeletar() throws IOException {
		if (loadTarefas.isEmpty()) {
			this.label2.setText("Você não tem tarefas cadastradas!");
		}
		else {
			this.tarefa = this.tableViewTarefas.getSelectionModel().getSelectedItem();
			Alert confirmationAlert = new Alert(Alert.AlertType.CONFIRMATION);
			confirmationAlert.setHeaderText("Remoção de tarefas");
			confirmationAlert.setContentText("Deseja realmente apagar a tarefa?");
			
			Optional<ButtonType> result = confirmationAlert.showAndWait();
			if (result.get() == ButtonType.OK) {
				this.tarefaDAO.delete(tarefa);
				//this.listaTarefa.setVisible(false);
			}
			this.tableViewTarefas.getSelectionModel().select(0);
			listaTasks();
		}
	}
	
	public void showEditScreen(Tarefa tarefa) throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(TaskEditController.class.getResource("/views/editTask.fxml"));
		AnchorPane page = (AnchorPane) loader.load();
				
		Stage dialogStage = new Stage();
		dialogStage.setTitle("Edição de Tasks");
		Scene scene = new Scene(page);
		dialogStage.setScene(scene);
		
		
		TaskEditController controller2 = loader.getController();
		controller2.setDialogStage(dialogStage);
		
		controller2.setTarefa(tarefa);
		controller2.start();
		
		dialogStage.show();	
	}
	
	public void showNextScreen(Tarefa tarefa, Usuarios user) throws IOException {
		
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(TaskAddController.class.getResource("/views/cadastroTask.fxml"));
		AnchorPane page = (AnchorPane) loader.load();
				
		Stage dialogStage = new Stage();
		dialogStage.setTitle("Cadastro de Tasks");
		Scene scene = new Scene(page);
		dialogStage.setScene(scene);
		
		
		TaskAddController controller = loader.getController();
		controller.setDialogStage(dialogStage);
		
		controller.setTarefa(tarefa);
		controller.setUsuario(user);
		
		dialogStage.show();
	}
	
}
