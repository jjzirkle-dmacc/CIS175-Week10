package model;

public class Wolverine {

	private String name;
	private String colors;
	private String team;

	public Wolverine() {
		super();
	}

	public Wolverine(String n, String c, String t) {
		super();
		this.name = n;
		this.colors = c;
		this.team = t;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColors() {
		return colors;
	}

	public void setColors(String colors) {
		this.colors = colors;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String speak() {
		return "Roar I like to win!";
	}
}