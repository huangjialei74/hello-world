//import jdk.internal.misc.FileSystemOption;

public class Sale implements Runnable{
	private int count[] = new int[5];//五个币种各自数量
	
	//构造函数
	public Sale(int []a) {
		count = a;	
	}
	
	public void run() {
	
		String strName = Thread.currentThread().getName();
		String strNum[] = strName.split("-");//分割字符串
		
	    int money = Integer.valueOf(strNum[1]);//用户的钱
	      
		while(true)//买到票 顾客才会走  不然就等待
		{
			if(money < Integer.valueOf(strNum[1])) break;//买到了票 跳出循环，该线程结束
			
		synchronized(this) //一次一个人买
		{
			
		//找钱算法        数组b[]是5元，10元，20元，50 元各自要找给顾客的数量
	    int b[] = new int[4]; 
	    this.getchange(money-5,b);//传入b 对其进行修改
	    
	    if(5*b[0]+10*b[1]+20*b[2]+50*b[3] == money-5) {
	    	
	    	// 判断顾客钱的面值  顾客的钱给售票员
	    	if(money==5) count[0]++;
			if(money==10) count[1]++;
			if(money==20) count[2]++;
			if(money==50) count[3]++;
			if(money==100) count[4]++;
			
			//找钱
		    count[3] -= b[3];
		    count[2] -= b[2];
		    count[1] -= b[1];
		    count[0] -= b[0];	
		    money-=5;
		 
		    System.out.println("顾客"+strNum[0]+"用"+Integer.valueOf(strNum[1])+"元"+"购票成功");
		  
		    System.out.println("售票员手上的钱："+"5元: "+count[0]+"张   10元: "+count[1]+"张    20元： "+count[2]+"张   50元:"+count[3]+"张   100元:"+count[4]+"张");
		    super.notifyAll();//唤醒所有
		    break;
	    }
	    //顾客的钱没有减少
	    if(money == Integer.valueOf(strNum[1])){
	         System.out.println("顾客"+strNum[0]+"拿着"+Integer.valueOf(strNum[1])+"元"+"在等待");	
	    try{
			super.wait();//自己进入等待
		}catch(InterruptedException e){
				e.printStackTrace();
		}
	    } 
	   
	}//synchronized(this)
		
	}//while
		
	}//run

	
//找钱算法
public void getchange (int money,int b[])
{	

	for(int i=0;i<4;i++) b[i]=0;
	
	int a[] = new int[]{5,10,20,50,100};//币值
	
	if(money==0) return;
	
	if(money>50) {
	if(count[3]!=0) {
		
		if(money>70) {   if(count[2]!=0) {
			for(b[0]=0;b[0]<=count[0];b[0]++) {
				for(b[1]=0;b[1]<=count[1];b[1]++) {
						if(5*b[0]+10*b[1]==money-70) {
							b[3]=1;// 有50 20 并且能利用的时候
						    b[2]=1;
							return;
				}}}}}
			
		//没有20或者用不上20的  
		for(b[0]=0;b[0]<=count[0];b[0]++) {
			for(b[1]=0;b[1]<=count[1];b[1]++) {
					if(5*b[0]+10*b[1]==money-50) {
						b[3]=1;// 有50能用
						return;
			}}}
			
	}}
	
//money<=50 并且没有50的时候	
	
	   if(money>20) {
	    if(count[2]!=0) {
		for(b[0]=0;b[0]<=count[0];b[0]++) {
			for(b[1]=0;b[1]<=count[1];b[1]++) {
					if(5*b[0]+10*b[1]==money-20) {
					// 有 20 并且能利用的时候
					    b[2]=1;
						return;
			}}}}
	    
	    //没有20或者用不上20的  
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








