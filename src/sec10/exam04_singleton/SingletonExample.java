package sec10.exam04_singleton;

public class SingletonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Singleton obj1 = new Singleton(); private로 선언되어서 안됨
		// Singleton obj2 = new Singleton(); private로 선언되어서 안됨

		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();

		if (obj1 == obj2) {
			System.out.println("같은 Singleton객체임.");
		} else {
			System.out.println("다른 Singleton객체임.");
		}

	}

}
