package day01.ex02.setter;
//DAO클래스는 DB정보를 갖고있다
public class MemberDAO {
	
	private DatabaseDev ds;
	
	public void setDs(DatabaseDev ds) {
		this.ds = ds;
	}
	
	public void info() {
		System.out.println("ds의 주소:" + ds.getUrl());
		System.out.println("ds의 아이디"+ ds.getUid());
		System.out.println("df의 비밀번호" + ds.getUpw());
	}
	
}
