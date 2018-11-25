package verify.exam15;

public class b {

	public static void main(String[] args) {
		a memb = new a();
		boolean result = memb.login("ijs9200", "123");

		if (result) {
			System.out.println("로긴됨");
		} else {
			System.out.println("틀림");
		}
	}

}
