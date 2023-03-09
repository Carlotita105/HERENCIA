package como.cursoceat.model;


public class Maquinista extends Empleado {
	private String rango;
		


	public Maquinista(String rango) {
		this.rango=rango;
	}


	public Maquinista(String nombre, String dni, String telefono, double sueldo, String rango) {
		super(nombre, dni, telefono, sueldo);
		this.rango=rango;
	
	
	}


	public String getRango() {
		return rango;
	} 
	
	public void getRango (String rango) {
		this.rango=rango;
		
		

	}
	@Override
	public void mostrarDatos() { 
		super.mostrarDatos();
		System.out.println("El rango es:" +this.rango);
	}
	}
	


