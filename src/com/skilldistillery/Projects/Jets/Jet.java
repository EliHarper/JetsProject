package com.skilldistillery.Projects.Jets;

import java.util.ArrayList;

public abstract class Jet {
	private String model;
	private double speed;
	private int range;
	private long price;
	
	public Jet(String model, double speed, long price, int range) {
		this.setModel(model);
		this.price = price;
		this.setSpeed(speed);
		this.setRange(range);
	}
	
	
	public void fly(ArrayList <Jet> jets) {
		
	}
	
	public double getSpeedInMach(double speed) {
		double speedInMach = 0;
		
		return speedInMach;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Jet model:");
		builder.append(model);
		builder.append(", speed: ");
		builder.append(speed);
		builder.append(", range: ");
		builder.append(range);
		builder.append(", price: ");
		builder.append(price);
		builder.append("");
		return builder.toString();
	}
	
}

