package app.curso.banco.entidad;

public class Personas {

	protected int id;
	protected  String nombre;
	protected  String telefono;
	
	 
	//contructor por defecto
	Personas(){
		 }
	 
	 
	
	//contructor parametrizado
	Personas (int id, String nombre, String telefono ) {
		 	this.id = id;
		 	this.nombre = nombre;
			this.telefono = telefono;
		 
		 
	}

	public void mostrarInfo() {
		System.out.println("Id:" + this.id );
		System.out.println("Nombre:" + this.nombre );
		System.out.println("Telefono:" + this.telefono );
		
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
}