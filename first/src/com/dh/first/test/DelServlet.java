package com.dh.first.test;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dh.first.db.TestDAO;

@WebServlet("/del")
public class DelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pk = request.getParameter("pk");
		int intPk = Integer.parseInt(pk);

		//DB에서 삭제
		TestDAO.delete(intPk);
		
		response.sendRedirect("/list");
	}

}
