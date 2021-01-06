package parts.iterator.example1;

import java.util.ArrayList;
import java.util.List;

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
