package verify.exam15;

public class MemberService {
	boolean login(String id, String password) {
		if(id.equals("hong")&&password.equals("12345") ) {
			System.out.println("로그인되었습니다.");
			return true;
		} else { 
			return false;
		}
	}

	void logout(String id) {
		System.out.println("로그아웃되었습니다.");
	}
}
