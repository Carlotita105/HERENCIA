package como.cursoceat.model;

public class Tren {
	
	
	Locomotora locomotora;
	Vagon[] vagones;
	Maquinista maquinista;
	private int numVagones;
	
	
	public Tren (Locomotora locomotora, Maquinista maquinista) {
		this.locomotora = locomotora;
		this.maquinista=maquinista;
		vagones=new Vagon[5];
		this.numVagones=0;
		
	}
	
	public void agregarVagon(int cargaMaxima, int cargaActual, String mercancia) {
		if (this.numVagones>=5) {
			System.out.println("No se pueden agregar más vagones");
		}else {
			Vagon v= new Vagon (this.numVagones,cargaMaxima,cargaActual,mercancia); 
			// aqui ^ creo un vagon
			vagones[numVagones]=v;
			++this.numVagones;
			
		}
	}
	
	public void mostrarTren() {
		System.out.println("El tren tiene " +numVagones + "vagones.");
		System.out.println("Los vagones tienen: ");
		
		for (Vagon va:vagones) {
			if(va==null) {
				
			
			break;
		}else {
	
			System.out.println("Carga actual: " +va.getCargaActual());
			System.out.println("Carga máxima: " +va.getCargaMax());
			System.out.println("Mercancia" +va.getMercancia());
			System.out.println("Maquinista: " +maquinista.getNombre());
			System.out.println("Matricula de la locomotora" +locomotora.getMatricula());
		}
	}
}
}
