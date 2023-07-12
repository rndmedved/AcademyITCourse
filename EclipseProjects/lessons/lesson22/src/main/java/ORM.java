
import java.sql.*;
import java.util.HashMap;

public class ORM {
    private static ORM object;
    private static Connection connection;
    private static Statement statement;

    private ORM() throws SQLException{
    	
    	try {
			Class.forName(Config.DRIVER);
		} catch (ClassNotFoundException e) {			
			e.printStackTrace();
		}    	
    	
        if (connection == null) {
            String url = "jdbc:mysql://" + Config.SERVER + "/" + Config.DB;
            connection = DriverManager.getConnection(url, Config.LOGIN, Config.PASSWORD);
            statement = connection.createStatement();
            System.out.println("Connection is ready");
        }else {
        	System.out.println("Connection lost");
        }
    }
    public static ORM getInstance() throws SQLException {
        if (object == null) {
            object = new ORM();
        }
        return object;
    }
    
    public ResultSet select(String table, String fields[], String where) throws SQLException {
        String selectFields = "";
        if (fields == null) {
            selectFields += "*";
        } else {
            for (int i = 0; i < fields.length; i++) {
                selectFields += fields[i] + (i < fields.length - 1 ? "," : "");
            }
        }
        return statement.executeQuery("SELECT " + selectFields + " FROM " + table + " " + where);
    }
    
    public int insert(String table, HashMap<String, String> values) throws SQLException {
        String sql = "INSERT INTO " + table, columns = "", sqlValues = "";
        if (!values.isEmpty()) {
            var i = 0;
            for (var item : values.entrySet()) {
                columns += "'" + item.getKey() + "'" + (i < values.size() - 1 ? "," : "");
                sqlValues += "'" + item.getValue() + "'" + (i < values.size() - 1 ? "," : "");
                i++;
            }
            sql += "(" + columns + ") VALUES(" + sqlValues + ")";

        }
        return statement.executeUpdate(sql);
    }
}
   