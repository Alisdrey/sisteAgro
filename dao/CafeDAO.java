package dao;

import javax.persistence.EntityManager;

import conf.JPAUtil;
import model.Cafe;


public class CafeDAO {
	private EntityManager manager;

	public CafeDAO() {
		this.manager = JPAUtil.getEntityManagerFactory()
				.createEntityManager();
	}
	
	public void save(Cafe cafe) {
		
		manager.getTransaction().begin();
		manager.persist(cafe);
		manager.getTransaction().commit();
		
	}
}
