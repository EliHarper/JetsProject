package com.skilldistillery.Projects.Jets;

import java.util.ArrayList;

public class CargoPlane extends Jet implements CargoCarrier {
	
	public CargoPlane(String model, double speed, long price, int range) {
		super(model, speed, price, range);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void loadCargo() {
		// TODO Auto-generated method stub
	}
	
	ArrayList <Jet> jets = JetsApp.airfield.getJets();
	
	public void fly() {
		for (int i = 0; i < jets.size(); i++) {
			System.out.println("WHoOOooOsssshhh");
		}
	}
	
}
