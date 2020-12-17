package com.revature.repos;

import java.util.List;

import org.hibernate.Session;

import com.revature.models.Book;
import com.revature.utils.HibernateUtility;

public class BookDAO {
	
	public void insert(Book book) {
		Session ses = HibernateUtility.getSession();
		
		ses.save(book);
		HibernateUtility.closeSession();
	}

	public void update(Book book) {
		Session ses = HibernateUtility.getSession();
		
		ses.merge(book);
	}

	public Book selectById(int id) {
		Session ses = HibernateUtility.getSession();
		
		Book book = ses.get(Book.class, id);
		
		return book;
	}
	
	public List<Book> findAll(){
		Session ses = HibernateUtility.getSession();
		
		List<Book> list = ses.createQuery("FROM Book").list();
		
		return list;
	}
}
