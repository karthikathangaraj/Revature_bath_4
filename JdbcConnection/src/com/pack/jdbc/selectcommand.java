package com.pack.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class selectcommand {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection c1=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/fruitshop","root","root");
		Statement s=(Statement) c1.createStatement(); 
		//String q1="insert into t1 values(200);";
		//String q2="insert into t1 values(2001);";
		//int f=s.executeUpdate(q1);
		//f=s.executeUpdate(q1);
		
//		if(f>0)
//		{
//			System.out.println("Data inserted successfully!");
//		}
		String q3="select * from employee;";
		ResultSet r1=s.executeQuery(q3); 
		ResultSetMetaData  rs=r1.getMetaData();
		int cc=rs.getColumnCount();
		for(int i=1;i<=cc;i++)
			System.out.print("  " +rs.getColumnName(i)+ "    ");
		System.out.println();
		while(r1.next())
		{
			for(int i=1;i<=cc;i++)
			{
			          System.out.print(" " + r1.getString(i)+"\t");
			          
			}
			System.out.println();
		}

}
}