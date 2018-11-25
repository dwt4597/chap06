package verify.exam15;

public class a {
	boolean login(String id, String pass) {
		if (id.equals("ijs9200") && pass.equals("1234")) {
			return true;
		} else {
			return false;
		}
	}

	void logout(String id) {
		System.out.println("logout됨");

	}
}
