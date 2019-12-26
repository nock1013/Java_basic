package jdbc.board.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//tb_board테이블을 엑세스하는 기능이 정의된 클래스
public class BoardDAO {
	public void delete(int boardnum) {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		StringBuffer sql = new StringBuffer();
		sql.append("delete tb_board ");
		sql.append("where boardnum = ?");
		try {
			System.out.println("드라이버 로딩 성공");
			 con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql.toString());
			stmt.setInt(1, boardnum);
			int result = stmt.executeUpdate();
			System.out.println(result+"개 행이 삭제됐습니다.");
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(stmt!=null)stmt.close();
				if(con!=null)con.close();
				if(rs!=null)rs.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
	
		}
	}
	public void Update(int boardnum, String id) {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String sql = "update tb_board set id = ? where boardnum = ?";
		try {
			con = DBUtil.getConnect();//DBMS연결
			System.out.println("연결성공"+con);
			stmt = con.prepareStatement(sql);
			stmt.setString(1, id);
			stmt.setInt(2, boardnum);
			int result = stmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();//오류추적
		}finally {
			try {
				if(stmt!=null)stmt.close();
				if(con!=null)con.close();
				if(rs!=null)rs.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}

	}
	public void insert(String id, String title, String content) {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
	
		String sql = "insert into tb_board values(board_seq.nextval,?,?,?,sysdate,0)";
				try {
			System.out.println("드라이버 로딩 성공!!");
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, id);
			stmt.setString(2, title);
			stmt.setString(3, content);
			
			int result = stmt.executeUpdate();
			System.out.println("SQL을 실행하기 위한 객체정보:"+stmt);
			
			System.out.println(result+"개 행 삽입성공");
				}catch(SQLException e) {
			e.printStackTrace();
				}finally {
					try {
						if(stmt!=null)stmt.close();
						if(con!=null)con.close();
						if(rs!=null)rs.close();
					}catch(SQLException e) {
						e.printStackTrace();
					}
				}
			
	}
	
	

}
