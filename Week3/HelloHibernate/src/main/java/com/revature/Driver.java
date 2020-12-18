package com.revature;

import java.util.List;

import com.revature.models.Author;
import com.revature.models.Book;
import com.revature.repos.AuthorDAO;
import com.revature.repos.BookDAO;

public class Driver {
	
	private static BookDAO bDao = new BookDAO();
	private static AuthorDAO aDao = new AuthorDAO();
	
	public static void main(String[] args) {
		Author a1 = new Author ("Charles","Dickens",1812, null);
		Author a2 = new Author("Homer",null,-350, null);
		
		Book b1 = new Book("Oliver Twist", "Fiction", "Hard back", a1);
		Book b2 = new Book("Illiad", "Fiction", "soft cover", a2);
		
		bDao.insert(b1);
		bDao.insert(b2);
		
		List<Book> list= bDao.findAll();
		
		Author a3 = new Author("J.R.R.", "Tolkien", 1892, null);
		
		aDao.insert(a3);
		
		for(Book b:list) {
			System.out.println(b);
		}

		List<Author> list2 = aDao.findAll();
		for(Author a: list2) {
			System.out.println(a);
		}
		
		System.out.println(aDao.selectById(2));
		
	}

}
