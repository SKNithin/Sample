package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PatientDao;
import dto.Patient;

@WebServlet("/sk")
public class Controller extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int pid = Integer.parseInt(req.getParameter("pid"));
		String pname = req.getParameter("pname");
		String pblood = req.getParameter("pblood");
		long pph_no = Long.parseLong(req.getParameter("pph_no"));
		
		Patient patient = new Patient();
		patient.setPid(pid);
		patient.setPname(pname);
		patient.setPph_no(pph_no);
		patient.setPblood(pblood);
		
		PatientDao dao = new PatientDao();
		dao.insert(patient);
	}
}
