
public class Borrowing {

	public static void main(String[] args) {
		Book book01 = new Book("aaa",1);
	    Book book02 = new Book("bbb",1);
	    Book book03 = new Book("ccc",1);
	    Book book04 = new Book("ddd",0);
	    
	    Person p1 = new Person("Tom","student");
	    
	    p1.add(book01);
	    p1.add(book02);
	    p1.add(book03);
	    p1.add(book04);
	    
	    
	    Book book001 = new Book("aaa",9);
	    Book book002 = new Book("bbb",9);
	    Book book003 = new Book("ccc",9);
	    Book book004 = new Book("ddd",10);
	    
	    Library library = new Library();
	    
	    library.add(book001);
	    library.add(book002);
	    library.add(book003);
	    library.add(book004);
	    
	    System.out.println("人去借书前： ");
	    p1.personbook.show();
	    library.librarybook.show();
	    
	    p1.personbook.borrow(3);//人把书借过来
	    library.librarybook.lend(3);//图书馆把书借出去
	    
	    
	    System.out.println("\n人去借书后： ");
	    p1.personbook.show();
	    library.librarybook.show();
	    


	}

}
