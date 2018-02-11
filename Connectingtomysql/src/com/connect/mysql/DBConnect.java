package com.connect.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class DBConnect {

	public DBConnect() {

		Connection con;
		java.sql.PreparedStatement st;	 

		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/persons","root","");
			String sql="select * from employee";
			st=con.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs=st.executeQuery();
		
			while(rs.next()){
				int employeeId=rs.getInt(1);
				String employeeName=rs.getString(2);
				int age=rs.getInt(3);
				System.out.println("Employee ID: "+employeeId+" name is: "+employeeName+"and age "+age); 


			}


		} catch (Exception e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


	public static void main(String [] args)
	{

		DBConnect obj=new DBConnect();


	}

}
