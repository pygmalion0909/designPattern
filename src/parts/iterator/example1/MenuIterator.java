package parts.iterator.example1;

import java.util.List;

/**
 * @function
 * 오로지 반복해서 값을 return시켜주는 기능
 * 저장된 list자체를 가져와서 여기서 반복 시키면서 원하는 값을 리턴해주는다?
 */
public class MenuIterator implements Iterator{
	
	private List<Samsung> menuList;
	private int index = 0;
	
	/**
	 * @notice
	 * iterator메소드에서 new MenuIterator(this)로 넘겨도
	 * menuList는 Menu class에서 private라서 MenuIterator객체에서 사용할 수 없다
	 * 즉, private변수, 메서드는 사용 불가능 하다
	 * MenuIterator객체를 생성 시 menuList를 받았다.
	 * 이유는 책 예제를 따라 BookShelf 객체에서 생성된 메서드를 이용하여 현재 저장된 Book length를 구할 경우
	 * BookShelf객체와 결합성이 있어서 완전 분리 해버렸다
	 */
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
