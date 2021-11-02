package es.curso.model.entity;

public class Game {

	private int id;
	private String name;
	private String company;
	private float scoreAverage;

	public Game() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public float getScoreAverage() {
		return scoreAverage;
	}

	public void setScoreAverage(float scoreAverage) {
		this.scoreAverage = scoreAverage;
	}

	@Override
	public String toString() {
		return "Game [id=" + id + ", name=" + name + ", company=" + company + ", scoreAverage=" + scoreAverage + "]";
	}

}
