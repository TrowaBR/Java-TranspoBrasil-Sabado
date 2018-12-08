package br.com.cursojava.aula010web.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	
	private static EntityManagerFactory emf;
	
	private static boolean hasEmf() {
		return (emf != null && emf.isOpen());
	}

	public static EntityManagerFactory getEmf() {
		if (!hasEmf()) {
			emf = Persistence.createEntityManagerFactory("aula010");
		}
		return emf;
	}
	
	public static EntityManager createEntityManager() {
		return getEmf().createEntityManager();
	}
	
	public static void closeEmf() {
		if (hasEmf()) {
			emf.close();
		}
	}
}