package app.curso.banco.entidad;

public class Cliente extends Personas {

	private float totalDinero;
	private float agregarDinero;
	private float retirarDinero;
	

	public Cliente() {
		
	}
	
	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("total dinero:" + this.totalDinero + "€" );
	
	}
	
	
	
	public Cliente( int id, String nombre, String telefono, float totalDinero) {
		super(id,  nombre, telefono);
		this.totalDinero = totalDinero;
	}

	//funcion agregar dinero
	public float agregarDinero(float agregarDinero) {
		this.totalDinero += agregarDinero;
		System.out.println("se agrego:" + agregarDinero );
		return this.totalDinero;
	}
	
	//funcion retirar dinero
	public float retirarDinero(float dinero) {
		if(this.totalDinero - dinero > 0 ) {
		this.totalDinero -= dinero;
		System.out.println("se retiro:" + retirarDinero );
		}else {
			System.out.println("dinero insuficeite" );
		}return this.totalDinero;
	}
	
	
	public  float  getTotalDinero() {
		return this.totalDinero;
	}
	
	public  void  setTotalDinero(float totalDinero) {
		this.totalDinero = totalDinero;
	}
	
	
	public float getAgregarDinero() {
		return agregarDinero;
	}

	public void setAgregarDinero(float agregarDinero) {
		this.agregarDinero = agregarDinero;
	}

	public float getRetirarDinero() {
		return retirarDinero;
	}

	public void setRetirarDinero(float retirarDinero) {
		this.retirarDinero = retirarDinero;
	}
	
	
}
