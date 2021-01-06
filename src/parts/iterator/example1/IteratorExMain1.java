package parts.iterator.example1;

import java.util.ArrayList;
import java.util.List;

public class IteratorExMain1 {
	
	public void iteratorTest() {
		
		/**
		 * Samsung menu item setting
		 */
		List<Samsung> samsungMenu = new ArrayList<>();
		samsungMenu.add(new Samsung("떡볶이"));
		samsungMenu.add(new Samsung("오뎅"));
		samsungMenu.add(new Samsung("김밥"));
		
		MenuBox menuBox = new MenuBox();
		menuBox.setMenu(samsungMenu);
		
		Iterator items = menuBox.iterator();
		while(items.hasNext()) {
			System.out.println(items.next());
		}
		
	}
	
}
