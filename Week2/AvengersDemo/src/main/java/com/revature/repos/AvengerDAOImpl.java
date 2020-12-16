package com.revature.repos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.models.Avenger;
import com.revature.utils.ConnectionUtil;

public class AvengerDAOImpl implements AvengerDAO {

	private HomeDAO hDao = new HomeDAOImpl();
	
	@Override
	public List<Avenger> findAll() {
		try(Connection conn = ConnectionUtil.getConnection()){
			
			String sql = "SELECT * FROM avengers;";
			
			Statement statement = conn.createStatement();
			
			List<Avenger> list = new ArrayList<>();
			
			ResultSet result = statement.executeQuery(sql);
			
			while(result.next()) {
				Avenger a = new Avenger(
						result.getInt("ave_id"), 
						result.getString("ave_name"),
						result.getString("ave_power"),
						result.getString("first_name"),
						result.getString("last_name"),
						result.getInt("power_level"),
						null
						);
				if(result.getString("home_fk")!=null) {
					a.setHome(hDao.findByName(result.getString("home_fk")));
				}
				list.add(a);
			}
			
			return list;
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Avenger findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addAvenger(Avenger a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateAvenger(Avenger a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean killAvenger(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
