
public class test {


	public static void main(String[] args) {	
		
	
		int a[] = new int [100];
		for(int i = 0;i<100;i++)//给数组赋值
			a[i] = i+1;//存入1~100
		
		MyThread m = new MyThread(a,30);//a是数组，b是要查找的值，0和50是在数组中开始查找的位置
	    Thread m1 = new Thread(m,"0-49");
	    Thread m2 = new Thread(m,"50-99");
		m1.start();
		m2.start();
		
	
		
	}

}
