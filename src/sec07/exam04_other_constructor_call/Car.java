package sec07.exam04_other_constructor_call;

public class Car {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;

	Car() {

	}

	Car(String model) {
		/*
		 * this.model = model; this.color = null; this.maxSpeed = 0;
		 */
		
		// System.out.println("Car(String model) 실행"); //this()앞에 문장있으면 오류남
		this(model, null, 0);
		//System.out.println("Car(String model) 실행");  // 됨.

	}

	Car(String model, String color) {
		this(model, color, 0);
	}

	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

	/*
	 * Car(String color, int maxSpeed, String model){ this.model = model; this.color
	 * = color; this.maxSpeed = maxSpeed; } 위와 string int string이 같으므로. 오버로딩x
	 */
}
