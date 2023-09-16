package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PatientDao;
import dto.PatientDto;
import net.bytebuddy.description.annotation.AnnotationDescription.RenderingDispatcher;

@WebServlet("/fetchall")
public class Fetch_All_Data extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PatientDao dao = new PatientDao();
		List<PatientDto> obg = dao.fetchAll();
		// resp.getWriter().print(obg);
		req.setAttribute("objects", obg);
		RequestDispatcher rd = req.getRequestDispatcher("download.jsp");
		rd.forward(req, resp);
	}
}
