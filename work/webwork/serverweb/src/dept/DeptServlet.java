package dept;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "deptinsert", urlPatterns = { "/deptinsert.do" })
public class DeptServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
							throws ServletException, IOException {
		System.out.println("서블릿 연결");
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter pw = response.getWriter();
			
		String deptNo = request.getParameter("deptNo");
		String deptName = request.getParameter("deptName");
		String loc = request.getParameter("loc");
		String tel = request.getParameter("tel");
		String mgr = request.getParameter("mgr");
		
		DeptDTO dto = new DeptDTO(deptNo, deptName, loc, tel, mgr);
		DeptDAO dao = new DeptDAO();
		int result = dao.insert(dto);
		
		//3. 데이터 공유
		request.setAttribute("insertresult", result);
		//3. 응답화면으로 요청재지정
		RequestDispatcher rd = request.getRequestDispatcher("/dept/insertResult.jsp");
		rd.forward(request, response);
	}
	
}
