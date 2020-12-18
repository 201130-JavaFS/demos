package com.revature.models;

import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Author {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="author_id")
	private int id;
	
	private String firstName;
	private String lastName;
	private int yearBorn;
	
	@OneToMany(mappedBy="author", fetch=FetchType.EAGER)
	private List<Book> bibliography;

	public Author() {
		super();
	}

	public Author(int id, String firstName, String lastName, int yearBorn, List<Book> bibliography) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.yearBorn = yearBorn;
		this.bibliography = bibliography;
	}

	public Author(String firstName, String lastName, int yearBorn, List<Book> bibliography) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.yearBorn = yearBorn;
		this.bibliography = bibliography;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getYearBorn() {
		return yearBorn;
	}

	public void setYearBorn(int yearBorn) {
		this.yearBorn = yearBorn;
	}

	public List<Book> getBibliography() {
		return bibliography;
	}

	public void setBibliography(List<Book> bibliography) {
		this.bibliography = bibliography;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bibliography, firstName, id, lastName, yearBorn);
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
		Author other = (Author) obj;
		return Objects.equals(bibliography, other.bibliography) && Objects.equals(firstName, other.firstName)
				&& id == other.id && Objects.equals(lastName, other.lastName) && yearBorn == other.yearBorn;
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", yearBorn=" + yearBorn
				+ ", bibliography=" + bibliography + "]";
	}
	
	
	
}
