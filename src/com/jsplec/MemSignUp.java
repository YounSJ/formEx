package com.jsplec;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MemSignUp
 */
@WebServlet("/mSignUp")
public class MemSignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public MemSignUp() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("-- doGet() --");
		
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");
		String[] hobby = request.getParameterValues("hobby");
		String residence = request.getParameter("residence");
		
		System.out.println("name: " + name);
		System.out.println("password: " + password);
		System.out.println("gender: " + gender);
		System.out.println("hobby: " + Arrays.toString(hobby));
		System.out.println("residence: " + residence);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("-- doPost() --");
		doGet(request, response);
	}

}
