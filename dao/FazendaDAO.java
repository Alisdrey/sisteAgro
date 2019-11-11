package dao;

import javax.persistence.EntityManager;

import conf.JPAUtil;
import model.Fazenda;


public class FazendaDAO {
	
	private EntityManager manager;

	public FazendaDAO() {
		this.manager = JPAUtil.getEntityManagerFactory()
				.createEntityManager();
	}
	
	public void save(Fazenda fazenda) {
		
		manager.getTransaction().begin();
		manager.persist(fazenda);
		manager.getTransaction().commit();
		
	}
}
