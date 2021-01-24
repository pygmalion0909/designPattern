package parts.iterator.example1;

import java.util.ArrayList;
import java.util.List;

/**
 * menuList를 menuIterator로 넘기게 되면 강결합
 * 이유는
 * 만약, menuList의 타입을 변경 시 menuIterator객체에 사용한 모든 메서드를 수정해야한다
 * 하지만 this로 넘기면 mebuBox에서 수정하면 자동적으로 menuIterator의 메소드가 수정 되어 menuIterator는 수정 할 필요가 없다
 * 객체 끼리 안쪽에 있는 값을 연결될수록 강결합이다
 */
public class MenuBox implements Aggregate{
	
	private List<Samsung> menuList = new ArrayList<>();
	
	/**
	 * menu item setting
	 */
	public void setMenu(List<Samsung> lunch) {
		this.menuList.addAll(lunch);
	}
	
	public int getMenuSize() {
		return menuList.size();
	}
	
	/**
	 * only menu item iterator code
	 */
	@Override
	public Iterator iterator() {
		return new MenuIterator(menuList);
	}
	
}
