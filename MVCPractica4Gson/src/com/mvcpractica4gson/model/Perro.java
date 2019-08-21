package com.mvcpractica4gson.model;

import java.util.Date;

public class Perro {

	private String nombre;
	private String color;
	private String raza;
	private int edad;
	private Date fechaNacimiento;
	private String json;
	
	public Perro() {
		
	}
	
	public Perro(String nombre, String color, String raza, int edad, String json) {
		this.nombre = nombre;
		this.color = raza;
		this.raza = raza;
		this.edad = edad;
		this.json = json;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	public String getRaza() {
		return raza;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public void setJson(String json) {
		this.json = json;
	}
	
	public String getJson() {
		return json;
	}
	
	
	
	
	
}
