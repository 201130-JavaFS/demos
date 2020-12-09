package com.revature.models;

public class Dinosaur {
	
	private int id;
	private String species;
	private boolean hasFeathers;
	private int legs;
	private String diet;
	private double weight;
	
	public Dinosaur() {
		super();
	}

	public Dinosaur(int id, String species, boolean hasFeathers, int legs, String diet, double weight) {
		super();
		this.id = id;
		this.species = species;
		this.hasFeathers = hasFeathers;
		this.legs = legs;
		this.diet = diet;
		this.weight = weight;
	}

	public Dinosaur(String species, boolean hasFeathers, int legs, String diet, double weight) {
		super();
		this.species = species;
		this.hasFeathers = hasFeathers;
		this.legs = legs;
		this.diet = diet;
		this.weight = weight;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public boolean isHasFeathers() {
		return hasFeathers;
	}

	public void setHasFeathers(boolean hasFeathers) {
		this.hasFeathers = hasFeathers;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public String getDiet() {
		return diet;
	}

	public void setDiet(String diet) {
		this.diet = diet;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((diet == null) ? 0 : diet.hashCode());
		result = prime * result + (hasFeathers ? 1231 : 1237);
		result = prime * result + id;
		result = prime * result + legs;
		result = prime * result + ((species == null) ? 0 : species.hashCode());
		long temp;
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dinosaur other = (Dinosaur) obj;
		if (diet == null) {
			if (other.diet != null)
				return false;
		} else if (!diet.equals(other.diet))
			return false;
		if (hasFeathers != other.hasFeathers)
			return false;
		if (id != other.id)
			return false;
		if (legs != other.legs)
			return false;
		if (species == null) {
			if (other.species != null)
				return false;
		} else if (!species.equals(other.species))
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Dinosaur [id=" + id + ", species=" + species + ", hasFeathers=" + hasFeathers + ", legs=" + legs
				+ ", diet=" + diet + ", weight=" + weight + "]";
	}

	
	
}
