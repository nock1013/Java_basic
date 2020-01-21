package basic;
public class InsaImpl implements Insa {
	MemberDAO dao;
	//1. 생성자를 이용해서 작업
	public InsaImpl() {//기본생성자
		
	}
	//2. setter메소드를 이용해서 작업하는 방법
	
	
	@Override
	public void addUser(MemberDTO user) {
		dao.add(user);
	}

	public void setDao(MemberDAO dao) {
		this.dao = dao;
	}


	public InsaImpl(MemberDAO dao) {
		super();
		this.dao = dao;
	}

	@Override
	public MemberDTO getUser(String id) {
		dao.getUser("id");
		return null;
	}

}
