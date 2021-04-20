//学校管理
public class SchoolManagement {

		public static void main(String[] args) {
			
			Student st1 = new Student("张三","101","学生");
			Student st2 = new Student("张四","102","学生");		
			Student st3= new Student("张五","103","学生");
			
			Teacher th1 = new Teacher("李三","201","老师");//老师
			Teacher th2 = new Teacher("李四","202","老师");//老师
			
			ClericalStaff cs1 = new ClericalStaff("王三","301","行政人员");//行政人员
		
			Manager ma1 = new Manager("赵三","401","管理员");//管理员	
	
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
