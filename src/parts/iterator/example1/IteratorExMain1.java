package parts.iterator.example1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IteratorExMain1 {
	
	public void iteratorTest() {
		
		/**
		 * Samsung menu item setting
		 */
		List<Samsung> SetSamsungMenu = new ArrayList<>();
		SetSamsungMenu.add(new Samsung("01/06", Arrays.asList("쌀밥", "오뎅국", "시금치무침"), Arrays.asList("현미밥", "된장국", "고등어조림")));
		SetSamsungMenu.add(new Samsung("01/07", Arrays.asList("콩밥", "계란국", "오지어무침"), Arrays.asList("잡곡밥", "김치국", "제육볶음")));
		
		/**
		 * set menu box
		 */
		MenuBox menuBox = new MenuBox();
		menuBox.setMenu(SetSamsungMenu);
		
		/**
		 * return save menu count
		 */
		int menuSize = menuBox.getMenuSize();
		System.out.println("저장된 메뉴 일수 : " + menuSize);
		
		/**
		 * iterator
		 */
		Iterator items = menuBox.iterator();
		while(items.hasNext()) {
			Samsung menu = (Samsung) items.next();
			System.out.println(menu.getDate() + "일=> " + "점심 : " + menu.getLunch() + " 저녁 : " + menu.getNight());
		}
		
	}
	
}
