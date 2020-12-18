package com.revature.repos;

import java.util.List;

import org.hibernate.Session;

import com.revature.models.Home;
import com.revature.utils.HibernateUtils;

public class HomeDAOImpl2 implements HomeDAO {

	@Override
	public List<Home> findAll() {
		Session ses = HibernateUtils.getSession();
		List<Home> list = ses.createQuery("FROM Home").list();
		return list;
	}

	@Override
	public Home findByName(String name) {
		Session ses = HibernateUtils.getSession();
		List<Home> list = ses.createQuery("FROM Home WHERE homeName = " + name).list();
		Home h = list.get(0);
		return h;
	}

	@Override
	public boolean addHome(Home h) {
		Session ses = HibernateUtils.getSession();
		try {
			ses.save(h);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean destroyHome(String name) {
		Session ses = HibernateUtils.getSession();
		Home h = findByName(name);
		try {
		ses.delete(h);
		return true;
		}catch(Exception e) {
		return false;
		}
	}

}
