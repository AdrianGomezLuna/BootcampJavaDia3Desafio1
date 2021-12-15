package com.example.demo.model;

public class Edificio {
	
	private String[][] planta;
	
	public Edificio(int planta, int apartamento){
		this.planta = new String[planta][apartamento];
	}

	public String[][] getPlanta() {
		return planta;
	}

	public void setPlanta(String[][] planta) {
		this.planta = planta;
	}	

}
