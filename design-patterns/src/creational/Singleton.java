package creational;

public class Singleton {

	// 멤버 변수로 본인을 선언한다.
	private static Singleton singleton;
	
	// 외부에서 직접 생성 시키지 못 하게 생성자를 private으로 선언한다.
	private Singleton() {
	}

	// 외부에서 Singleton 객체를 생성시키기 위해서는 getInstance()를 호출한다.
	public static Singleton getInstance() {
		// 구조적으로 보면 외부에서 처음 getInstance()가 호출 되었을 때는 내부에서 생성된다.
		// 한번 생성된 singleton객체는 두번 생성되지 않는다.
		// 처음 생성되었던 singleton객체가 return 된다.
		if (singleton == null) {
			singleton = new Singleton();
			return singleton;
		} else {
			return singleton;
		}
	}
}
