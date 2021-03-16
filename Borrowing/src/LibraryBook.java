import java.util.ArrayList;
import java.util.List;

/*类名：图书馆里的书
行为：添加书类进来，把书借出去，把书收回来，显示图书馆所有书的数量
*/
public class LibraryBook {
	 List<Book>librarybook;
	 LibraryBook(){
	        this.librarybook = new ArrayList<Book>();
	    }
	    void add(Book b){
	        this.librarybook.add(b);
	    }
	    
	    void lend(int x) {
	        this.librarybook.get(x).number--;       
	    }
	    void tackback(int x) {
	        this.librarybook.get(x).number++;       
	    }
	    
	    void show(){
	    	System.out.println("在图书馆里的书： ");
	        for(int i = 0;i<this.librarybook.size();i++){
	            Book temp;
	            temp = this.librarybook.get(i);
	            System.out.println(temp.book_name+ "  "+temp.number);
	        }
	    }

}
