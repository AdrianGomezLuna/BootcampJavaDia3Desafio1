package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Edificio;
import com.example.demo.services.EdificioServiceI;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{
	
	@Autowired
	private EdificioServiceI edificioServicio;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//Creación del edificio
		Integer nPlantas = 3;
		Integer nApartamentos = 4;
		Edificio edificio = edificioServicio.crearEdificio(nPlantas, nApartamentos);
		
		
		String[][] planta = new String[nPlantas][nApartamentos];
		planta[0][0] = "Adrian";
		//edificioServicio.addPerson(planta);
		planta[0][1] = "Rosa";
		//edificioServicio.addPerson(planta);
		planta[0][2] = "Ana";
		//edificioServicio.addPerson(planta);
		planta[0][3] = "Juan";
		//edificioServicio.addPerson(planta);
		planta[1][0] = "Rashid";
		//edificioServicio.addPerson(planta);
		planta[2][1] = "Mustafad";
		//edificioServicio.addPerson(planta);
		planta[2][3] = "Gustavo";
		//edificioServicio.addPerson(planta);
		planta[2][2] = "Rosa";
		//edificioServicio.addPerson(planta);
		
		edificio.setPlanta(planta);
		
		//Mostrar Todos
		edificioServicio.mostrarTodo();

		
		//Búsqueda
		System.err.println("BUSQUEDA de Rosa");
		String busqueda = "Rosa";
		edificioServicio.search(busqueda);
		System.err.println("BUSQUEDA de Antonio");
		String busqueda2 = "Antonio";
		edificioServicio.search(busqueda2);
		
		
	}

}
