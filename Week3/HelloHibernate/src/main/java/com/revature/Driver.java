package com.revature;

import java.util.List;

import com.revature.models.Author;
import com.revature.models.Book;
import com.revature.repos.BookDAO;

public class Driver {
	
	private static BookDAO bDao = new BookDAO();
	
	public static void main(String[] args) {
		Book b1 = new Book("Oliver Twist", "Fiction", "Hard back", new Author("Charles","Dickens",1812));
		Book b2 = new Book("Illiad", "Fiction", "soft cover", new Author("Homer",null,-350));
		
		bDao.insert(b1);
		bDao.insert(b2);
		
		List<Book> list= bDao.findAll();
		
		
		for(Book b:list) {
			System.out.println(b);
		}
	}

}
