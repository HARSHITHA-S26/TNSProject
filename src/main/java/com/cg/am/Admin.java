package com.cg.am;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Admin {

	private int id;
	private String name;
	private float dataManagement;
	
	
	
	public Admin() {
		super();
	}



	public Admin(int id, String name, float dataMnagement) {
		super();
		this.id = id;
		this.name = name;
		dataManagement = dataMnagement;
	}


    @Id
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



	public float getDataMnagement() {
		return dataManagement;
	}



	public void setDataMnagement(float dataMnagement) {
		dataManagement = dataMnagement;
	}



	@Override
	public String toString() {
		return "Admin [id=" + id + ", name=" + name + ", DataMnagement=" + dataManagement + ", getId()=" + getId()
				+ ", getName()=" + getName() + ", getDataMnagement()=" + getDataMnagement() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
 
	

	
	}
	
	

