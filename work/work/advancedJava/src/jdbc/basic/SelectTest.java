package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest {
	public static void main(String[] args) {
		//원격에 있는 실제 DB서버 ip
		String url = "jdbc:oracle:thin:@70.12.115.59:1521:xe";
		//접속계정
		String user = "scott";
		//접속할 계정의 패스워드
		String password = "tiger";
		String sql = "select id,title,content from tb_board";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(url, user, password);
			Statement stmt = con.createStatement();
			//select문을 실행
			ResultSet rs = stmt.executeQuery(sql);
			//System.out.println("rs:"+rs);
			//ResultSet에 레코드가 존재하는 동안 반복문을 실행
			while(rs.next()) {// => 레코드를 조회하기 위해서는
							  // 	레코드가 한 개라도 반드시 커서를 이동시켜야한다.
				System.out.print(rs.getString(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.println(rs.getString("content")+"\t");
				//System.out.print(rs.getDate(5)+"\t");
				//System.out.println(rs.getInt(6));
			}
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		

	}
}
