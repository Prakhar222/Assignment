package com.yash.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

import com.mysql.jdbc.PreparedStatement;

public class PrepareStDemo {
	static Logger Logger=java.util.logging.Logger.getAnonymousLogger();


	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		String sql="Insert into Contact(name,contact) values(?,?)";
	//	Statement st=(Statement) con.createStatement();
		//int j =st.executeUpdate(sql);

		PreparedStatement pstmt=(PreparedStatement) con.prepareStatement(sql);
		pstmt.setString(1, "Prakharg");
		pstmt.setString(2, "7999785119");
		pstmt.addBatch();
		
		pstmt.setString(1, "Krishna");
		pstmt.setString(2, "79997432");
		pstmt.addBatch();
		
		pstmt.setString(1, "Mohan");
		pstmt.setString(2, "8109571683");
		pstmt.addBatch();
		
		pstmt.setString(1, "Govind");
		pstmt.setString(2, "8109571643");
		pstmt.addBatch();
		
		pstmt.executeBatch();
		Logger.info("Data Inserted");
	}


}
