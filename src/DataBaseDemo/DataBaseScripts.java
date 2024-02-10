package DataBaseDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class DataBaseScripts {
	
	public static void main(String args[]) throws SQLException
	{
	
		  /*1.create the connection
		   *2.create the statement
		   *3.Execute the statement
		   *4.close the connection
		   */
		
		String dbUrl = "jdbc:mysql://localhost:3306/new_schema";
		
		String uname="root";
		String pwd="WWWwww@123";
		Connection con=DriverManager.getConnection(dbUrl,uname,pwd);
		 
		System.out.println("connect to db successfully");
		Statement st=con.createStatement();
		/*String f="insert into Employee values(700,'thrishiv','raj','50000')";
		st.execute(f);*/
		//String d="update Employee set Emp_Name='koki' where Emp_Name='kokila'";
		//st.execute(d);
		/*String d1="select Emp_id,Emp_Name from Employee";
		//String d2="create table Rajesh1(int id)";
		st.execute(d1);
		ResultSet rs=st.executeQuery(d1);
		while(rs.next())
		{
			String data=rs.getString("Emp_id");
			System.out.print(data+"  ");
			String data1=rs.getString("Emp_Name");
			System.out.println("  "+data1);

			
		}
		String f1="update Employee set Emp_Name='alva' where Emp_Name='koki'";
		st.execute(f1);
		String n="drop Emp_id=700 from Employee";
		st.execute(n);
		String d3="select Emp_id,Emp_Name from Employee";
		//String d2="create table Rajesh1(int id)";
		st.execute(d3);
		ResultSet rs1=st.executeQuery(d3);
		while(rs1.next())
		{
			String data=rs1.getString("Emp_id");
			System.out.print(data+"  ");
			String data1=rs1.getString("Emp_Name");
			System.out.println("  "+data1);

			
		}*/
		 
		String n1="update employee set Emp_Name='raj' where Emp_Name='Rajesh'";
		st.execute(n1);
		String n2="select Emp_id,Emp_Name from Employee";
		
		
		ResultSet rset=st.executeQuery(n2);
		while(rset.next())
		{
			String id=rset.getString("Emp_id");
			System.out.print(id+"  ");
			String name=rset.getString("Emp_Name");
			System.out.println("  "+name);
			
		}
		con.close();
		System.out.println("data added");

		
	}

}
