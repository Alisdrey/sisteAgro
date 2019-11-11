package dao;

import javax.persistence.EntityManager;

import conf.JPAUtil;
import model.Armazem;



public class ArmazemDAO {

	private EntityManager manager;

	public ArmazemDAO() {
		this.manager = JPAUtil.getEntityManagerFactory()
				.createEntityManager();
	}
	
	public void save(Armazem armazem) {
		
		manager.getTransaction().begin();
		manager.persist(armazem);
		manager.getTransaction().commit();
		
	}
	
}
