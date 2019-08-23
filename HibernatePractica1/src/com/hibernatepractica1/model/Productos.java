package com.hibernatepractica1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="productos")
public class Productos {
	
	@Id
	@GeneratedValue
	@Column
	private int idProducto;
	@Column
	private String nombreProducto;
	@Column
	private double precioProducto;
	@Column
	private int existencias;

	//@JoinColumn(name = "first Name") Para fork y cuando el campo no coincide con la base de datos
	
	public Productos() {}
	
	public Productos(int idProducto, String nombreProducto, double precioProducto, int existencias) {
		this.idProducto = idProducto;
		this.nombreProducto = nombreProducto;
		this.precioProducto = precioProducto;
		this.existencias = existencias;
	}
	
	public int getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public double getPrecioProducto() {
		return precioProducto;
	}
	public void setPrecioProducto(double precioProducto) {
		this.precioProducto = precioProducto;
	}
	public int getExistencias() {
		return existencias;
	}
	public void setExistencias(int existencias) {
		this.existencias = existencias;
	}

	@Override
	public String toString() {
		return "Productos [idProducto=" + idProducto + ", nombreProducto=" + nombreProducto + ", precioProducto="
				+ precioProducto + ", existencias=" + existencias + "]";
	}

}
