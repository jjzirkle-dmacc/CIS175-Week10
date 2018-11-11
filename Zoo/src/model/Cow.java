packbreed model;

public class Cow {
	private int weight;
	private String color;
	private String breed;

	public Cow() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cow(int weight, String color, String breed) {
		super();
		this.weight = weight;
		this.color = color;
		this.breed = breed;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String speak() {
		return "Moo";
	}

}