package member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dept.DeptDTO;
import fw.DBUtil;

public class MemberDAO {
	public MemberDTO read(String id) {
		System.out.println("dao의 read호출");
		MemberDTO mem = null;
		String sql = "select * from member where id=?";
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, id);
			rs = ptmt.executeQuery();//select실행
			//실행결과를 자바객체로 변환
			// - 레코드가 여러 개 : DTO로 레코드르르 변환하고 ArrayList에 add
			// - 레코드가 한 개 : DTO로 레코드 변환
			if(rs.next()) {
				mem = new MemberDTO(rs.getString(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getString(5),
						rs.getString(6),
						rs.getInt(7));
			}
		}catch(SQLException e){
			e.printStackTrace();
			
		}finally {
			DBUtil.close(rs, ptmt, con);
		}
		return mem;
	}
	public int insert(MemberDTO dto) {
		Connection con = null;
		PreparedStatement ptmt = null;
		int result = 0;
		String sql = "insert into member values(?, ?, ?, ?, ?, ?, ?)";
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, dto.getId());  
			ptmt.setString(2, dto.getPass()); 
			ptmt.setString(3, dto.getName()); 
			ptmt.setString(4, dto.getAddr()); 
			ptmt.setString(5, dto.getDeptNo()); 
			ptmt.setString(6, dto.getGrade()); 
			ptmt.setInt(7, dto.getPoint()); 
		
			result = ptmt.executeUpdate();
			System.out.println("result=>"+result);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(null, ptmt, con);
		}
		return result;
	
	}
	public int delete(String id) {
		Connection con = null;
		PreparedStatement ptmt = null;
		int result = 0;
		String sql = "delete from member where id=?";
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, id);
			result = ptmt.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
			
		}finally {
			DBUtil.close(null, ptmt, con);
		}
		return result;
	}
	public ArrayList<MemberDTO> getMemberList(){
		System.out.println("getDeptList호출=> 서블릿이 넘겨준 파라미터출력");
		ArrayList<MemberDTO> list = new ArrayList<>();
		Connection con = null;
		PreparedStatement ptmt = null;
		String sql = "select * from member";
		ResultSet rs = null;
		MemberDTO mem = null;
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			rs = ptmt.executeQuery();
			while(rs.next()) {
				System.out.println("while");
				mem = new MemberDTO(rs.getString(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getString(5),
						rs.getString(6),
						rs.getInt(7));
				list.add(mem);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(rs, ptmt, con);
			
		}
		
		return list;
	}

}
