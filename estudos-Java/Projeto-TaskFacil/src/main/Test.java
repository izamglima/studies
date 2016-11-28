package main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dao.TarefaDAO;
import dao.UsuariosDAO;
import models.Tarefa;
import models.Usuarios;

//public class Test {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		
//		Usuarios usu = new Usuarios("izamglima@gmail.com", "12345", "dono", "Izabela");
//		UsuariosDAO dao = new UsuariosDAO();
//		dao.insert(usu);
//		usu = dao.checkLogin(usu.getEmail());
//		
//		Tarefa tarefa = new Tarefa("titulo da taskkk", "descrição", "local", "25/12/2016", usu);
//		TarefaDAO daoo = new TarefaDAO();
//		daoo.insert(tarefa);
//		
//		
//	}
//}
