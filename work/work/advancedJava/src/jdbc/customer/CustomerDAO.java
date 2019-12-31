package jdbc.customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jdbc.board.exam.BoardDTO;
import jdbc.board.exam.DBUtil;

public class CustomerDAO {
	public int insert(CustomerDTO customer) {
		System.out.println("dto���޼ҵ�"+customer);
		Connection con = null;
		PreparedStatement stmt = null;
		String sql = "insert into tb_board values(?,?,?,sysdate,0,?)";
		int result = 0; //�޼ҵ� �������� ����� ����
				try {
			System.out.println("����̹� �ε� ����!!");
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, customer.getId());
			stmt.setString(2, customer.getPass());
			stmt.setString(3, customer.getName());
			stmt.setString(4, customer.getAddr());
			result = stmt.executeUpdate();
			System.out.println(result+"�� �� ���Լ���");
				}catch(SQLException e) {
			e.printStackTrace();
				}finally {
						DBUtil.close(null, stmt, con);
				}
				return result;
			
	}
	public int delete(String id) {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		StringBuffer sql = new StringBuffer();
		sql.append("delete customer");
		sql.append("where id = ?");
		int result = 0;
		try {
			System.out.println("����̹� �ε� ����");
			 con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql.toString());
			stmt.setString(1, id);
			result = stmt.executeUpdate();
			System.out.println(result+"�� ���� �����ƽ��ϴ�.");
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null, stmt, con);
		}
		return result;
	}
	public int update(String id, String addr) {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String sql = "update tb_board set addr = ? where id = ?";
		int result = 0;
		try {
			con = DBUtil.getConnect();//DBMS����
			System.out.println("���Ἲ��"+con);
			stmt = con.prepareStatement(sql);
			stmt.setString(1, addr);
			stmt.setString(2, id);
			result = stmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();//��������
		}finally {
			DBUtil.close(null, stmt, con);
		}
		return result;

	}
	

}