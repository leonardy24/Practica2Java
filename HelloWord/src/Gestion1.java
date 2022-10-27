import java.util.Scanner;

public class Gestion1 {

	
	public static void main(String[] args) {
	
		//hecho por el profesor
		
		Scanner keyboard = new Scanner(System.in);
		
		Estudiante estudianteNuevo = null;
		
		int menu = -1;
		
		
		
		do {
			
			System.out.println("1. crear estudainte ");
			System.out.println("2. ver estudiante ");
			System.out.println("3. agregat notas");
			System.out.println("4. reiniciar notas");
			System.out.println("0. salir ");
			System.out.print("opcion:" );
			
			menu = keyboard.nextInt();
			
			
			switch(menu) {
			
			case  0 : 
			System.out.print("saliendo" );
			
			break;
			
			case 1: System.out.print("crear estudiante" );
			estudianteNuevo = new Estudiante ();
			
			break;
				
				
			case 2: System.out.print("mostrar estudiante" );
				if(estudianteNuevo != null ) {
					estudianteNuevo.mostrarInfo();
				}else {
					System.out.print("todavia no ahi estudiante" );
				}
				
			
			break;
			
			case 3: System.out.print("añadir nota:" );
			if(estudianteNuevo != null ) {
			float nuevaNota = keyboard.nextFloat();
			estudianteNuevo.agregarNuevaNota(nuevaNota);
			}
			else {
				System.out.print("todavia no ahi estudiante" );
			}
			
			
			break;
			
			case 4: System.out.print("crear estudainte" );
			
			if(estudianteNuevo != null ) {
				
				estudianteNuevo.reiniciarNotas();
			}
			
			break;
			
			default:
				
				
				
				
				
			}
			
		}while(menu == 0);
		
		
		
		keyboard.close();
		
	
	}
	
}
