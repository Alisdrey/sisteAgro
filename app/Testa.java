	package app;

import javax.persistence.EntityManager;

import conf.JPAUtil;

public class Testa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManager manager = JPAUtil.getEntityManagerFactory().createEntityManager();
		
		manager.close();
		JPAUtil.shutdown();
		
	}

}
