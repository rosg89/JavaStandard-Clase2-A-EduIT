package com.educacionit.laboratorioclase2;

public class AppPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Domicilio d1 = new Domicilio("Av Santa Fe", "CABA", 5005); //Instancie el objeto con constructor
		/*
		d1.calle = "Mitre";
		d1.numero= 455;
		d1.localidad = "La Plata";
		*/
		
		Persona p1 = new Persona();
		p1.nombre = "Valeria";
		p1.apellido = "Alvarez";
		p1.domicilio = d1;
		p1.edad = 40;
		
		/*
		System.out.println(p1.nombre + " " + p1.apellido + " tiene " + p1.edad + 
		" años y se domicilia en la calle " + d1.calle + " " + d1.numero + " "
		+ "de la ciudad de "  + d1.localidad );
		*/
		
		
		System.out.println(p1.toString());
		

		


	}

}
