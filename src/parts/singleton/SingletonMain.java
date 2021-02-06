package parts.singleton;

public class SingletonMain {

	public static void main(String[] args) {
		System.out.println("triple instance1 >> " + Triple.getInstance(1));
		System.out.println("triple instance2 >> " + Triple.getInstance(2));
		System.out.println("triple instance3 >> " + Triple.getInstance(3));
	}

}
