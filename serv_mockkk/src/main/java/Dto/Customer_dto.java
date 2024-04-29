package Dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Customer_dto {
	
	
	@SequenceGenerator(initialValue = 786, allocationSize = 1, sequenceName = "Cust_id", name = "Cust_id")
	@GeneratedValue(generator = "Cust_id")
	@Id
	int id;
	
	String name;
	
	String gender;
	
	String email;
	
	String password;
	
	Long mob_no;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getMob_no() {
		return mob_no;
	}

	public void setMob_no(Long mob_no) {
		this.mob_no = mob_no;
	}
	
	

}
