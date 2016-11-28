package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import db.JPAUtil;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import models.Tarefa;
import models.Usuarios;

public class UsuariosDAO {
	private EntityManager manager;
    
    
    public UsuariosDAO() {
        this.manager = JPAUtil.getEntityManager();
    }

    @Override
    public void finalize() {
        this.manager.close();
    }
    
    public void insert(Usuarios usuario) {
        this.manager.getTransaction().begin();
        this.manager.persist(usuario);
        this.manager.getTransaction().commit();
    }
    
    public void update(Usuarios usuario) {
		this.manager.getTransaction().begin();
		this.manager.merge(usuario);
		this.manager.getTransaction().commit();
	}
    
    public void delete(Usuarios usuario) {
    	this.manager.getTransaction().begin();
    	usuario = this.manager.find(Usuarios.class, usuario.getId());
		this.manager.remove(usuario);
		this.manager.getTransaction().commit();
	}   
  
    public List<Usuarios> all() {
    	Query query = manager.createQuery("select s from Usuarios s");
        List<Usuarios> list = query.getResultList();
        
        return list;
    }
    
    public Usuarios checkLogin(String email){
    	
    	Query query = manager.createQuery("select s.id, s.nome, s.email, s.senha from Usuarios s where s.email=:emailparam");
    	query.setParameter("emailparam", email);
    	Usuarios usuario = new Usuarios();
		try {
			List<Object[]> results = query.getResultList();
			for(Object[] elements: results) {
				Long id = Long.valueOf(String.valueOf(elements[0]));
				usuario.setId(id);
				String nome  = String.valueOf(elements[1]);
				usuario.setNome(nome);
				String emailE = String.valueOf(elements[2]);
				usuario.setEmail(emailE);
				String senha = String.valueOf(elements[3]);
				usuario.setSenha(senha);
			}  
			return usuario;
		} catch ( NoResultException nre ) {
			usuario = null;
			return usuario;
		}
    }
}
