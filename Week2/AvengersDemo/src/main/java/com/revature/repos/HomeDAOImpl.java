package com.revature.repos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.revature.models.Home;
import com.revature.utils.ConnectionUtil;

public class HomeDAOImpl implements HomeDAO {

	@Override
	public List<Home> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Home findByName(String name) {
		try(Connection conn= ConnectionUtil.getConnection()){
			String sql = "SELECT * FROM homes WHERE home_name =?;";
			PreparedStatement statement = conn.prepareStatement(sql);
			
			statement.setString(1, name);
			
			ResultSet result = statement.executeQuery();
			
			if(result.next()) {
				Home h = new Home();
				h.setHomeName(name);
				h.setStAddr(result.getString("hb_st_addr"));
				h.setCity(result.getString("hb_city"));
				h.setState(result.getString("hb_state"));
				h.setZip(result.getString("hb_zip"));
				return h;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//if no result will return null
		return null;
	}

	@Override
	public boolean addHome(Home h) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean destroyHome(String name) {
		// TODO Auto-generated method stub
		return false;
	}

}
