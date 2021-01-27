package parts.templateMethod.example1;

public class TemplateMethodMain {
	
	public static void main(String[] args){
		AbstractCar tesla = new TeslaCar(20, 1);
		AbstractCar hyundai = new HyundaiCar(100, 2);
		tesla.go();
		hyundai.go();
	}
	
}



