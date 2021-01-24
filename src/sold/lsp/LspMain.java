package sold.lsp;

public class LspMain {

	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle();
		rectangle.setWidth(5);
		rectangle.setHeight(4);
		System.out.println(rectangle.getArea());
		
		Rectangle square = new Square();
		square.setWidth(5);
		square.setHeight(4);
		System.out.println(square.getArea());
	}

}
