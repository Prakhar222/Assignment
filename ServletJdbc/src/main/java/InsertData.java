import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Import Database Connection Class file
//import code.DatabaseConnection;
// Servlet Name
@WebServlet("/InsertData")
public class InsertData extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static Logger Logger=java.util.logging.Logger.getAnonymousLogger();
	protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException
	{	
	try {


	//	Connection con = DatabaseConnection.initializeDatabase();
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		//String sql="insert into demoN values(?, ?)";
		String sql="Insert into demoN values(?,?)";
		PreparedStatement st = con.prepareStatement(sql);

		st.setInt(1, Integer.valueOf(request.getParameter("empId")));


		st.setString(2, request.getParameter("empName"));

		st.executeUpdate();


		//st.close();
		//con.close();

		PrintWriter out = response.getWriter();
		out.println("<html><body><b>Successfully Inserted "+"</b></body></html>");
		//Logger.info("<html><body><b>Successfully Inserted "+"</b></body></html>");
		//Logger.info("Inserted");
		
	}
	catch (Exception e) {
		e.printStackTrace();
	}

	}

}

