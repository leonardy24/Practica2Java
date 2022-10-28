import java.util.Scanner;


public class Ejercicio {
		public static void main(String[] args) {
			
			Scanner keyboard = new Scanner(System.in);
			
		
			
			
			
			
		
			int opcion;
			do {
				System.out.println("1. Gestores ");
				System.out.println("2. Gestores ");
				System.out.println("6. salir ");
				System.out.print("selecciona una opcion: ");
				opcion = keyboard.nextInt();
				if(opcion == 1) {
					System.out.println("Gestores seleccionado ");
				}else if(opcion ==2) {
					System.out.println("cliente seleccionado");
				}else if (opcion == 6) {
					System.out.println("saliendo");
				}else {
					System.out.println("no existe esta opcion");
				}
			}while(opcion != 6);
		
			keyboard.close();
		
		
		
		
		}
			 
				
				
	}

