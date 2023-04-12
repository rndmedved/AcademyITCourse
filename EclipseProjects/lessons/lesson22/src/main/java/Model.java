import java.sql.ResultSet;
import java.sql.SQLException;

public class Model {

	public static String getGoods(ResultSet rs) throws SQLException{
		StringBuilder builder = new StringBuilder("<table border=\"1\" style=\"margin: 0 auto; text-align: center; width: 800px;\">\n"
				+ "	<tr>\n"
				+ "		<th>Номер товара</th>\n"
				+ "		<th>Название товара</th>\n"
				+ "		<th>Цена товара</th>\n"
				+ "		<th>Фото товара</th>\n"
				+ "		<th>Удалить товар</th>\n"
				+ "	</tr>");
		int i = 1;
		while(rs.next()) {
			builder.append("<tr><td>")
			.append(i)
			.append("</td><td><a href='")
			.append("?action=card&id=")
			.append(rs.getInt("good_id"))
			.append("'>")
			.append(rs.getString("title"))
			.append("</a></td><td>")
			.append(rs.getInt("price"))
			.append("</td><td><img width='100' src= 'images/")
			.append(rs.getString("title"))
			.append(".jpeg'></td>")
			.append("<td><a href='?action=delete&id=")
			.append(rs.getInt("good_id"))
			.append("'>удалить товар</a></td></tr>");
			i++;
		}
		builder.append("</table>");
		builder.append("<div style=\"\n"
				+ "width: 200;\n"
				+ "height: auto;\n"
				+ "margin: 0 auto\">"
				+ "<div style=\"display: inline-block;\n"
				+ "padding: 10px 20px;\n"
				+ "background-color: #979797;\n"
				+ "color: #fff;\n"
				+ "text-decoration: none;\n"
				+ "border-radius: 5px;\n"
				+ "margin: 10px;\n"
				+ "cursor: pointer;\">\n"
				+ "<a href=\"good_add.html\">Добавить товар</a></div></div>");
		return builder.toString();
		
	}

	public static String getCard(ResultSet rs) throws SQLException{
		StringBuilder builder = null;
		if(rs.next()) {
			
				builder = new StringBuilder("<table border=\"1\" style=\"margin: 0 auto; text-align: center; width: 800px;\">\n"
				+ "	<tr>\n"
				+ "		<th>Название товара</th>\n"
				+ "		<th>Цена товара</th>\n"
				+ "		<th>Информация о товаре товара</th>\n"
				+ "		<th>Фото товара</th>\n"
				+ "	</tr>");
		
			builder.append("<tr><td>")
			.append(rs.getString("title"))
			.append("</td><td>")
			.append(rs.getInt("price"))
			.append("</td><td>")
			.append(rs.getString("info"))
			.append("</td><td><img width='100' src= 'images/")
			.append(rs.getString("title"))
			.append(".jpeg'></td></tr></table>\"");			
		
		}
		return builder.toString();
	}

}
