package com.revature.models;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "books")
public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="book_id")
	private int id;
	
	@Column(name="book_title", nullable = false)
	private String title;
	@Column(name="book_category")
	private String category;
	
	//allow hibernate to choose the name 
	private String binding;
	
	//FetchType defines when hibernate will go to the database to fetch an associated object. 
			/*Lazy - Hibernate will give a proxy object instead of going to the database until 
			 * your code actually calls for the object. this only works while the object is persistent. 
			 * Once it becomes detached there is no longer as Session to replace the proxy*/
			/*Eager - returns the dependent object immediately with no proxy. This is generally safer.*/
			//Cascade defines how the queries will maintain referential integrity. 
	@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="author_id")
	private Author author;
	
	public Book() {
		super();
	}

	public Book(int id, String title, String category, String binding, Author author) {
		super();
		this.id = id;
		this.title = title;
		this.category = category;
		this.binding = binding;
		this.author = author;
	}

	public Book(String title, String category, String binding, Author author) {
		super();
		this.title = title;
		this.category = category;
		this.binding = binding;
		this.author = author;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getBinding() {
		return binding;
	}

	public void setBinding(String binding) {
		this.binding = binding;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, binding, category, id, title);
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
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(binding, other.binding)
				&& Objects.equals(category, other.category) && id == other.id && Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", category=" + category + ", binding=" + binding + ", author="
				+ author.getFirstName()+" "+author.getLastName() + "]";
	}
	
	
	

}
