package app.curso.banco.entidad;

public class Gestor extends Personas {

	protected int idOficina;
	
	public Gestor  ( int id, String nombre, String telefono, int idOficina) {
		super(id , nombre , telefono);
		this.idOficina = idOficina;
	
	
	}

	public int getIdOficina() {
		return idOficina;
	}

	public void setIdOficina(int idOficina) {
		this.idOficina = idOficina;
	}
	
}
