package como.cursoceat.model;

public class Locomotora {
	
	private String matricula;
	private int potencia;
	private int anioFabricacion;
	Mecanico responsable;
	
	public Locomotora(String matricula, int potencia, int anioFabricacion, Mecanico responsable) {
		this.matricula = matricula;
		this.potencia = potencia;
		this.anioFabricacion = anioFabricacion;
		this.responsable = responsable;
	}

	public Locomotora() {
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getAnioFabricacion() {
		return anioFabricacion;
	}

	public void setAnioFabricacion(int anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}

	public Mecanico getResponsable() {
		return responsable;
	}

	public void setResponsable(Mecanico responsable) {
		this.responsable = responsable;
	}

	@Override
	public String toString() {
		return "Locomotora [matricula=" + matricula + ", potencia=" + potencia + ", anioFabricacion=" + anioFabricacion
				+ ", responsable=" + responsable + "]";
	}
	
	}


