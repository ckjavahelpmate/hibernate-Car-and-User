package com.ty.car;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestInserUser {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas") ;
		EntityManager entityManager = entityManagerFactory.createEntityManager() ;
		EntityTransaction entityTransaction = entityManager.getTransaction() ;
		
		User user = new User() ;
		user.setName("Rocky");
		user.setEmail("raw@mail.com");
		user.setPassword("fighter");
		user.setGender("male");
		
		
		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
		
		System.out.println("************** done *****************");
		
	}

}
