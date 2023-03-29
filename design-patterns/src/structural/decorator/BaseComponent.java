package structural.decorator;

public class BaseComponent implements Component {

	// 커피의 베이스라고 할 수 있는 에스프레소
	@Override
	public String add() {
		return "에스프레소";
	}

}
