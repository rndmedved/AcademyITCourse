

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TestCatalog")
public class TestCatalog extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Statement statement;
	private static Connection connection;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		PrintWriter writer = response.getWriter();
		try {
			Class.forName(Config.DRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url = "jdbc:mysql://"+Config.SERVER+"/" + Config.DB;
        try {
			connection = DriverManager.getConnection(url,Config.LOGIN,Config.PASSWORD);
			statement = connection.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String sql  = "SELECT * FROM goods";
		try {
				ResultSet rs = statement.executeQuery(sql);//ORM.getInstance().select("goods", null, "");
				writer.print(Model.getGoods(rs));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}


}
