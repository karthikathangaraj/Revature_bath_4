package com.pack.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class inserttables {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection c1 =DriverManager.getConnection("jdbc:mysql://localhost:3306/revaturebatch4","root","root");
        Statement s1= c1.createStatement();
        String ins="insert into t1 values(102);";
        s1.executeUpdate(ins);

	}

}
