
public class Tutor implements Teaching{
	public Teaching tea;
	public int count;
	
	
	//���캯��
	public Tutor(Teaching tea,int count) {
		this.tea = tea;
		this.count = count;
	}
	
	//������ҵ
	public void correct(int c) {
		if(c<this.count)
			try {
			      throw new Exception1("û����");
			 }catch(Exception1 e) {
					System.out.println(e);
					System.out.println("������");
					System.exit(0);
		}
		else
		System.out.println("����");
	}
	//�ռ���ҵ
	public void collect(int c) {
		if(c<this.count)
			try {
				  throw new Exception1("û����");
		    }catch(Exception1 e) {
					System.out.println(e);
					System.out.println("������");
					System.exit(0);
		    }
		else
		    System.out.println("�ռ�");
	} 
	
	//��д�Ͽ�
	public void givelesson(int a,int b) {
			this.correct(a);
			this.tea.givelesson(a,b);
			this.collect(b);
	
	}
	

	
}
	


