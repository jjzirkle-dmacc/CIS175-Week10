package model;

public class Snake {
	
	private double inchLength;
	private boolean venomous;
	private String speciesName;
	
	public Snake() {
		super();
	}

	public Snake(double inchLength, boolean venomous, String speciesName) {
		super();
		this.inchLength = inchLength;
		this.venomous = venomous;
		this.speciesName = speciesName;
	}

	public double getInchLength() {
		return inchLength;
	}

	public void setInchLength(double inchLength) {
		this.inchLength = inchLength;
	}

	public boolean isVenomous() {
		return venomous;
	}

	public void setVenomous(boolean venomous) {
		this.venomous = venomous;
	}

	public String getSpeciesName() {
		return speciesName;
	}

	public void setSpeciesName(String speciesName) {
		this.speciesName = speciesName;
	}
	
	public String speak() {
		return "Sssssssssssssssss";
	}

}
