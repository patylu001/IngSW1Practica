package com.fca.calidad;


public class Alumno {
	//Atributos
	private String id;
	private String name;
	private String lastName;
	private Integer age;
	private Float average;
	//Constructores
	Alumno(){
		this.id="";
		this.name="";
		this.lastName="";
		this.age=0;
		this.average=0f;
	}
	Alumno(String id, String name, String lastName, Integer age, Float average){
		this.setId(id);
		this.setName(name);
		this.setLastName(lastName);
		this.setAge(age);
		this.setAverage(average);
	}
	//Setters
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setLastName(String lastName) {
		this.lastName=lastName;
	}
	public void setAge(Integer age) {
		this.age = age < 0 ? 0 : age;
	}
	public void setAverage(Float average) {
		this.average = average;
	}
	//Getters
	public String getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public String getLastName() {
		return this.lastName;
	}
	public Integer getAge() {
		return this.age;
	}
	public Float getAverage() {
		return this.average;
	}
	
	
	
}