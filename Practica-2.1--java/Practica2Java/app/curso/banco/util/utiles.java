package app.curso.banco.util;

import java.util.Random;

public class utiles {

	
		
		public  static final String[]  NOMBRES = {"juan", "pedro", "maria" , "alejandro"};
		
		public static final String[] APELLIDOS = {"Escalona", "Mora", "marquina","Marquina"};
		
		
		
		public static String nombreAleatorio() {
		
		Random random = new Random();
		
		int indexNombre = random.nextInt(NOMBRES.length);
		String nombreAleatorio = NOMBRES[indexNombre];
		
		int indexApellido = random.nextInt(APELLIDOS.length);
		String apellidoAleatorios = APELLIDOS[indexApellido];
		
		String nombreCompleto = nombreAleatorio + " " + apellidoAleatorios;
		
		System.out.print(nombreCompleto);
		
		
		return nombreCompleto;
		}	
		
	}


