package dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PatientDto {

	@Id
	private int id;
	private String name;
	private String email;
	private String password;
	private long phno;
	private String gender;
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
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString(){
	   return "PatientDto [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", phno="
				+ phno + ", gender=" + gender + "]";
	}
	
	
}
