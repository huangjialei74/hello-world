public class MyThread implements Runnable{

	private int array[] = new int[100];
	private int b;  //待查找的值
	
	private int e=0 ;
	
	    //构造函数
		public MyThread(int []num,int b) {
	
			this.array = num;
		
			this.b = b;	
		}
		
		//覆写run()
		public void run(){
			String strName = Thread.currentThread().getName();
			String strNum[] = strName.split("-");
		    int start = Integer.valueOf(strNum[0]);
		    int end = Integer.valueOf(strNum[1]);
			
		
		  for(int i = start;i<=end;i++)  
		  {	
			if(e==1) break;
			else{
			     System.out.println("线程"+Thread.currentThread().getName()+"正在浏览元素:"+this.array[i]);			 
    
			    if(this.array[i] == this.b) {//找到了元素
				 e = 1;
				 System.out.println("线程"+Thread.currentThread().getName()+"已经找到该元素，该元素在数组中的下标："+i);	
				 break;
					
			    }
		     }		
		  }
		
		}
		
		
		
	
		
}
