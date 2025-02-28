package EP10_17;

class Vehicle {
	public void move() {
		System.out.println("Vehicle is moving");
	}
}

class Car extends Vehicle {
	// Q1. move() 메서드를 오버라이딩하여 "Car is moving"을 출력하도록 하세요.
	@Override
	public void move() {
		System.out.println("Car is moving");
	}

	// Q2. move(int speed) 메서드를 오버로딩하여 속도에 따라 다른 메시지를 출력하도록 하세요.
	public void move(int speed) {
		System.out.println("Car is moving at " + speed + " km/h");
	}
}

public class EP11 {
	public static void main(String[] args) {
		// Q3. Vehicle 클래스의 인스턴스를 생성하고 move() 메서드를 호출하세요.
		Vehicle vehicle = new Vehicle();
		vehicle.move();
		// Q4. Car 클래스의 인스턴스를 생성하고 move() 메서드를 호출하세요.
		Car car = new Car();
		car.move();
		// Q5. Car 클래스의 인스턴스를 생성하고 move(100) 메서드를 호출하세요.
		car.move(100);
	}
}