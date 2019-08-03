package com.ingles.prueba;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Principal {
	
	public static void main(String [] args) {
		
		String timeStamp = new SimpleDateFormat("dd/MM/yyyy-HH:mm:ss").format(new Date());
		
		System.out.println(timeStamp); 
		
	}
	
	
}
