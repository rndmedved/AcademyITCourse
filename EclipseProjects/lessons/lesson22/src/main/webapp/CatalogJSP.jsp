<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import = "java.io.PrintWriter" %>


<!-- Я не справился с подключением к jsp внешнего ORM файла, где прописано подключение
к базе данных и методы, описывающие sql запросы...
Отпрвавляю, как получилось сделать ((  
Понял только то, что jsp вообще как-то по другому подключает внешние классы. Видимо надо
прописывать путь. Но и это у меня не получилось. Я пробовал разные варианты пути. Или надо классы
поместить куда-либо в нужную папку. Или еще где-то что-то прописать...-->

<%
	String url = "jdbc:mysql://localhost/lesson16";
	Connection connection = DriverManager.getConnection(url, "root", "");
	Statement statement = connection.createStatement();
	PrintWriter writer = response.getWriter();
	ResultSet rs = statement.executeQuery("SELECT * FROM goods");		
%>
<html>
<head>
    <title>Cars list</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
    <h1>Users List</h1>
    <div class="table-container">
        <table class="users-table">
            <tr>
                <th>ID</th>
                <th>Title_Car</th>
                <th>Price</th>
                <th>Информация об Автомобиле</th>
                
            </tr>
            <% while (rs.next()) { %>
                <tr>
                    <td><%= rs.getInt("good_id") %></td>
                    <td><%= rs.getString("title") %></td>
                    <td><%= rs.getInt("price") %></td>
                    <td><%= rs.getString("info") %></td>
                   
                </tr>
            <% } %>
        </table>
    </div>
    <% rs.close(); %>
    </body>
</html>