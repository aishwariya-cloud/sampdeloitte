package com.library.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.library.model.Books;

public class BooksDAO {
	public static Connection connectToDB() {
		Connection connection =null;
		//register the driver
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
				//creating connection
			 connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
				return connection;
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
		
	}
		
		public static void add(Books obj) {
			System.out.println(obj);
			//create statement
		try {
			java.sql.PreparedStatement stmt=connectToDB().prepareStatement("insert into books values(?,?,?,?)");
			stmt.setInt(1, obj.getBookId());
			stmt.setString(2, obj.getBookName());
			stmt.setString(3, obj.getBookAuthor());
			stmt.setDouble(4, obj.getBookPrice());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		}
		
		
			
		}
			
		


