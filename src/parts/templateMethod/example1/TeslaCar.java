package parts.templateMethod.example1;

public class TeslaCar extends AbstractCar{
	
	private int distance;
	private int speed;
	
	public TeslaCar(int distance, int speed) {
		this.distance = distance;
		this.speed = speed;
	}
	
	public void on() {
		System.out.println("TeslaCar On");
	};
	public void start() {
		System.out.println("TeslaCar Start!");
	};
	public int speed() {
		return this.speed;
	}
	public int distance() {
		return this.distance;
	};
	public void arrive() {
		System.out.println("TeslaCar Arrive!");
	};

}
