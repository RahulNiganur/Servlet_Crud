package controller;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PatientDao;
import dto.PatientDto;


@WebServlet("/fetch")
public class FetchBy_Id extends HttpServlet{
  
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id=req.getParameter("id");
		int cid=Integer.parseInt(id);
	    
		PatientDao dao=new PatientDao();
		Object obj=dao.findById(cid);
		resp.getWriter().print(obj);
	}
	
}
