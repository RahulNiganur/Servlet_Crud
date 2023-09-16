package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PatientDao;

@WebServlet("/update")
public class Update_cell extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	String id=req.getParameter("pk");
    	String num=req.getParameter("number");
    	
    	int cid=Integer.parseInt(id);
    	long number=Integer.parseInt(num);
    	
    	PatientDao dao=new PatientDao();
    	String upt=dao.update(cid,number);
    	resp.getWriter().print(upt);
    }
}
