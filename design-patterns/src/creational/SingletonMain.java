package creational;

public class SingletonMain {

	public static void main(String[] args) {

		// 처음 생성
		Singleton firstSingleton = Singleton.getInstance();

		// 처음 생성됐던 객체를 가져옴
		Singleton secondSingleton = Singleton.getInstance();

		// 같은 주소값
		System.out.println(firstSingleton.toString());
		System.out.println(secondSingleton.toString());
	}
}
