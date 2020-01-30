package dept;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

//사용자정의 dao클래스
@Repository //DAO와 관련된 bean을 생성할때
public class DeptDAOImpl {
	@Autowired
	JdbcTemplate myTemplate;
	public int count() {
		return myTemplate.queryForObject("select count(*) from dept", Integer.class);
	}
	public int insert(String deptno,String deptname) {
		String sql = "insert into dept(deptno,deptname) values(?,?)";
		int result = myTemplate.update(sql, deptno,deptname);
		return result;
	}
	public int update(String deptno,String deptname) {
		String sql = "update dept set deptname=? where deptno=?";
		int result = myTemplate.update(sql, deptname,deptno);
		return result;
	}
	public List<DeptDTO> selectAll(){
		return myTemplate.query("select deptno,deptname from dept", new MyDeptRowMapper());
	}
}
