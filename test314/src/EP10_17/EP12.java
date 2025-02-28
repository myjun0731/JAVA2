package EP10_17;

interface Shape {
	void draw();
}

abstract class ColorShape implements Shape {
	String color;

	public ColorShape(String color) {
		this.color = color;
	}

	public void displayColor() {
		System.out.println("Color: " + color);
	}
}

class Circle extends ColorShape {
	public Circle(String color) {
		super(color);
	}

	// Q1. draw() 메서드를 구현하여 "Drawing a circle"을 출력하도록 하세요.
	@Override
	public void draw() {
		System.out.println("Drawing a circle");
	}
}

public class EP12 {
	public static void main(String[] args) {
		// Q2. Circle 클래스의 인스턴스를 생성하고 draw() 메서드를 호출하세요.
		Circle circle = new Circle("Red");
		circle.draw();

		// Q3. Circle 클래스의 인스턴스를 생성하고 displayColor() 메서드를 호출하세요.
		circle.displayColor();

		// Q4. Shape 인터페이스를 구현하는 익명 클래스를 생성하고 draw() 메서드를 호출하세요.
		Shape shape = new Shape() {
			@Override
			public void draw() {
				System.out.println("Drawing a shape");
			}
		};
		shape.draw();
	}
}