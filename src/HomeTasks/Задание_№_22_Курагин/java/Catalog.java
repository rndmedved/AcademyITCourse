

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Catalog")
public class Catalog extends HttpServlet {
	private Connection connection;
	private Statement statement;
	
	private static final long serialVersionUID = 1L;
   	
	public void init() throws ServletException {
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
		
	}

	@Override
	public void destroy() {
		
		try {
			connection.close();
			statement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		PrintWriter writer = response.getWriter();	
		String title = request.getParameter("title");
		String price = request.getParameter("price");
		String info = request.getParameter("info");
		System.out.println("title = " + title + " price = " + price + " info = "+ info);
		if(title != null && price != null) {
			String sql = String.format("INSERT INTO `goods`(`title`, `price`, `info`) VALUES ('%s','%s','%s')",
					title, price, info);			
			try {
				statement.executeUpdate(sql);
				writer.print(String
						.format("Автомобиль %s, цена которого %s успешно добавлен.", title, price));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		String action = request.getParameter("action");
		if(action != null) {
			switch(action) {
			case "card":
				if(request.getParameter("id") == null) {
					writer.print("Товар не был выбран");
				}else {
					System.out.println("дошли до инициализации");
					int id = Integer.parseInt(request.getParameter("id"));
					if(id > 0) {
						String sql = "SELECT * FROM goods where good_id = " +id;
						System.out.println(sql);
						try {
							ResultSet data = statement.executeQuery(sql);
							writer.print(Model.getCard(data));
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
				break;
			case "delete":
				if(request.getParameter("id") == null) {
					writer.print("Товар не был выбран");
				}else {
					String id = request.getParameter("id");
					System.out.println("Удалили товар с id = " + id);
					String sql = "DELETE FROM `goods` WHERE good_id = " + id; 
					try {
						statement.executeUpdate(sql);
						sql  = "SELECT * FROM goods";
						ResultSet rs = statement.executeQuery(sql);
						writer.print(Model.getGoods(rs));
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
					
			}
		}else {
			String sql  = "SELECT * FROM goods";
			System.out.println(sql);
			try {
				ResultSet rs = statement.executeQuery(sql);
				writer.print(Model.getGoods(rs));
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
