package com.pack.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class userinput {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection c1=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/revaturebatch4","root","root");
		Statement s=(Statement) c1.createStatement(); 
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		String s2="insert into t1 values(?);";
		PreparedStatement ps=c1.prepareStatement(s2);
		ps.setInt(1, id);
		//ps.setString(2, name);
		ps.execute();
		
		

	}

}
