package parts.iterator.study;

public class Main {
	
	public void iteratorTest() {
		BookShelf bookShelf = new BookShelf(4);
		bookShelf.appendBook(new Book("80일간 세계일주"));	
		bookShelf.appendBook(new Book("성서"));	
		bookShelf.appendBook(new Book("신데렐라"));	
		bookShelf.appendBook(new Book("키다리 아저씨"));
		
		Iterator it = bookShelf.iterator();
		while(it.hasNext()) {
			Book book = (Book) it.next();
			System.out.println(book.getName());
		}
	}
	
}
