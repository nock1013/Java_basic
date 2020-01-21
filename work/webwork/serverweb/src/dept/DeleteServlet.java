package dept;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "delete", urlPatterns = { "/dept/delete.do" })
public class DeleteServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
						throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter pw = response.getWriter();
		//1. 요청정보 추춢
		String deptno = request.getParameter("deptno");
		
		//2. 비지니스메소드 호출
		DeptDAO dao = new DeptDAO();
		int result = dao.delete(deptno);
	
		
		response.sendRedirect("/serverweb/dept/list.do");
		
	}

}
