package com.ingles.service;

import org.springframework.stereotype.Service;

import com.ingles.pojo.Estudiante;

@Service
public class EstudianteService {

	public boolean validarDatos(Estudiante estudiante) {
		if(estudiante.getNombre().equals("Alfredo")){
			
			return true;
		}else {
			
			return false;
			
		}
	}

}
