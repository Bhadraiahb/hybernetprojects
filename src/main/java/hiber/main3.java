package hiber;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.hibernate.Transaction;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.boot.archive.internal.FileInputStreamAccess;

public class main3 {
public static void main(String[] args) throws IOException {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	emp3 emp3=new emp3();
	emp3.setAge(23);
	emp3.setEname("shashi");
	emp3.setEsal(23456);
	FileInputStream fileInputStream=new FileInputStream("C:/Users/admin/Pictures/Camera Roll/WIN_20240904_01_54_54_Pro.jpg"); 
	byte[] arr=new byte[fileInputStream.available()]; 
	fileInputStream.read(arr);
	emp3.setImage(arr);
	entityTransaction.begin();
	entityManager.persist(emp3);
	entityTransaction.commit();
	
	
}
}
