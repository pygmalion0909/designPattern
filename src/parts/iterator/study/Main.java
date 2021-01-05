package parts.iterator.study;

public class Main {
	
	public void iteratorTest() {
		BookShelf bookShelf = new BookShelf(4);
		bookShelf.appendBook(new Book("80�ϰ� ��������"));	
		bookShelf.appendBook(new Book("����"));	
		bookShelf.appendBook(new Book("�ŵ�����"));	
		bookShelf.appendBook(new Book("Ű�ٸ� ������"));
		
		Iterator it = bookShelf.iterator();
		while(it.hasNext()) {
			Book book = (Book) it.next();
			System.out.println(book.getName());
		}
	}
	
}
