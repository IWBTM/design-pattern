package creational;

public class BuilderMain {

	public static void main(String[] args) {
		
		// 객체의 매개변수에 순서 없이 값을 할당하는 것 보다 높은 가독성을 가지고 있다.
		Builder builder = new Builder
				.BuilderBuilder(24)
					.setBirth("001123")
					.setHeight(175)
					.setName("경민")
					.build();
		
		System.out.println(builder.toString());
	}
}
