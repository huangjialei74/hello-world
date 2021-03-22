//学校管理
public class SchoolManagement {

	public static void main(String[] args) {
		
		Student st1  = new Student();
		st1.setName("张三");
		st1.setId("101");
		st1.setIdentity("学生");
		
		Student st2= new Student();
		st2.setName("张四");
		st2.setId("102");
		st2.setIdentity("学生");	
		
		Student st3= new Student();
		st3.setName("张五");
		st3.setId("103");
		st3.setIdentity("学生");
	
		
		Teacher th1 = new Teacher();//老师
		th1.setName("李三");
		th1.setId("201");
		th1.setIdentity("老师");
		
		Teacher th2 = new Teacher();//老师
		th2.setName("李四");
		th2.setId("202");
		th2.setIdentity("老师");
		
		
		ClericalStaff cs1 = new ClericalStaff();//行政人员
		cs1.setName("王三");
		cs1.setId("301");
		cs1.setIdentity("行政人员");
		
		
		Manager ma1 = new Manager();//管理员
		ma1.setName("赵三");
		ma1.setId("401");
		ma1.setIdentity("管理员");
	
		Manage  m = new Manage();//管理类
		
		m.add(st1);//添加人进来
		m.add(st2);
		m.add(st3);
		m.add(th1);
		m.add(th2);
		m.add(cs1);
		m.add(ma1);
		m.show();
		System.out.print("--------------------------------------\n");
		
		m.delete(st3);//删除
		m.delete(st2);
		m.show();
		System.out.print("--------------------------------------\n");
		
		m.change(st1, "李雷","106");//修改信息，只能修改属性，不能修改行为
		m.change(th1, "韩美美", "206");
		m.show();
		System.out.print("--------------------------------------\n");
		
		

	}

}
