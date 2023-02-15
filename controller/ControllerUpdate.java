package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PatientDao;

@WebServlet("/update")
public class ControllerUpdate extends HttpServlet{
	
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		int pid=Integer.parseInt(req.getParameter("pid"));
		String ph_no=req.getParameter("pph_no");
		long pph_no=Long.parseLong(ph_no);
		
		PatientDao patientDao=new PatientDao();
		patientDao.update(pid,pph_no);
	}

}