
package models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Usuarios {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String email;
    private String senha;
    private String nome;
    
    //um usuario pode criar varias tarefas
    @OneToMany(mappedBy = "usuarioDono")
    private List<Tarefa> tarefa = new ArrayList<>();
    
    
    public Usuarios(String email, String senha, String nome){
    	this.id = -1;
    	this.email = email;
    	this.senha = senha;
  
    	this.nome = nome;
    }
    
    public Usuarios(){
    	this.id = -1;
    }
    
    public void setEmail(String email){
    	this.email = email;
    }
    
    public void setSenha(String senha) {
    	this.senha = senha;
    }
    
    public void setNome(String nome){
    	this.nome = nome;
    }
    
    public List<Tarefa> getTarefas(){
    	return tarefa;
    }
    
    public void setId(Long id){
    	this.id = id;
    }
    
    public Long getId(){
    	return this.id;
    }
    
	public String getEmail() {
		return email;
	}

	public String getSenha() {
		return senha;
	}
	
	
	public String getNome(){
		return nome;
	}

	@Override
    public String toString() {
        return " " + this.email;
    }
//	
//	@Override
//    public String toString() {
//        return "Colaborador: " + this.email ;
//    }
	
}
