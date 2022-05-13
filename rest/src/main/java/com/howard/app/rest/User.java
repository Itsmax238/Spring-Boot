package com.howard.app.rest;
import javax.persistence.*;

@Entity
public class User {
	
	//Instanced Variables
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@Column
private String firstName;
@Column
private String lastName;
@Column
private int age;
@Column
private String occupation;

//Getters
public long getId() {
	return id;
}
public String getFirstName() {
	return firstName;
}
public String getLastName() {
	return lastName;
}
public int getAge() {
	return age;
}
public String getOccupation() {
	return occupation;
}

//Setters
public void setId(long id) {
	this.id = id;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public void setAge(int age) {
	this.age = age;
}
public void setOccupation(String occupation) {
	this.occupation = occupation;
}

}
