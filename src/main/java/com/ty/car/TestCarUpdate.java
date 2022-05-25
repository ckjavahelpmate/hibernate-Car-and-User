package com.ty.car;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestCarUpdate {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas") ;
		EntityManager entityManager = entityManagerFactory.createEntityManager() ;
		EntityTransaction entityTransaction = entityManager.getTransaction() ;
		
		Query query = entityManager.createQuery("update Car set type=?1 where id in(?2,?3)" ) ;
		query.setParameter(1, "Automatic")  ;
		query.setParameter(2, 1)  ;
		query.setParameter(3, 2)  ;
		
		entityTransaction.begin();
		int res = query.executeUpdate() ;
		entityTransaction.commit();
		
		if(res != 0) {
			System.out.println("table modified");
		}
		else {
			System.out.println("No Car found for givrn ID");
		}
			
	}

}
