//解方程的类
public class Slove {
	int m_a,m_b,m_c;
	public Slove(int a,int b,int c){
		m_a = a;
		m_b = b;
		m_c = c;
	}
	public void sloveequation(){
		double a[] = new double[2];
		if(m_b*m_b-4*m_a*m_c<0) {
			System.out.println("无解");	
		    return;//结束
		}
		a[0] = (-m_b+Math.sqrt(m_b*m_b-4*m_a*m_c))/(2*m_a);
		a[1] = (-m_b-Math.sqrt(m_b*m_b-4*m_a*m_c))/(2*m_a);
		System.out.println("x1 = "+a[0]+" x2 = "+a[1]);			
	}
}