package dao;

import javax.persistence.EntityManager;

import conf.JPAUtil;

import model.Terreno;

public class TerrenoDAO {
	private EntityManager manager;

	public TerrenoDAO() {
		this.manager = JPAUtil.getEntityManagerFactory()
				.createEntityManager();
	}
	
	public void save(Terreno terreno) {
		
		manager.getTransaction().begin();
		manager.persist(terreno);
		manager.getTransaction().commit();
		
	}
}
