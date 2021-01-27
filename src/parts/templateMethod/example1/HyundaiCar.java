package parts.templateMethod.example1;

public class HyundaiCar extends AbstractCar{
	
	private int distance;
	private int speed;
	
	public HyundaiCar(int distance, int speed) {
		this.distance = distance;
		this.speed = speed;
	}
	
	public void on() {
		System.out.println("HyundaiCar On");
	};
	public void start() {
		System.out.println("HyundaiCar Start!");
	};
	public int speed() {
		return this.speed;
	}
	public int distance() {
		return this.distance;
	};
	public void arrive() {
		System.out.println("HyundaiCar Arrive!");
	};
	
}
