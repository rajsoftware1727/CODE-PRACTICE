package DataBaseDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBScripts {
	
	public static void main(String args[]) throws SQLException
	{
		//connect to data base
		String url="jdbc:mysql://localhost:3306/test";
		Connection conn=DriverManager.getConnection(url,"root","WWWwww@123");
		System.out.println("db connected successfully");
		Statement st=conn.createStatement();
		 
		//String a="insert into AkilaRajesh values('raj',100);";
		//st.execute(a);
		//System.out.println("one value inserted successfully");
		//String a1="insert into AkilaRajesh values('raj',100);";
		//st.execute(a1);
		//System.out.println("second value inserted successfully");
		String a1="insert into AkilaRajesh values('koki',101);";
		st.execute(a1);
		String s="select * from AkilaRajesh;";
		ResultSet rs=st.executeQuery(s);
		while(rs.next())
		{
			String name=rs.getString("name");
			int  id=rs.getInt("id");
			System.out.println(name+"  "+id);
		}

		conn.close();
		
		
	}

}
