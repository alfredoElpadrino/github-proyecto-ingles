package com.ingles.pojo;

public class Estudiante {

	private Long id;
	private String nombre;
	private String apellido;
	private Long boleta;
	private Double calificacion;

	public Estudiante() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Long getBoleta() {
		return boleta;
	}

	public void setBoleta(Long boleta) {
		this.boleta = boleta;
	}

	public Double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(Double calificacion) {
		this.calificacion = calificacion;
	}

	@Override
	public String toString() {
		return "Estudiante [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", boleta=" + boleta
				+ ", calificacion=" + calificacion + "]";
	}

}
