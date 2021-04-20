
public class Tutor implements Teaching{
	public Teaching tea;
	public int count;
	
	
	//构造函数
	public Tutor(Teaching tea,int count) {
		this.tea = tea;
		this.count = count;
	}
	
	//批改作业
	public void correct(int c) {
		if(c<this.count)
			try {
			      throw new Exception1("没改完");
			 }catch(Exception1 e) {
					System.out.println(e);
					System.out.println("还教室");
					System.exit(0);
		}
		else
		System.out.println("批改");
	}
	//收集作业
	public void collect(int c) {
		if(c<this.count)
			try {
				  throw new Exception1("没交齐");
		    }catch(Exception1 e) {
					System.out.println(e);
					System.out.println("还教室");
					System.exit(0);
		    }
		else
		    System.out.println("收集");
	} 
	
	//覆写上课
	public void givelesson(int a,int b) {
			this.correct(a);
			this.tea.givelesson(a,b);
			this.collect(b);
	
	}
	

	
}
	


