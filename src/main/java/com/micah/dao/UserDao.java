package com.micah.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.micah.model.*;

public class UserDao {

	private Connection con;
	private String query;
	private PreparedStatement pst;
	private ResultSet rs;

	public UserDao(Connection con) {
		super();
		this.con = con;
		
	}



	public UserModal login(String email, String pswd) {
		UserModal user = null;
		try {
			query = "SELECT * FROM users WHERE email=? AND password=?";
			pst = this.con.prepareStatement(query);
			pst.setString(1, email);
			pst.setString(2, pswd);
			rs = pst.executeQuery();
			
			if(rs.next())
			{
				user = new UserModal();
				user.setId(rs.getInt("id"));
				user.setEmail(rs.getString("email"));
				user.setName(rs.getString("name"));
				user.setPassword(rs.getString("password"));
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return  user;
	}

}
