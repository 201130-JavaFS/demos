package com.revature.repos;

import java.util.List;

import org.hibernate.Session;

import com.revature.models.Author;
import com.revature.utils.HibernateUtility;

public class AuthorDAO {

	
	public void insert(Author author) {
		Session ses = HibernateUtility.getSession();
		
		ses.save(author);
		//HibernateUtility.closeSession();
	}

	public void update(Author author) {
		Session ses = HibernateUtility.getSession();
		
		ses.merge(author);
	}

	public Author selectById(int id) {
		Session ses = HibernateUtility.getSession();
		
		Author author = ses.get(Author.class, id);
		
		return author;
	}
	
	public List<Author> findAll(){
		Session ses = HibernateUtility.getSession();
		
		List<Author> list = ses.createQuery("FROM Author").list();
		
		return list;		
	}
}
