package br.com.erudio.restwithspringbootjavaerudio.model;


import java.io.Serializable;
import java.util.Objects;

public class Person implements Serializable {
	
	private Long id;
	private String firstName;
	private String lasttName;
	private String addres;
	private String gender;
	
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLasttName() {
		return lasttName;
	}
	
	public void setLasttName(String lasttName) {
		this.lasttName = lasttName;
	}
	
	public String getAddres() {
		return addres;
	}
	
	public void setAddres(String addres) {
		this.addres = addres;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Person person = (Person) o;
		return Objects.equals(id, person.id) && Objects.equals(firstName, person.firstName) && Objects.equals(lasttName, person.lasttName) && Objects.equals(addres, person.addres) && Objects.equals(gender, person.gender);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, firstName, lasttName, addres, gender);
	}
}
