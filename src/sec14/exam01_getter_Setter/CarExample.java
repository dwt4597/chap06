package sec14.exam01_getter_Setter;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();

		myCar.setSpeed(-60);
		myCar.setStop(false);
		System.out.println(myCar.getSpeed());
		System.out.println(myCar.isStop());

	}

}
