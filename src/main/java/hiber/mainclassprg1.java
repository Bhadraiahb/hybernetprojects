package hiber;

import javax.persistence.*;

public class mainclassprg1 {
public static void main(String[] args) {
	EntityManagerFactory e= Persistence.createEntityManagerFactory("dev");
	EntityManager m=e.createEntityManager();
	EntityTransaction t=m.getTransaction();
	Firstprg e1=new Firstprg();
	e1.setAge(23);
	e1.setPhno(987654321);
	e1.setName("bhadra");
	t.begin();
	m.persist(e1);
	t.commit();
}
}
