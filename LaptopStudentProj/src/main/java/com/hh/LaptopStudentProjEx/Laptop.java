package com.hh.LaptopStudentProjEx;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Laptop {
	
	@Id
	private int id;
	private String lname;
	private int price;
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Alien getAlien() {
		return alien;
	}
	public void setAlien(Alien alien) {
		this.alien = alien;
	}
	@ManyToOne
	private Alien alien=new Alien();
	
////	@ManyToOne
//	@ManyToMany
//	private List<Student> student = new ArrayList<Student>() 	;
	
@Override
	public String toString() {
		return "Laptop [id=" + id + ", lname=" + lname + ", price=" + price + ", alien=" + alien + "]";
	}
	//	
//	public List<Student> getStudent() {
//		return student;
//	}
////	public void setStudent(List<Student> student) {
////		this.student = student;
////	}
//	public void setStudent(List<Student> student) {
//		this.student = student;
//	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	
}
