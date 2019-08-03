package com.ingles.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.google.gson.Gson;
import com.ingles.pojo.Estudiante;

@Controller
public class InglesController {
	
	@RequestMapping(value="/inicio", method = RequestMethod.GET)
	public String inicio(Model model) {
		model.addAttribute("mensaje", "Controlador Spring");
		return "index";
	}
	
	
	@RequestMapping(value="/datos/estudiante", method = RequestMethod.POST , consumes = MediaType.APPLICATION_JSON_VALUE )
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

}
