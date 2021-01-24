package parts.templateMethod.study;

public abstract class AbstractDisplay {
	
	//하위 클래스에 구현을 맡기는 추상클래스
	public abstract void open();
	public abstract void print();
	public abstract void close();
	
	//실제 뼈대
	public final void display(){
		open();
		for(int i = 0; i < 5; i++){
			print();
		}
		close();
	}
}
