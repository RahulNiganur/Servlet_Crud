package controller;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import dao.PatientDao;
import dto.PatientDto;

@WebServlet("/insert")
public class PatientController implements Servlet{

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		String id=req.getParameter("id");
		int id1=Integer.parseInt(id);
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		String phno=req.getParameter("phno");
		long phno1=Integer.parseInt(phno);
		String gender=req.getParameter("gender");
		
		PatientDto dto=new PatientDto();
		dto.setId(id1);
		dto.setName(name);
		dto.setEmail(email);
		dto.setPassword(password);
		dto.setPhno(phno1);
		dto.setGender(gender);
		
		PatientDao dao=new PatientDao();
		String msg=dao.insert(dto);
		System.out.println(msg);
		res.getWriter().print(msg);
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	
}
