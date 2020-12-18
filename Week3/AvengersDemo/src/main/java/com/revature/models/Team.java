package com.revature.models;

import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Team {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	
	@ManyToMany(mappedBy="team")
	private List<Avenger> members;

	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Team(int id, String name, List<Avenger> members) {
		super();
		this.id = id;
		this.name = name;
		this.members = members;
	}

	public Team(String name, List<Avenger> members) {
		super();
		this.name = name;
		this.members = members;
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

	public List<Avenger> getMembers() {
		return members;
	}

	public void setMembers(List<Avenger> members) {
		this.members = members;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, members, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Team other = (Team) obj;
		return id == other.id && Objects.equals(members, other.members) && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + ", members=" + members.size() + "]";
	}
	
	

}
