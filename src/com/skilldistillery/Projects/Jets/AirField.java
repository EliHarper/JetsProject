package com.skilldistillery.Projects.Jets;

import java.util.ArrayList;

public class AirField {
	private ArrayList<Jet> jets;
	public AirField(){
		jets = new ArrayList<Jet>();
		
		jets.add( new CargoPlane ("a380", 634, 445_000_000, 9445));
		jets.add( new CargoPlane ("Sky Glider", 20, 3, 10));
		jets.add( new FighterJet ("SR-71", 2200, 33_000_000, 3338));
		jets.add( new FighterJet("X-15", 4520, 7_300_000, 280));
		jets.add( new CargoPlane("Fiat CR.42", 323, 973_000, 780));
	}
	
	public ArrayList <Jet> getJets(){
		return jets;
	}
}