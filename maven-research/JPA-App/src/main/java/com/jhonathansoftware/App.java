package com.jhonathansoftware;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.
				createEntityManagerFactory("com.jhonathansoftware.jpa");      
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		

		Student s = new Student("Joe", 12, "500 ruas");
		entityManager.persist(s);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		factory.close();
	
	}
}
