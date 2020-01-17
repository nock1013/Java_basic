package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calc.do")
public class CalcServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
					throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter pw = response.getWriter();
		System.out.println("서블릿 요청...");		
		
		int num1 = Integer.parseInt(request.getParameter("num1"));
		String method = request.getParameter("method");
		int num2 = Integer.parseInt(request.getParameter("num2"));
		
		//2. 비지니스메소드 호출
		CalcLogic logic = new CalcLogic();
		int result = logic.calc(num1, method, num2);
		
		//3.응답화면
		pw.print("입력한 값의 연산결과는=>  "+result+"입니다.");
	}
}
