package com.skilldistillery.Projects.Jets;

import java.util.ArrayList;

public class FighterJet extends Jet implements CombatReady {
	

	public FighterJet(String model, double speed, long price, int range) {
		super(model, speed, price, range);
		
	}
	
	ArrayList <Jet> jets = JetsApp.airfield.getJets();
	
	@Override
	public void fight() {
		System.out.println("PEW PEW PEW!");
		System.out.println("AAAAHHHHHH!!!");
	}
	
	public void fly() {
		for (int i = 0; i < jets.size(); i++) {
			System.out.println("WHoOOooOsssshhh");
		}
	}
	

}
