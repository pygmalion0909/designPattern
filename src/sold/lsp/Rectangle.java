package sold.lsp;

public class Rectangle {
	protected int width;
	protected int height;

	public void setWidth(int width){
		this.width = width;
	}
	public void setHeight(int height){
		this.height = height;
	}
	public final int getArea(){
		return this.width * this.height;
	}
}
