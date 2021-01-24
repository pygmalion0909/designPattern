package parts.iterator.example1;

import java.util.List;


public class MenuIterator implements Iterator{
	
	private List<Samsung> menuList;
	private int index = 0;
	
	public MenuIterator(List<Samsung> menuList) {
		this.menuList = menuList;
	}

	@Override
	public boolean hasNext() {
		if(index < this.menuList.size()) {
			return true;
		}else {
			return false; 			
		}
	}
	
	@Override
	public Samsung next() {
		Samsung item = menuList.get(index);
		index++;
		return item;
	}
	
}
