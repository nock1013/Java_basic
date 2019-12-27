package jdbc.board.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//tb_board테이블을 엑세스하는 기능이 정의된 클래스
public class BoardDAOImpl implements BoardDAO {
	public int insert(BoardDTO board) {
		System.out.println("dto사용메소드"+board);
		Connection con = null;
		PreparedStatement stmt = null;
		String sql = "insert into tb_board values(board_seq.nextval,?,?,?,sysdate,0)";
		int result = 0; //메소드 실행결과가 저장될 변수
				try {
			System.out.println("드라이버 로딩 성공!!");
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, board.getId());
			stmt.setString(2, board.getTitle());
			stmt.setString(3, board.getContent());
			
			result = stmt.executeUpdate();
			System.out.println(result+"개 행 삽입성공");
				}catch(SQLException e) {
			e.printStackTrace();
				}finally {
						DBUtil.close(null, stmt, con);
				}
				return result;
			
	}
	public void Select() {
		String sql = "select * from tb_board";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			while(rs.next()) {
				System.out.print(rs.getInt(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.print(rs.getString("content")+"\t");
				System.out.print(rs.getDate(5)+"\t");
				System.out.println(rs.getInt(6)+"\t");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(rs, stmt, con);
		}
		
	}
	public int delete(int boardnum) {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		StringBuffer sql = new StringBuffer();
		sql.append("delete tb_board ");
		sql.append("where boardnum = ?");
		int result = 0;
		try {
			System.out.println("드라이버 로딩 성공");
			 con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql.toString());
			stmt.setInt(1, boardnum);
			result = stmt.executeUpdate();
			System.out.println(result+"개 행이 삭제됐습니다.");
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null, stmt, con);
		}
		return result;
	}
	public int update(int boardnum, String id) {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String sql = "update tb_board set id = ? where boardnum = ?";
		int result = 0;
		try {
			con = DBUtil.getConnect();//DBMS연결
			System.out.println("연결성공"+con);
			stmt = con.prepareStatement(sql);
			stmt.setString(1, id);
			stmt.setInt(2, boardnum);
			result = stmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();//오류추적
		}finally {
			DBUtil.close(null, stmt, con);
		}
		return result;

	}
	public int insert(String id, String title, String content) {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		String sql = "insert into tb_board values(board_seq.nextval,?,?,?,sysdate,0)";
		int result = 0; //메소드 실행결과가 저장될 변수
				try {
			System.out.println("드라이버 로딩 성공!!");
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, id);
			stmt.setString(2, title);
			stmt.setString(3, content);
			
			result = stmt.executeUpdate();
			System.out.println("SQL을 실행하기 위한 객체정보:"+stmt);
			
			System.out.println(result+"개 행 삽입성공");
				}catch(SQLException e) {
			e.printStackTrace();
				}finally {
						DBUtil.close(null, stmt, con);
				}
				return result;
			
	}
	
	

}
