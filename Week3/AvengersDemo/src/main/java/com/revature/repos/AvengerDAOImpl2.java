package com.revature.repos;

import java.util.List;

import org.hibernate.Session;

import com.revature.models.Avenger;
import com.revature.utils.HibernateUtils;

public class AvengerDAOImpl2 implements AvengerDAO {

	@Override
	public List<Avenger> findAll() {
		Session ses = HibernateUtils.getSession();

		List<Avenger> list = ses.createQuery("FROM Avenger").list();

		return list;
	}

	@Override
	public Avenger findById(int id) {
		Session ses = HibernateUtils.getSession();
		Avenger a = ses.get(Avenger.class, id);
		return a;
	}

	@Override
	public boolean addAvenger(Avenger a) {
		Session ses = HibernateUtils.getSession();
		try {
			ses.save(a);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean updateAvenger(Avenger a) {
		Session ses = HibernateUtils.getSession();
		try {
			ses.merge(a);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean killAvenger(int id) {
		Session ses = HibernateUtils.getSession();
		Avenger a = findById(id);
		try {
			ses.delete(a);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
