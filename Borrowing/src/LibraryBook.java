import java.util.ArrayList;
import java.util.List;

/*������ͼ��������
��Ϊ��������������������ȥ�������ջ�������ʾͼ��������������
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
	    	System.out.println("��ͼ�������飺 ");
	        for(int i = 0;i<this.librarybook.size();i++){
	            Book temp;
	            temp = this.librarybook.get(i);
	            System.out.println(temp.book_name+ "  "+temp.number);
	        }
	    }

}
