package com.example.demo.services;

import org.springframework.stereotype.Service;

import com.example.demo.model.Edificio;


@Service
public class EdificioServiceImpl implements EdificioServiceI{
	
	private Edificio edificio;
	
	@Override
	public Edificio crearEdificio(Integer nPlantas, Integer nApartamentos) {
		this.edificio = new Edificio(nPlantas, nApartamentos);
		return this.edificio;
	}
	

	@Override
	public void mostrarTodo() {
		
		String[][] matriz = edificio.getPlanta();
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.err.println("["+i+"-"+j +"] "+ matriz[i][j]);
			}
		}
		
	}


	@Override
	public void search(String persona) {
		
		String[][] matriz = edificio.getPlanta();
		Boolean encontrado = false;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j] == persona) {
					System.err.println("Encontrado en el piso ["+i+"-"+j +"] ");
					encontrado = true;
				}
			}
		}
		if (!encontrado) {
			System.err.println("No ha habido coincidencias");
		}
		
	}





	@Override
	public void addPerson(String[][] planta) {
		edificio.setPlanta(planta);
		
	}





}
