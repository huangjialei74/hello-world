import java.util.Scanner;
//方程类
public class Equation {
	public static void main(String[] args) {
				
		System.out.println("请输入a,b,c的值：");
		Scanner sn1 = new Scanner (System.in);
		int a = sn1.nextInt();
		int b = sn1.nextInt();
		int c = sn1.nextInt();
		
		Slove slove = new Slove(a,b,c);
		slove.sloveequation();

		sn1.close();//关闭资源
	
	}

}