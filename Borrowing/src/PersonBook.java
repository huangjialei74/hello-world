import java.util.ArrayList;
import java.util.List;

/*�����������ϵ���
��Ϊ���������������������������黹��ȥ����ʾ�����������������
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
	    	System.out.println("����������飺");
	        for(int i = 0;i<this.personbook.size();i++){
	            Book temp;
	            temp = this.personbook.get(i);
	            System.out.println(temp.book_name+ "  "+temp.number);
	        }
	    }
}
