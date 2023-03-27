package creational;

/**
 * @author rnldu
 *
 */
public class Builder {

	// required parameter
	private int age;

	private String name;
	private String birth;
	private int height;

	// 생성자를 private으로 선언한다.
	private Builder(BuilderBuilder builderBuilder) {
		this.name = builderBuilder.name;
		this.age = builderBuilder.age;
		this.height = builderBuilder.height;
		this.birth = builderBuilder.birth;
	}

	// 변수를 private으로 선언했기 때문에 getter 선언
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getHeight() {
		return height;
	}

	public String getBirth() {
		return birth;
	}

	// 생성자를 private으로 선언했기 때문에 내부 클래스인 Builder를 static으로 선언한다.
	public static class BuilderBuilder {

		// required parameter
		private int age;

		private String name;
		private int height;
		private String birth;

		// Builder클래스의 생성자 매개변수에는 반드시 필요로 하는 변수를 할당 받는다.
		public BuilderBuilder(int age) {
			this.age = age;
		}

		// 모든 변수를 private으로 선언했기 때문에 setter로 값을 할당 받는다.
		public BuilderBuilder setName(String name) {
			this.name = name;
			return this;
		}

		public BuilderBuilder setHeight(int height) {
			this.height = height;
			return this;
		}

		public BuilderBuilder setBirth(String birth) {
			this.birth = birth;
			return this;
		}

		// 원하는 값을 다 할당 했다면, build()를 호출하여 객체를 생성한다.
		public Builder build() {
			return new Builder(this);
		}
	}

	@Override
	public String toString() {
		return "Builder [age=" + age + ", name=" + name + ", birth=" + birth + ", height=" + height + "]";
	}

}
