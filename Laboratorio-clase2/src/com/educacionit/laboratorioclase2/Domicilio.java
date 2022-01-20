package com.educacionit.laboratorioclase2;

public class Domicilio {
	
	public String calle;
	public int numero;
	public String localidad;
	
	
	

	public String toString() {
		return "Domicilio [calle=" + calle + ", numero=" + numero + ", localidad=" + localidad + "]";
	}
	
	//Constructor con 3 parametros
	public Domicilio(String calle, String localidad, int numero) {
		this.calle = calle;
		this.localidad = localidad;
		this.numero = numero;
		//Significa que calle de arriba de todo, es calle de adentro del parametro
		
	}

	//Constructor vacio
	public Domicilio() {
		
	}
	
	
	
	
	

}
