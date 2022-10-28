import java.util.Scanner;


public class Escaner {
		public static void main(String[] args) {
			
			Scanner keyboard = new Scanner(System.in);
			
			System.out.print("Introduce un numero: ");
			
			int numero = keyboard.nextInt();
			
			keyboard.close();
			
		
		
			switch (numero) {
				
				case 1 : 
					System.out.print("gestores");
					
					break;
					
				case 2 : 
					
					System.out.println("Cliente" );	
					break;
					
				case 3 : 
					System.out.println("Transferencia" );	
					break;
				
				case 4 : 
					System.out.println("Mensaje" );	
					break;
				
				case 5 : 
					System.out.println("Prestamo" );	
					break;
				
				case 6 : 
					System.out.println("Salir" );	
					break;
			}
			
		
		
		
		
		
		
		}
			 
				
				
	}

