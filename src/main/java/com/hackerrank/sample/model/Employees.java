package com.hackerrank.sample.model;


import java.io.FileWriter;

    
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.text.SimpleDateFormat;
import java.util.Date;

	@Entity
	public class Employees implements Serializable {
	    @Id
	   
	    private String name="EMP1";
	    private int age=24;
	    private String dob="12/24/2000";



	    public Employees() {
	    }

	    public Employees(String name,int age,String dob) {
	        this.age = age;
	        this.name = name;
	        this.dob=dob;
	    }

	    public int getage() {
	        return this.age;
	    }

	    public void setage(int age) {
	        this.age = age;
	    }

	    public String getName() {
	        return this.name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }
	    public String getdob() {
	        return this.dob;
	    }

	    public void setdateString(String dob) {

	     
	        this.dob = dob;
	    }
	    
	   
	


}

 