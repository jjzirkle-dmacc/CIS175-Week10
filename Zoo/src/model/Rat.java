package model;

public class Rat {
	private String name;
	private double tailLength; //full length of the tail
	private int numberDisease; //number of diseases the rat currently carries
	
	
	public Rat() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Rat(String name, double tailLength, int numberDisease) {
		super();
		this.name = name;
		this.tailLength = tailLength;
		this.numberDisease = numberDisease;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getTailLength() {
		return tailLength;
	}
	public void setTailLength(double tailLength) {
		this.tailLength = tailLength;
	}
	public int getNumberDisease() {
		return numberDisease;
	}
	public void setNumberDisease(int numberDisease) {
		this.numberDisease = numberDisease;
	}
	
	public String speak() {
		return "Squeak!";
	}

}
