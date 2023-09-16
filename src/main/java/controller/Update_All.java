package controller;

import java.io.IOException;
import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PatientDao;
import dto.PatientDto;

@WebServlet("/update_row")
public class Update_All extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("uid");
		String name = req.getParameter("uname");
		String mail = req.getParameter("um");
		String password = req.getParameter("up");
		String number = req.getParameter("unumber");
		String gender = req.getParameter("ugender");
           
		int cid=Integer.parseInt(id);
		long phone=Long.parseLong(number);
		PatientDao dto=new PatientDao();
		List<PatientDto> d=dto.update_All(cid,name,mail,password,phone,gender);
		req.setAttribute("objects",d);
		RequestDispatcher rd=req.getRequestDispatcher("download.jsp");
		rd.forward(req, resp);
	}
}
