package com.wu.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.wu.bean.Admin;

@Repository
public class AdminDAOImpl implements AdminDAO{
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	public Admin validateAdmin(Admin admin) {
		String m=;
		String n= ;
		try{        
	           Connection con = DriverManager.getConnection("jdbc:mysql://localhost/darshanproject","root","MyNewPass");
	           Statement st = con.createStatement();
	           String q="select * from student";
	           ResultSet rs=st.executeQuery(q);
	           rs.next();
	           String user, pass;
	           user =rs.getString("username");
	           pass =rs.getString("password");
	           { if(m.compareTo(user)==0)
	                 if(n.compareTo(pass)==0)
	                     System.out.println("login Success");
	                 else
	                     System.out.println("Wrong Password");

	           }
	       }catch(Exception ex){
	           System.out.println(ex);
	       }
	}
	   
	} 


