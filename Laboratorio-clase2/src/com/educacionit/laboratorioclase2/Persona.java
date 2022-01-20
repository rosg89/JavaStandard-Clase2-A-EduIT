package com.educacionit.laboratorioclase2;

public class Persona {
	
	public String nombre;
	public String apellido;
	public int edad;
	public Domicilio domicilio;
	
	//Metodo para mostrar el estado de todos los atributos
	//Metodo heredado de object
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", domicilio=" + domicilio
				+ "]";
	}
	

}
