package hello.servlet.basic;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "hiServlet", urlPatterns = "/hi")
public class HiServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		System.out.println("HelloServlet.service");

		System.out.println("req = " + req);
		System.out.println("res = " + res);


		String username = req.getParameter("username");
		System.out.println("username = " + username);

		res.setContentType("text/plain");
		res.setCharacterEncoding("utf-8");
		res.getWriter().write("hello " + username);

	}

	/**
	 * HttpServletRequest 역할
	 * HTTP요청 메시지를 개발자가 직접 파싱하면 불편하니까, 
	 * 서블릿이 HTTP 요청 메시지를 편리하게 사용할 수 있도록 개발자 대신에 HTTP 요청 메시지를 파싱한다.
	 * 그 결과를 HttpServletRequest 객체에 담아서 제공한다.
	 */
	
	/**
	 * HttpServletRequest, HttpServletResponse를 사용할 때 가장 중요한점은 요청, 응답 메시지를 편리하게 사용하도록 도와주는 객체이다.
	 * 이 기능에 대해서 이해하려면 HTTP 스펙을 이해해야 한다.
	 */
	



}
















