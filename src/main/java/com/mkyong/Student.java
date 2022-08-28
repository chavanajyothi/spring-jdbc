package com.mkyong;

public class Student {

	private long id;
	private String name;
	private String collagename;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollagename() {
		return collagename;
	}

	public void setCollagename(String collagename) {
		this.collagename = collagename;
	}
	 
	public Student(Long id, String name, String collagename) {
		super();
		this.id = id;
		this.name = name;
		this.collagename = collagename;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", collagename=" + collagename + ", getId()=" + getId()
				+ ", getName()=" + getName() + ", getCollagename()=" + getCollagename() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
