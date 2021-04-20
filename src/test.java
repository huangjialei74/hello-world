import java.util.Scanner;
public class test {
	
	public static void main(String[] args) {
		//int a[] = new int[5];
		int []a={0,1,0,0,0};
		
		Sale sa = new Sale(a);
		
		System.out.println("请输入顾客名字和手里的钱 用'-'隔开  例如A-20：");
		while(true) {
			
			Scanner sc = new Scanner(System.in);
			String name = sc.nextLine();
			
			if(name.length()==1) break;//输入0 即字符串长度为1的时候 停止卖票
			
		    new Thread(sa,name).start();
		 //   sc.close();
		}
		


	}
}
