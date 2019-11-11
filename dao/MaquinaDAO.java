package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import conf.JPAUtil;

import model.Maquina;

public class MaquinaDAO {
	
	private EntityManager manager;

	public MaquinaDAO() {
		this.manager = JPAUtil.getEntityManagerFactory()
				.createEntityManager();
	}
	
	public void save(Maquina maquina) {
		
		manager.getTransaction().begin();
		manager.persist(maquina);
		manager.getTransaction().commit();
		
	}
	
}
