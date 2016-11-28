package models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Tarefa {
	@Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
    private String titulo;
    private String descricao;
    private String local;
    //private LocalDateTime dataevento;
    private String dataevento;
    
    //child da relação -owning side
    @ManyToOne
    private Usuarios usuarioDono;

    //varios usuarios podem colaborar em varias tarefas
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Usuarios> usuariosColaborador = new ArrayList<>();
    
    public Tarefa(){
    	this.id = -1;
    }
    
    public Tarefa(String titulo, String descricao, String local, String dataevento, Usuarios usuarioDono) {
    	this.id = -1;
		this.titulo = titulo;
		this.descricao = descricao;
		this.local = local;
		this.dataevento = dataevento;
		this.usuarioDono = usuarioDono;
	}
    
    public List<Usuarios> getUsuariosColaborador(){
    	return usuariosColaborador;
    }
    	
	public Long getId(){
		return this.id;
	}
    
    public String getTitulo() {
		return titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getLocal() {
		return local;
	}
	
	public String getDataevento() {
		return dataevento;
	}
	
	public void setId(Long id){
		this.id = id;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void setLocal(String local) {
		this.local = local;
	}
	
	public void setData(String data) {
		this.dataevento = data;
	}
	public void setUsuarioDono(Usuarios user){
		this.usuarioDono = user;
	}
    
}
