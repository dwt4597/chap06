package sec11.exam01_final;

public class PersonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("123411-122311", "이준수");
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
//		p1.nation = "usa"; final은 딱 1번 수정가능
//		p1.ssn = "123213213-123213123"; "
		p1.name="김준수"; // 얜 final이 아니라 수정o
		
		
	}

}
