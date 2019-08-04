package com.ingles.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.ingles.pojo.Estudiante;
import com.ingles.service.EstudianteService;

@Controller
public class InglesController {

	@Autowired
	private EstudianteService estudianteService;

	@RequestMapping(value = "/inicio", method = RequestMethod.GET)
	public String inicio(Model model) {
		model.addAttribute("mensaje", "Controlador Spring");
		return "index";
	}

	@RequestMapping(value = "/datos/estudiante", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public String datos(@RequestBody String info, Model model) {
		Gson gson = new Gson();
		Estudiante estudiante = gson.fromJson(info, Estudiante.class);
		String nombre = estudiante.getNombre();
		Double cali = estudiante.getCalificacion();
		Long boleta = estudiante.getBoleta();
		model.addAttribute("nombre", nombre);
		model.addAttribute("cali", cali);
		model.addAttribute("boleta", boleta);

		return "PaginaEstudiante";
	}

	@ResponseBody
	@RequestMapping(value = "/validar/estudiante" , method = RequestMethod.GET)
	public ResponseEntity<String> validarEstudiante(@RequestBody String estudianteIngles) {
		Gson gson = new Gson();
		Estudiante estudiante = gson.fromJson(estudianteIngles, Estudiante.class);
		if(estudianteService.validarDatos(estudiante)) {
			return new ResponseEntity<String>("Usuario confirmado", HttpStatus.OK);

		}else {
			return new ResponseEntity<String>("Usuario no encontrado", HttpStatus.BAD_REQUEST); 
		}
	}

}
