
public class Estudiante {

	//atributos
	private int id;
	private int edad;
	private String telefono;
	private int numeroDeNotas;
	private float sumaDeNotas;
	private float notaMedia;
	

 //contructor
public Estudiante () {
	this.id = 001;
	this.edad = 0;
	this.telefono= "607796665";
	this.numeroDeNotas = 0;
	this.sumaDeNotas = 0;
	this.notaMedia = 0;
}

	//constructor paramaterizado
	Estudiante (int id, int edad , String telefono ) {
	this.id = id;
	this.edad = edad;
	this.telefono= telefono;
	this.numeroDeNotas = 0 ;
	this.sumaDeNotas =0;
	this.notaMedia = 0;
					
}
	//constructor paramaterizado
	Estudiante (int id, String telefono, int edad  ) {
	this.id = id;
	this.edad = edad;
	this.telefono= telefono;
	this.numeroDeNotas = 0 ;
	this.sumaDeNotas = 0;
	this.notaMedia = 0;
					
		

	}
	//consultores
public int getId() {
	return this.edad;
}

public float getnotaMedia() {
	return this.notaMedia;
}
	
 	//modificadores
public void setId() {
	
}


	
	//metodos
	public	void mostrarInfo ( ) {
		System.out.println("id:" + this.id );
		System.out.println("edad:" + this.edad );
		System.out.println("telefono:" + this.telefono );
		System.out.println("numero de notas: " + this.numeroDeNotas );
		System.out.println("suma de notas:" + this.sumaDeNotas );
		System.out.println("nota media:" + this.notaMedia );
	}
	
	
	public	void agregarNuevaNota (float nota) {
		this.numeroDeNotas+= 1;
		this.sumaDeNotas+= nota;
		this.notaMedia = this.sumaDeNotas / this.numeroDeNotas;
		
	}

	
	public void reiniciarNotas (){
		this.numeroDeNotas = 0;
		this.sumaDeNotas = 0;
		this.notaMedia = 0;
		this.telefono= "0";
	}
	
	//comparacion de estudiante
	public static Estudiante comparacionEstudiante (Estudiante notaMedia1  , Estudiante notaMedia2 ) {
		
		if(notaMedia1.getnotaMedia() > notaMedia2.getnotaMedia()) {
			notaMedia1.mostrarInfo();
			System.out.println("Estudiante1 tiene mejor promedio");
		}else {
			notaMedia2.mostrarInfo();
			System.out.println("Estudiante2 tiene mejor promedio" );
		}
		
	   return null;
		
		
		
	}
	
	
	///metodos estaticos alejandro///
	
	public static Estudiante crearEstudiante ( ) {
		
		return new Estudiante();
	}
	
	
	//Sobrecarga
	public	void agregarNuevaNota (float nota, boolean reiniciar) {
		if(reiniciar) {
			this.numeroDeNotas= 0;
			this.sumaDeNotas= 0;
			this.notaMedia = 0;
		} 
			
		agregarNuevaNota(nota);	
		
		
		
		
	}
	
	
}

