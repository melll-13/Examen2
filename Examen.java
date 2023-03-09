package examen2;

import java.util.Random;
import java.util.Scanner;

public class Examen2 {
public static void main(String[] args){
	
		String [] nombre = {"Fransisco", "Mateo", "Andrea", "Leo", "Maria","Carla","Diego","Sara","Lucas","Daniela"};
		
		Random random = new Random();
		personaje[] personalist = new personaje[10];
			for(int k=0; k<10; k++){
			int randomNum = random.nextInt(10);
			
			while(nombre[randomNum] == ""){
			randomNum = random.nextInt(10);
			}
			
			personalist[k] = new personaje(null, false, false, false, false){};
			String randomnombre = nombre[randomNum];
			nombre[randomNum] = "";
			personalist[k].setnombre(randomnombre);
			}
		
			int esEstudianteContador = 0;
			int esAltoContador = 0;
			int esInteligenteContador = 0;
			int estaFelizContador = 0;
			
			for (int i=0; i<=personalist.length-1; i++){
				if(personalist[i].getesEstudiante()){
					esEstudianteContador++;
				}
				if(personalist[i].getesAlto()){
					esAltoContador++;
				}
				if(personalist[i].getesInteligente()){
					esInteligenteContador++;
				}
				if(personalist[i].getestaFeliz()){
					estaFelizContador++;
				}
			}
			
			System.out.println("Cantidad de veces que se usaron los atributos: ");
			System.out.println("Atributo - Es estudiante: " + esEstudianteContador);
			System.out.println("Atributo - Es alto: " + esAltoContador);
			System.out.println("Atributo - Es inteligente: " + esInteligenteContador);
			System.out.println("Atributo - Esta feliz: " + estaFelizContador);
			
			
			while(true){
				System.out.println("\nPersonajes:");
				int desconocido = random.nextInt(10);
					for (int i=1; i<=personalist.length-1; i++){
						System.out.println(i + " - " + personalist[i].getnombre() + ": Es estudiante (" + personalist[i].getesEstudiante() + "), Es alto (" + personalist[i].getesAlto() + "), Es inteligente (" + personalist[i].getesInteligente() + "), Esta feliz (" + personalist[i].getestaFeliz() + ")");
					}
          
			try (Scanner entrada = new Scanner(System.in)){
				for (int i=0; i<=2; i++){
			
			System.out.println("\nSelecciona una pregunta: Ingresa el numero que correspoda a la pregunta");
			System.out.println("1 - ¿Es Estudiante?");
			System.out.println("2 - ¿Es Alto?");
			System.out.println("3 - ¿Es Inteligente?");
			System.out.println("4 - ¿Esta Feliz?");
		         
			int respuesta = Integer.parseInt(entrada.next());
			 
			switch(respuesta){
			
			//pregunta 1 - ¿Es estudiante?
			case 1:    
			System.out.println("\nlos siguientes personajes son estudiantes:");
			for (int j=0; j<=personalist.length-1; j++){
				if(personalist[j].getesEstudiante() == personalist[desconocido].getesEstudiante() && personalist[j].getnombre() != null){
				System.out.println(j + " - " + personalist[j].getnombre());
				} else{
				personalist[j].eliminarnombre();
				}
			}
			break;
		 		    
			//pregunta 2 - ¿Es alto?
			case 2:
			System.out.println("\nlos siguientes personajes son altos:");
			for (int j=0; j<=personalist.length-1; j++){
				if(personalist[j].getesAlto() == personalist[desconocido].getesAlto() && personalist[j].getnombre() != null){
				System.out.println(j + " - " + personalist[j].getnombre());
				} else{
				personalist[j].eliminarnombre();
				}
			}
			break;
		    
			//pregunta 3 - ¿Es inteligente?
			case 3:
		    System.out.println("\nlos siguientes personajes son inteligentes:");
			for (int j=0; j<=personalist.length-1; j++){
				if(personalist[j].getesInteligente() == personalist[desconocido].getesInteligente() && personalist[j].getnombre() != null){
				System.out.println(j + " - " + personalist[j].getnombre());
				} else{
				personalist[j].eliminarnombre();
				}
			}
			break;
		    
			//pregunta 4
			case 4:
			System.out.println("\nlos siguientes personajes estan felices");
			for (int j=0; j<=personalist.length-1; j++){
				if(personalist[j].getestaFeliz() == personalist[desconocido].getestaFeliz() && personalist[j].getnombre() != null){
					System.out.println(j + " - " + personalist[j].getnombre());
				} else{
				personalist[j].eliminarnombre();
				}
			}
			break;
			}
			}
				
			System.out.println("\n¡Adivina quien es! Ingresa el numero que correspoda al personaje");
			int adivinaquien = Integer.parseInt(entrada.next());
			if(adivinaquien == desconocido){
				System.out.println("Es correcto!");
				}else{
				System.out.println("Es incorrecto.");
				}
			}
		}	
}
}
