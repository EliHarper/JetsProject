package com.skilldistillery.Projects.Jets;

import java.util.ArrayList;
import java.util.Scanner;

public class JetsApp {
	private Scanner kb = new Scanner(System.in);
	private int longestRange = 0;
	private double greatestSpeed = 0;
	private int indexOfLongestRange = -1;
	private int indexOfGreatestSpeed = -1;

	public static void main(String[] args) {

		JetsApp jetsApp = new JetsApp();
		AirField airfield = new AirField();
		ArrayList <Jet> jets = airfield.getJets();
		jetsApp.launch(jets);

	}

	public void launch(ArrayList <Jet> jets) {
	    
		/*
		 * 
		 * Normal array style:
	    Jet[] jets = new Jet[100];
		
		CargoPlane airbus = new CargoPlane("a380", 634, 445_000_000, 9445);
		CargoPlane toyPlane = new CargoPlane("Sky Glider", 20, 3, 1/0); 
		FighterJet blackbird = new FighterJet("SR-71", 2200, 33_000_000, 3338);
		FighterJet impractical = new FighterJet("X-15", 4520, 7_300_000, 280);
		CargoPlane biplane = new CargoPlane("Fiat CR.42", 323, 973_000, 780);
		
		jets[0] = airbus;
		jets[1] = toyPlane;
		jets[2] = blackbird;
		jets[3] = impractical;
		jets[4] = biplane;
		*/
		
		userMenu(jets);
		
		

	}
	
	private void userMenu(ArrayList <Jet> jets) {
		System.out.println(" Welcome to the Airfield! \n");
		System.out.println("**************************");
		System.out.println("*________________________*");
		System.out.println("*       Main Menu        *");
		System.out.println("*________________________*");
		System.out.println("**************************");
		System.out.println("1: List fleet");
		System.out.println("2: Fly all jets");
		System.out.println("3: View jet with longest range");
		System.out.println("4: View fastest jet");
		System.out.println("5: Add a jet to the fleet");
		System.out.println("6: Quit");

		int userChoice = kb.nextInt();

	switch (userChoice) {
			case 1:
				System.out.println("Initial number of jets: " + jets.size());
				for (int i = 0; i < jets.size(); i++) {
					System.out.println(jets.get(i).toString());
					
				}
				break;
			case 2:
	//			for (int i = 0; i < jets.size(); i++) {
	//				jets[i].fly();
	//			}
				System.out.println("Scramble the jets!!!");
				for (int i = 0; i < jets.size(); i++) {
					System.out.println(jets.get(i).getModel() + ": ");
					System.out.println("Whoosh!");
				}
				
				break;
				
			case 3:
				
				for (int i = 0; i < jets.size(); i++) {
					if (jets.get(i).getRange() > longestRange) {
						longestRange = jets.get(i).getRange();
						indexOfLongestRange = i;
					}
				}
				//Printing the value for the jet
				System.out.println("The jet with the longest range is " + jets.get(indexOfLongestRange).getModel() + ", with a range of " + longestRange);
				
				
				break;
			case 4:
				for (int i = 0; i < jets.size(); i++) {
					if (jets.get(i).getSpeed() > greatestSpeed) {
						greatestSpeed = jets.get(i).getSpeed();
						indexOfGreatestSpeed = i;
					}
					//Printing the value for the jet
				}
				System.out.println("The fastest jet is " + jets.get(indexOfGreatestSpeed).getModel() + ", with a speed of " + greatestSpeed);
				
				break;
			case 5:
				System.out.println("Would you like to add a cargo plane or a fighter jet?");
				String cpOrFJ = kb.next();
				
				if (cpOrFJ.equalsIgnoreCase("cargo plane")) {
					
					System.out.println("What is its model?");
					String newModel = kb.next();
					
					System.out.println("What is its max speed?");
					double newSpeed = kb.nextDouble();
					
					System.out.println("How much does it cost?");
					long newPrice = kb.nextLong();
					
					System.out.println("What is its range?");
					int newRange = kb.nextInt();
					
					jets.add(new CargoPlane (newModel, newSpeed, newPrice, newRange));
					
					System.out.println("New number of jets: " + jets.size() );
					
				}
				else {
					System.out.println("What is its model?");
					String newModel = kb.next();
					
					System.out.println("What is its max speed?");
					double newSpeed = kb.nextDouble();
					
					System.out.println("How much does it cost?");
					long newPrice = kb.nextLong();
					
					System.out.println("What is its range?");
					int newRange = kb.nextInt();
					
					jets.add(new FighterJet(newModel, newSpeed, newPrice, newRange));
					
					System.out.println("New number of jets: " + jets.size() );
					
				}
				break;
			case 6:
				System.out.println("Goodbye!");
				break;
				
			default:System.out.println("Please enter a valid number");
		}

	
	}
	
	/*
	private  addJet(ArrayList <Jet> jets) {
		
	}
		System.out.println("Would you like to create a cargo plane or a fighter jet?");
		String cpOrFJ = kb.next();
		
		System.out.println("What would you like its name to be?"); 
		// ^ more of a variable name than an actual name	
		String varName = kb.next();
		
		System.out.println("What is its model?");
		String newModel = kb.next();
		
		System.out.println("What is its max speed?");
		double newSpeed = kb.nextDouble();
		
		System.out.println("How much does it cost?");
		long newPrice = kb.nextLong();
		
		System.out.println("What is its range?");
		int newRange = kb.nextInt();
		
		
		
		int notNullCounter = 0;
		int indexCounter = 0;
		*/
		/*
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] != null) {
				notNullCounter++;
			}
		}
		
		Jet newJetsArr[] = new Jet[notNullCounter];
		
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] != null) {
				jets[i] = newJetsArr[indexCounter];
				indexCounter++;
			}
		}
		
		return newJetsArr;
	}
	
	*/
	

	
}
