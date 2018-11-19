package sec07.exam03_constructor_overloading;

public class Car {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car(){
		
	}
	
	Car(String model){
		this.model = model;
	}
	
	Car(String model, String color){
		this.model = model;
		this.color = color;
	}
	
	Car(String model,String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	/*Car(String color, int maxSpeed, String model){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	} 위와 string int string이 같으므로. 오버로딩x
	*/
}
