import java.util.Scanner;
//������
public class Equation {
	public static void main(String[] args) {
				
		System.out.println("������a,b,c��ֵ��");
		Scanner sn1 = new Scanner (System.in);
		int a = sn1.nextInt();
		int b = sn1.nextInt();
		int c = sn1.nextInt();
		
		Slove slove = new Slove(a,b,c);
		slove.sloveequation();

		sn1.close();//�ر���Դ
	
	}

}