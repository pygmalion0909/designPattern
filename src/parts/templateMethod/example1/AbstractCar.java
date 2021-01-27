package parts.templateMethod.example1;

public abstract class AbstractCar {
	
	//하위클래스가 구현
	public abstract void on();
	public abstract void start();
	public abstract int speed();
	public abstract int distance();
	public abstract void arrive();
	
	public void go() {
		on();
		start();
		int distance = distance();
		int speed = speed();
		while(distance >= 0) {
			System.out.println("현재 " + speed + "속도 남은거리 " + distance + "km");
			speed += speed;
			distance = distance - speed;
		}
		arrive();
	};
	
}
