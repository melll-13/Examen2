package examen2;

import java.util.Random;

public abstract class personaje {	
	private String nombre;
	private boolean esEstudiante;
	private boolean esAlto;
	private boolean esInteligente;
	private boolean estaFeliz;
	
	Random random = new Random();
	boolean randomAtributo1 = random.nextBoolean();
	boolean randomAtributo2 = random.nextBoolean();
	boolean randomAtributo3 = random.nextBoolean();
	boolean randomAtributo4 = random.nextBoolean();

	public personaje(String nombre, boolean esEstudiante, boolean esAlto, boolean esInteligente, boolean esFeliz) {
		this.nombre = nombre;
		this.esEstudiante = randomAtributo1;
		this.esAlto = randomAtributo2; 
		this.esInteligente = randomAtributo3;
		this.estaFeliz = randomAtributo4; 
	}	
	
	public String getnombre(){
		return nombre;
	}
	public boolean getesEstudiante(){
		return esEstudiante;
	}
	public boolean getesAlto(){
		return esAlto;
	}
	public boolean getesInteligente(){
		return esInteligente;
	}
	public boolean getestaFeliz(){
		return estaFeliz;
	}
	public void eliminarnombre(){
		this.nombre = null;
	}
	public String setnombre(String nombre){
		return this.nombre = nombre;
	}
}
