package com.example.demo.services;

import com.example.demo.model.Edificio;

public interface EdificioServiceI {
	
	public Edificio crearEdificio(Integer nPlantas, Integer nApartamentos);
	
	public void mostrarTodo();
	
	public void addPerson(String[][] planta);
	
	public void search(String persona);

}


/*
1.- crear edificio
2.- añadir persona al edificio
3.- mostrar las personas que viven en cada apartamento del edificio
4.- buscar una persona en el edificio por su nombre completo
*/