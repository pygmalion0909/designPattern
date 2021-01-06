package parts.iterator.example1;

import java.util.ArrayList;
import java.util.List;

public class MenuBox implements Aggregate{
	
	private List<Samsung> menuList = new ArrayList<>();
	
	/**
	 * @title menu item setting
	 */
	public void setMenu(List<Samsung> menu) {
		this.menuList.addAll(menu);
	}
	
	/**
	 * @title only menu item iterator code
	 */
	@Override
	public Iterator iterator() {
		return new MenuIterator(menuList);
	}
	
}
