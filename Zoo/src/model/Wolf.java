package model;

public class Wolf {

	private String name;
	private String color;
	private String age;
	
	public Wolf() {
		
	}
	
	public Wolf(String name, String color, String age) {
		this.name = name;
		this.color = color;
		this.age = age;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the age
	 */
	public String getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(String age) {
		this.age = age;
	}
	
	public String speak() {
		return "Hooooooooooowl";
	}
}
