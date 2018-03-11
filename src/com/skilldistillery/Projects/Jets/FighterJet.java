package com.skilldistillery.Projects.Jets;


public class FighterJet extends Jet implements CombatReady {
	
	public FighterJet(String model, double speed, long price, int range) {
		super(model, speed, price, range);
		
	}
	
	@Override
	public void fight() {
		System.out.println("PEW PEW PEW!");
		System.out.println("AAAAHHHHHH!!!");
	}
	
	public void fly() {
	}
	

}
