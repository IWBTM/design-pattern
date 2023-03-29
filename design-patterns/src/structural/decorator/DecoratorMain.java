package structural.decorator;

public class DecoratorMain {

	public static void main(String[] args) {
		
		Component espresso = new BaseComponent();
		System.out.println(espresso.add());
		
		// 다형성
		Component americano = new WaterDecorator(new BaseComponent());
		System.out.println(americano.add());
		
		Component latte = new MilkDecorator(new BaseComponent());
		System.out.println(latte.add());

	}
}
