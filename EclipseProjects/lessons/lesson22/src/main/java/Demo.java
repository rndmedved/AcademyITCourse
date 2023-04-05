

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet({ "/Demo", "/Test" })
public class Demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	/*
	 * Если запускаем в браузере адрес сервлета, то всегда по умолчанию запустится метод doGet
	 * request - это объект, с помощью которого мы принимаем данные от клиента
	 * response - это объект, с помощью которого мы отправляем данные клиенту
	 * 
	 * */

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		String fio = request.getParameter("fio");
		String age = request.getParameter("age");
		PrintWriter writer = response.getWriter();
		if(fio != null && age != null) {
			writer.append("<h1>Привет, ").append(fio).append("!</h1>")
				.append("<br>Вы родились в ")
				.append(Integer.toString(LocalDate.now().getYear() - Integer.parseInt(age)));
		}else {
			writer.append("Добрый день!");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		String fio = request.getParameter("fio");
		String age = request.getParameter("age");
		PrintWriter writer = response.getWriter();
		if(fio != null && age != null) {
			writer.append("Привет, ").append(fio).append("!")
				.append("Вы родились в ")
				.append(Integer.toString(LocalDate.now().getYear() - Integer.parseInt(age)));
		}else {
			writer.append("Добрый день!");
		}
	}
}
