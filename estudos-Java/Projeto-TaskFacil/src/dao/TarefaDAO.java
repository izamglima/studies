package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import db.JPAUtil;
import javafx.scene.control.Label;
import models.Tarefa;

public class TarefaDAO {
	private EntityManager manager;
    
    
    public TarefaDAO() {
        this.manager = JPAUtil.getEntityManager();
    }

    @Override
    public void finalize() {
        this.manager.close();
    }
    
    public void insert(Tarefa tarefa) {
        this.manager.getTransaction().begin();
        this.manager.persist(tarefa);
        this.manager.getTransaction().commit();
    }
    
    public void update(Tarefa tarefa) {
		this.manager.getTransaction().begin();
		this.manager.merge(tarefa);
		this.manager.getTransaction().commit();
	}
    
    public void delete(Tarefa tarefa) {
    	this.manager.getTransaction().begin();
    	tarefa = this.manager.find(Tarefa.class, tarefa.getId());
		this.manager.remove(tarefa);
		this.manager.getTransaction().commit();
	}
    
  
    public List<Tarefa> all(Long iduser) {
    	Query query = manager.createQuery("SELECT t FROM Tarefa t LEFT JOIN t.usuariosColaborador uc WHERE t.usuarioDono.id=" + iduser + "OR uc.id=" + iduser + " GROUP BY t.id");
    	List<Tarefa> list = query.getResultList();
        return list;
        
    }
}
