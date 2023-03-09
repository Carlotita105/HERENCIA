package com.cursoceat.model;

import java.util.ArrayList;

import como.cursoceat.model.Empleado;
import como.cursoceat.model.JefeEstacion;
import como.cursoceat.model.Locomotora;
import como.cursoceat.model.Maquinista;
import como.cursoceat.model.Mecanico;
import como.cursoceat.model.Mecanico.ESPECIALIDAD;
import como.cursoceat.model.Tren;

public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crear un array y vamos guardando
		ArrayList<Empleado> misEmpleados=new ArrayList<Empleado>();
		Mecanico unMecanico=new Mecanico("JD", "0685478F", "6675859", 1000, ESPECIALIDAD.ELECTRICIDAD);
		misEmpleados.add(unMecanico);
		//unMecanico.mostrarDatos();
		//System.out.println(unMecanico.toString());
		Maquinista unMaquinista=new Maquinista("Pedro", "0658488X", "6582514", 12050.50, "Jefe Seccion");
		//unMaquinista.mostrarDatos();
		misEmpleados.add(unMaquinista);
		JefeEstacion unJefeEstacion=new JefeEstacion("Diego", "03754315B", "6589425", 1080.00);
		//unJefeEstacion.mostrarDatos();
		misEmpleados.add(unJefeEstacion);
		JefeEstacion unJefeEstacion2=new JefeEstacion("Azucena", "6545", "8785487", 1045.80);
		misEmpleados.add(unJefeEstacion2);
		
		//nuestro en este momento lo que tengo en mis empleados 
		for (Empleado e:misEmpleados) {
			e.mostrarDatos();
		}
		//*************************************************************************************
		System.out.println("******Desde aqio ejecutamos Maquinaria*********");
		Locomotora unaLocomotora=new Locomotora("584580", 1500, 2005, unMecanico);
		System.out.println(unaLocomotora.toString());
		System.out.println("****************************");
		Tren miTren=new Tren(unaLocomotora, unMaquinista);
		
		miTren.agregarVagon(30000, 15000, "bombillas");
		
		miTren.mostrarTren();
	}

}
