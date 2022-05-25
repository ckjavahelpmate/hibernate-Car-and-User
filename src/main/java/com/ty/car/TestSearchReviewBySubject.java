package com.ty.car;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestSearchReviewBySubject {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas") ;
		EntityManager entityManager = entityManagerFactory.createEntityManager() ;
		
		Query query = entityManager.createQuery("Select r from Review r where r.writername=:mysub" ) ;
		query.setParameter("mysub", "rk") ;
		
		List<Review> reviews = query.getResultList() ;
		
		if(reviews.size()>0) {
			for( Review review : reviews ) {
				System.out.println(review);
			}
		}
		else {
			System.out.println("No review found");
		}
		
	}
 
}
