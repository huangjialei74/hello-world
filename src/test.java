
public class test {


	public static void main(String[] args) {	
		
	
		int a[] = new int [100];
		for(int i = 0;i<100;i++)//�����鸳ֵ
			a[i] = i+1;//����1~100
		
		MyThread m = new MyThread(a,30);//a�����飬b��Ҫ���ҵ�ֵ��0��50���������п�ʼ���ҵ�λ��
	    Thread m1 = new Thread(m,"0-49");
	    Thread m2 = new Thread(m,"50-99");
		m1.start();
		m2.start();
		
	
		
	}

}
