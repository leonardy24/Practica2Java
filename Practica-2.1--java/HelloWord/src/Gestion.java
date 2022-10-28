import java.util.Scanner;

public class Gestion {

	public static void main(String[] args) {
		
		Estudiante estudianteNuevo = null;
		
		int consulta = 0;
		
		do {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Introduce un numero: ");
		
		consulta = keyboard.nextInt();
		
		keyboard.close();
		
		
		
		switch (consulta) {
		
		case 1 : 
			System.out.print("crear estudiante");
			
			
			estudianteNuevo = Estudiante.crearEstudiante();
			estudianteNuevo.mostrarInfo();
			System.out.println("se creado un nuevo estudiante");
		
			break;
			
			
		case 2 : 
			
			System.out.println("visualiza estudiante" );	
			
			estudianteNuevo.mostrarInfo();
			
			break;
			
		case 3 : 
			
			
			
			System.out.println("añadir nueva nota al estudiante" );	
			break;
		
		case 4 : 
			System.out.println("reiniciar las notas del estudiante" );	
			break;
		
		case 5 : 
			System.out.println("reiniciar las notas del estudiante" );	
			break;
		
	}
	
		}while(consulta != 0 );

		
		
		
	}
	
}
