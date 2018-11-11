package model;

public class RedPanda {
	
	private String name;
	private String countryOfOrigin;
	private MaleOrFemale maleOrFemale;
	
	public enum MaleOrFemale {
		MALE,
		FEMALE,
	}
	
	public RedPanda() {
	}
	
	public RedPanda(String n, String coo, MaleOrFemale mf) {
		this.name = n;
		this.countryOfOrigin = coo;
		this.maleOrFemale = mf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

	public MaleOrFemale getMaleOrFemale() {
		return maleOrFemale;
	}

	public void setMaleOrFemale(MaleOrFemale maleOrFemale) {
		this.maleOrFemale = maleOrFemale;
	}
	
	public String speak() {
		return "Bark";
	}
	
	

}
