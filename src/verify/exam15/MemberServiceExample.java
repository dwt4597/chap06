package verify.exam15;

public class MemberServiceExample {

	public static void main(String[] args) {
		MemberService memberSecvice = new MemberService();
		boolean result = memberSecvice.login("hong", "12345");

		if (result) {
			System.out.println("로그인되었습니다.");
			memberSecvice.logout("hong");
		} else {
			System.out.println("id또는pass가 올바르지않습니다.");
		}
	}

}
