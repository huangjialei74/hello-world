import java.util.Scanner;
public class test {
	
	public static void main(String[] args) {
		//int a[] = new int[5];
		int []a={0,1,0,0,0};
		
		Sale sa = new Sale(a);
		
		System.out.println("������˿����ֺ������Ǯ ��'-'����  ����A-20��");
		while(true) {
			
			Scanner sc = new Scanner(System.in);
			String name = sc.nextLine();
			
			if(name.length()==1) break;//����0 ���ַ�������Ϊ1��ʱ�� ֹͣ��Ʊ
			
		    new Thread(sa,name).start();
		 //   sc.close();
		}
		


	}
}
