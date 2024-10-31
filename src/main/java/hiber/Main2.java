package hiber;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
		EntityManager m=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=m.getTransaction();
		
		demo d=new demo();
		d.setId(1);
		d.setName("gandu");
		
		entityTransaction.begin();
		m.persist(d);
		entityTransaction.commit();

	}

}
