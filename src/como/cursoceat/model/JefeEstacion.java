package como.cursoceat.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class JefeEstacion extends Empleado {
	
	
	private LocalDateTime nombramiento;
	DateTimeFormatter formato1=DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL,FormatStyle.SHORT).withLocale(Locale.getDefault());
	
	public JefeEstacion(LocalDate nombramiento) {
		this.nombramiento = LocalDateTime.now();
				

	
	}

	public JefeEstacion(String nombre, String dni, String telefono, double sueldo) {
		super(nombre, dni, telefono, sueldo);
		this.nombramiento=LocalDateTime.now();
	}
	
	public LocalDateTime getNombramiento() {
		return nombramiento;
	}
	
	@Override
	public void mostrarDatos() {
		super.mostrarDatos();
		System.out.println("Fecha de Nombramiento" +this.nombramiento.format(formato1));
	}
	

}
