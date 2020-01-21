package member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "memInsert", urlPatterns = { "/member/insert.do" })
public class MemberInsertServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			System.out.println("¸â¹ö¼­ºí¸´È®ÀÎ");
			request.setCharacterEncoding("euc-kr");
			response.setContentType("text/html;charset=euc-kr");
			
			String id = request.getParameter("id");
			String pass = request.getParameter("pass");
			String name = request.getParameter("name");
			String addr = request.getParameter("addr");
			String deptNo = request.getParameter("deptNo");
			String grade = request.getParameter("grade");
			int point = Integer.parseInt(request.getParameter("point"));
			MemberDAO dao = new MemberDAO();
			MemberDTO dto = new MemberDTO(id, pass, name, addr, deptNo, grade, point);
			
			int result = dao.insert(dto);
			request.setAttribute("insert", result);
			
			RequestDispatcher rd = request.getRequestDispatcher("/member/insert.jsp");
			rd.forward(request, response);
			
	}

}
