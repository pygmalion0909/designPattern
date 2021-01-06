package parts.iterator.study;

public class IteratorMain {
	
	public void iteratorTest() {
		BookShelf bookShelf = new BookShelf(4);
		bookShelf.appendBook(new Book("80일간"));	
		bookShelf.appendBook(new Book("성경"));	
		bookShelf.appendBook(new Book("독서법"));	
		bookShelf.appendBook(new Book("데미안"));
		
		Iterator it = bookShelf.iterator();
		while(it.hasNext()) {
			Book book = (Book) it.next();
			System.out.println(book.getName());
		}
	}
	
}
