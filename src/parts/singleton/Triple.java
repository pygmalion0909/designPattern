package parts.singleton;

import java.util.ArrayList;
import java.util.List;

public class Triple {
	private static Triple triple1 = new Triple("1");
	private static Triple triple2 = new Triple("2");
	private static Triple triple3 = new Triple("3");
	
	private Triple(String id) {
		System.out.println(id + "번째 인스턴스 생성!");
	}
	
	public static Triple getInstance(int id){
		List<Triple> list = new ArrayList<>();
		list.add(triple1);
		list.add(triple2);
		list.add(triple3);
		return list.get(id-1);
	}
}
