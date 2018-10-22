package com.fordGlitz.entities;

import javax.annotation.Generated;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class User {

	@Id
	@GeneratedValue
	private Long id;

	private String fname;
	private String lname;

	public User(String fname, String lname)
	{
		this.fname = fname;
		this.lname = lname;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public Long getId(){
		return id;
	}

	public void setId(Long id) {
		this.id =id;
	}

  	public String toString(){ return "User [id=" +id + ",fname="+fname  +  ",lname="+lname; }

  	public User() {
	}
}
