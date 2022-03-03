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
		
		// CRUD
		// Create
		// Person p = new Person("Jhonathan", "jhonathan@teste.com");
		
		// Read
		// Person p = entityManager.find(Person.class, 1);
		// System.out.println(p);
		
		// Delete
		Person p = entityManager.find(Person.class, 1);
		entityManager.remove(p);
		
		
		
		
		// entityManager.persist(p);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		factory.close();
	
	}
}
