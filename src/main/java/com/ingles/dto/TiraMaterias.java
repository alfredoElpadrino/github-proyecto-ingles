package com.ingles.dto;

import java.io.Serializable;

public class TiraMaterias implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long boleta;
	private String nombreEstudiante;
	private String apellidoEstidiante;
	private String materia;
	private Double calificacion;

	public TiraMaterias() {
	}

	public Long getBoleta() {
		return boleta;
	}

	public void setBoleta(Long boleta) {
		this.boleta = boleta;
	}

	public String getNombreEstudiante() {
		return nombreEstudiante;
	}

	public void setNombreEstudiante(String nombreEstudiante) {
		this.nombreEstudiante = nombreEstudiante;
	}

	public String getApellidoEstidiante() {
		return apellidoEstidiante;
	}

	public void setApellidoEstidiante(String apellidoEstidiante) {
		this.apellidoEstidiante = apellidoEstidiante;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public Double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(Double calificacion) {
		this.calificacion = calificacion;
	}

}
