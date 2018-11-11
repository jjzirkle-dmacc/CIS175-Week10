package model;

public class Eagle {

	private String species;
	private double wingspan;
	private int age;
	
	public Eagle() {
		
	}
	
	public Eagle(String species, double wingspan, int age) {
		this.species = species;
		this.wingspan = wingspan;
		this.age = age;
	}
	
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public double getWingspan() {
		return wingspan;
	}
	public void setWingspan(double wingspan) {
		this.wingspan = wingspan;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String speak() {
		return "Caw!";
	}
	
}
