package dept;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import fw.DBUtil;

public class DeptDAO {

	public int delete(String deptno) {
		Connection con = null;
		PreparedStatement ptmt = null;
		int result = 0;
		String sql = "delete from mydept where deptno=?";
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, deptno);
			result = ptmt.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
			
		}finally {
			DBUtil.close(null, ptmt, con);
		}
		return result;
	}
	//전체 목록 출력	
	public ArrayList<DeptDTO> getDeptList(){
		ArrayList<DeptDTO> list = new ArrayList<>();
		Connection con = null;
		PreparedStatement ptmt = null;
		String sql = "select * from mydept";
		ResultSet rs = null;
		DeptDTO dept = null;
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			rs = ptmt.executeQuery();
			while(rs.next()) {
				dept = new DeptDTO(rs.getString(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getString(5));
				list.add(dept);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(rs, ptmt, con);
			
		}
		
		return list;
	}
	public int insert(DeptDTO dto) {
		Connection con = null;
		PreparedStatement ptmt = null;
		int result = 0;
		String sql = "insert into mydept values(?, ?, ?, ?, ?)";
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, dto.getDeptNo());
			ptmt.setString(2, dto.getDeptName());
			ptmt.setString(3, dto.getLoc());
			ptmt.setString(4, dto.getTel());
			ptmt.setString(5, dto.getMgr());
			
			result = ptmt.executeUpdate();
			System.out.println("result=>"+result);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(null, ptmt, con);
		}
		return result;
	
	}

}
