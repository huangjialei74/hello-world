//import jdk.internal.misc.FileSystemOption;

public class Sale implements Runnable{
	private int count[] = new int[5];//������ָ�������
	
	//���캯��
	public Sale(int []a) {
		count = a;	
	}
	
	public void run() {
	
		String strName = Thread.currentThread().getName();
		String strNum[] = strName.split("-");//�ָ��ַ���
		
	    int money = Integer.valueOf(strNum[1]);//�û���Ǯ
	      
		while(true)//��Ʊ �˿ͲŻ���  ��Ȼ�͵ȴ�
		{
			if(money < Integer.valueOf(strNum[1])) break;//����Ʊ ����ѭ�������߳̽���
			
		synchronized(this) //һ��һ������
		{
			
		//��Ǯ�㷨        ����b[]��5Ԫ��10Ԫ��20Ԫ��50 Ԫ����Ҫ�Ҹ��˿͵�����
	    int b[] = new int[4]; 
	    this.getchange(money-5,b);//����b ��������޸�
	    
	    if(5*b[0]+10*b[1]+20*b[2]+50*b[3] == money-5) {
	    	
	    	// �жϹ˿�Ǯ����ֵ  �˿͵�Ǯ����ƱԱ
	    	if(money==5) count[0]++;
			if(money==10) count[1]++;
			if(money==20) count[2]++;
			if(money==50) count[3]++;
			if(money==100) count[4]++;
			
			//��Ǯ
		    count[3] -= b[3];
		    count[2] -= b[2];
		    count[1] -= b[1];
		    count[0] -= b[0];	
		    money-=5;
		 
		    System.out.println("�˿�"+strNum[0]+"��"+Integer.valueOf(strNum[1])+"Ԫ"+"��Ʊ�ɹ�");
		  
		    System.out.println("��ƱԱ���ϵ�Ǯ��"+"5Ԫ: "+count[0]+"��   10Ԫ: "+count[1]+"��    20Ԫ�� "+count[2]+"��   50Ԫ:"+count[3]+"��   100Ԫ:"+count[4]+"��");
		    super.notifyAll();//��������
		    break;
	    }
	    //�˿͵�Ǯû�м���
	    if(money == Integer.valueOf(strNum[1])){
	         System.out.println("�˿�"+strNum[0]+"����"+Integer.valueOf(strNum[1])+"Ԫ"+"�ڵȴ�");	
	    try{
			super.wait();//�Լ�����ȴ�
		}catch(InterruptedException e){
				e.printStackTrace();
		}
	    } 
	   
	}//synchronized(this)
		
	}//while
		
	}//run

	
//��Ǯ�㷨
public void getchange (int money,int b[])
{	

	for(int i=0;i<4;i++) b[i]=0;
	
	int a[] = new int[]{5,10,20,50,100};//��ֵ
	
	if(money==0) return;
	
	if(money>50) {
	if(count[3]!=0) {
		
		if(money>70) {   if(count[2]!=0) {
			for(b[0]=0;b[0]<=count[0];b[0]++) {
				for(b[1]=0;b[1]<=count[1];b[1]++) {
						if(5*b[0]+10*b[1]==money-70) {
							b[3]=1;// ��50 20 ���������õ�ʱ��
						    b[2]=1;
							return;
				}}}}}
			
		//û��20�����ò���20��  
		for(b[0]=0;b[0]<=count[0];b[0]++) {
			for(b[1]=0;b[1]<=count[1];b[1]++) {
					if(5*b[0]+10*b[1]==money-50) {
						b[3]=1;// ��50����
						return;
			}}}
			
	}}
	
//money<=50 ����û��50��ʱ��	
	
	   if(money>20) {
	    if(count[2]!=0) {
		for(b[0]=0;b[0]<=count[0];b[0]++) {
			for(b[1]=0;b[1]<=count[1];b[1]++) {
					if(5*b[0]+10*b[1]==money-20) {
					// �� 20 ���������õ�ʱ��
					    b[2]=1;
						return;
			}}}}
	    
	    //û��20�����ò���20��  
	    for(b[0]=0;b[0]<=count[0];b[0]++) {
			for(b[1]=0;b[1]<=count[1];b[1]++) {
					if(5*b[0]+10*b[1]==money) {
						return;
			}}}

	   }
	   
	    //
	    for(b[0]=0; b[0]<count[0]; b[0]++) {
			for(b[1]=0; b[1]<count[1]; b[1]++) {
					if(5*b[0]+10*b[1]==money) {
						return;
			}}}
}

}








