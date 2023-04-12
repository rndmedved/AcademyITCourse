

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

/**
 * Servlet implementation class LoadFile
 */
@WebServlet("/LoadFile")
public class LoadFile extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String UPLOAD_DIRECTORY = "/home/medved/test/";
	private static final int MAX_FILE_SIZE = 1024*1024*20;	
	private static final int MAX_REQUEST_SIZE = 1024*1024*25;	
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(!ServletFileUpload.isMultipartContent(request)) {
			response.getWriter().print("File not loaded");
			return;
		}
		
		DiskFileItemFactory factory = new DiskFileItemFactory();
		factory.setRepository(new File(System.getProperty("java.io.tmpdir")));
		ServletFileUpload uploadFile = new ServletFileUpload(factory);
		uploadFile.setFileSizeMax(MAX_FILE_SIZE);
		uploadFile.setSizeMax(MAX_REQUEST_SIZE);
		
		File uploadDir = new File(UPLOAD_DIRECTORY);
		if(!uploadDir.exists()) {
			uploadDir.mkdir();
		}
		try {
			List<FileItem> formItems = uploadFile.parseRequest(request);
			if(formItems != null && formItems.size() > 0) {
				for(FileItem fileItem : formItems) {
					String fileName = new File(fileItem.getName().getName());
				}
			}
		} catch (Exception e) {
			
		}
	}

}
