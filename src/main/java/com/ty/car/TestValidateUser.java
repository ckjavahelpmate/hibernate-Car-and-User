package com.ty.car;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestValidateUser {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas") ;
		EntityManager entityManager = entityManagerFactory.createEntityManager() ;

		String sql = "Select u from User u where u.email=?1 and u.password=?2" ;
		Query query = entityManager.createQuery(sql) ;
		query.setParameter(1, "jo@mail.com") ;
		query.setParameter(2, "john12") ;

		List<User> users = query.getResultList() ;

		if( users.size()>0 ) {
			
			User user = users.get(0) ;
			System.out.println(user);
		}
		else {
			System.out.println("Invalid user name or password");
		}

		

	}

}
