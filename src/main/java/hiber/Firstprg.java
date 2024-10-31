package hiber;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Firstprg {
@Id
	private int age;

	private long phno;
	private String Name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	
}

