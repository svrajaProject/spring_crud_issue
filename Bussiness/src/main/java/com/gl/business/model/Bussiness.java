package com.gl.business.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="data1")
public class Bussiness {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String fname;
	private String lname;

	/**
	 * 
	 */
	public Bussiness() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param fname
	 * @param lname
	 */
	public Bussiness(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the fname
	 */
	public String getFname() {
		return fname;
	}

	/**
	 * @param fname the fname to set
	 */
	public void setFname(String fname) {
		this.fname = fname;
	}

	/**
	 * @return the lname
	 */
	public String getLname() {
		return lname;
	}

	/**
	 * @param lname the lname to set
	 */
	public void setLname(String lname) {
		this.lname = lname;
	}

	@Override
	public String toString() {
		return "Bussiness [id=" + id + ", fname=" + fname + ", lname=" + lname + "]";
	}

}
