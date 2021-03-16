import java.util.ArrayList;
import java.util.List;

/*类名：人手上的书
行为：添加书类进来，把书借进来，把书还出去，显示人手上所有书的数量
*/
public class PersonBook {

	 List<Book>personbook;
	 PersonBook(){
	        this.personbook = new ArrayList<Book>();
	    }
	    void add(Book b){
	        this.personbook.add(b);
	    }

	    void borrow(int x) {
	        this.personbook.get(x).number++;       
	    }
	    void giveback(int x) {
	        this.personbook.get(x).number--;       
	    }
	    
	    void show(){
	    	System.out.println("在人手里的书：");
	        for(int i = 0;i<this.personbook.size();i++){
	            Book temp;
	            temp = this.personbook.get(i);
	            System.out.println(temp.book_name+ "  "+temp.number);
	        }
	    }
}
