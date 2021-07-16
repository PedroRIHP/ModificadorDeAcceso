package Paquete1;

public class Persona {
	
	//Modificador de acceso default, se puede acceder a los atributos
	// y objetos dentro del mismo paquete
	String nombre = "";
	//Modificador de acceso privado, se puede acceder solo dentro de la misma
	// clase
	private int edad = 0;
	//Modificador Protected, puede ser accedido dentro de la misma clase y el 
	//mismo paquete
	protected String domicilio = "";
	//Modificador public, se puede acceder desde la misma clasee, y otros
	//paquetes
	public float estatura = 0 ;
	
	
	String saludar() {
		return "Hola mi nombre es " + this.nombre + "mi edad es" + this.edad + "mi domicilio es " + domicilio;
	}

}
