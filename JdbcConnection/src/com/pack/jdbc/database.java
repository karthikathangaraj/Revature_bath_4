package com.pack.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class database {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection c1 =DriverManager.getConnection("jdbc:mysql://localhost:3306/revaturebatch4","root","root");
        Statement s1= c1.createStatement();
        //String q1="create database revaturebatch4";
        //s1.executeUpdate(q1);
        s1.execute("create table t1(id int);");
	}

}
