public class MyThread implements Runnable{

	private int array[] = new int[100];
	private int b;  //�����ҵ�ֵ
	
	private int e=0 ;
	
	    //���캯��
		public MyThread(int []num,int b) {
	
			this.array = num;
		
			this.b = b;	
		}
		
		//��дrun()
		public void run(){
			String strName = Thread.currentThread().getName();
			String strNum[] = strName.split("-");
		    int start = Integer.valueOf(strNum[0]);
		    int end = Integer.valueOf(strNum[1]);
			
		
		  for(int i = start;i<=end;i++)  
		  {	
			if(e==1) break;
			else{
			     System.out.println("�߳�"+Thread.currentThread().getName()+"�������Ԫ��:"+this.array[i]);			 
    
			    if(this.array[i] == this.b) {//�ҵ���Ԫ��
				 e = 1;
				 System.out.println("�߳�"+Thread.currentThread().getName()+"�Ѿ��ҵ���Ԫ�أ���Ԫ���������е��±꣺"+i);	
				 break;
					
			    }
		     }		
		  }
		
		}
		
		
		
	
		
}
