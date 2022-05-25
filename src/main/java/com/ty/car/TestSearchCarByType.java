package com.ty.car;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestSearchCarByType {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas") ;
		EntityManager entityManager = entityManagerFactory.createEntityManager() ;
		
		Query query = entityManager.createQuery("Select c from Car c where c.brand=?1 and c.type=?2") ;
		query.setParameter(1, "jaguar") ;
		query.setParameter(2, "automatic" ) ;
		
		List<Car> cars = query.getResultList() ;
		
		if(cars.size()>0) {
			for(Car car : cars ) {
				
				System.out.println(car);
			}
		}
		else {
			System.out.println("No cars found");
		}
		
		
	}

}
