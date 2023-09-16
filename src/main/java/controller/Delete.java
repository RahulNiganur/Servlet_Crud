package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import dao.PatientDao;
import dto.PatientDto;

@WebServlet("/delete")
public class Delete extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	String id=req.getParameter("pk");
	System.out.println(id);
	int bd=Integer.parseInt(id);
	
	PatientDao dao=new PatientDao();
	String msg=dao.deleteById(bd);
	//res.getWriter().print(msg);
	
	List<PatientDto> td=dao.fetchAll();
	req.setAttribute("objects",td);
	RequestDispatcher rd=req.getRequestDispatcher("download.jsp");
	rd.forward(req, res);
	}
	

}
