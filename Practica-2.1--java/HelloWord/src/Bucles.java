
public class Bucles {

		public static void main(String[] args) {
			
			
			int contador = 0;
			
			while( contador < 10) {
				
				contador++;
				System.out.println(contador);
			
			}
			
				int contador1 = 10;
				
				while( contador1 > 0) {
			
					System.out.println(contador1);
					contador1--;
				
			}
				int edad = 25;
				
				do {
					
					System.out.println("Edad: " + edad);
					edad++;
				
				} while (edad < 18);
	
	System.out.println("----------------------EJERCICIO TABLA DE MULTIPLICAR CON BUCLE FOR-------------------");
	System.out.println("----------------------EJERCICIO 1 Y 2--------------------");
	
					System.out.println("----------------------MULTIPLICAR 1--------------------");
			for(int i = 0; i <= 10 ; i++) {
				System.out.printf("1"+ "x"+ i +"="+ 1 * i).println();
					};
					System.out.println("----------------------MULTIPLICA 2 --------------------");
			for(int i = 0; i <= 10 ; i++) {
				System.out.printf("2"+ "x"+ i +"="+ 2 * i).println();
					};
					System.out.println("----------------------MULTIPLICAR 3--------------------");					
			for(int i = 0; i <= 10 ; i++) {
				System.out.printf("3"+ "x"+ i +"="+ 3 * i).println();
					};
					System.out.println("----------------------MULTIPLICAR 4--------------------");		
			for(int i = 0; i <= 10 ; i++) {
				System.out.printf("4"+ "x"+ i +"="+ 4 * i).println();
					};
					System.out.println("----------------------MULTIPLICAR 5--------------------");
			for(int i = 0; i <= 10 ; i++) {
				System.out.printf("5"+ "x"+ i +"="+ 5 * i).println();
					};
					System.out.println("----------------------MULTIPLICAR 6--------------------");
			for(int i = 0; i <= 10 ; i++) {
				System.out.printf("6"+ "x"+ i +"="+ 6 * i).println();
					};		
					System.out.println("----------------------MULTIPLICAR 7--------------------");	
			for(int i = 0; i <= 10 ; i++) {
				System.out.printf("7"+ "x"+ i +"="+ 7 * i).println();
					};
					System.out.println("----------------------MULTIPLICAR 8--------------------");
	    	for(int i = 0; i <= 10 ; i++) {
				System.out.printf("8"+ "x"+ i +"="+ 8 * i).println();
					};
					System.out.println("----------------------MULTIPLICAR 9--------------------");
			for(int i = 0; i <= 10 ; i++) {
				System.out.printf("9"+ "x"+ i +"="+ 9 * i).println();
					};
												
					System.out.println("----------------------EJERCICIO 2--------------------");
					
		int acumulado = 0;
					
		for( int i = 5; i >= 1  ; i--) {
		
			acumulado = acumulado + i;
			
			System.out.println(acumulado);
		}
					
		System.out.println("----------------------EJERCICIO 33 1--------------------");
					
					int n = 19;
					
					int i = n;
							
							if(i > 1  && i%2 ==0 && i / 1 == i) {
								System.out.printf(" %d primo", n);
							}
							else {
								System.out.printf(" %d no es primo", n);
							}
				
							System.out.println("----------------------EJERCICIO 3.2--------------------");
							
							int m = 1;
							
							boolean primo = true;
							for(int j = 2; j < m ; j++) {
								if(m % j == 0) {
									primo = false;
								}
							}
							if(primo) {
								System.out.printf("%d es primo", m);	
							}
							else {
								System.out.printf("%d no es primo", m);	
							}
}		
}