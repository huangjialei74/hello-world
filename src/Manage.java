import java.util.ArrayList;
import java.util.List;

//管理类

public class Manage{
	List<Person>Manage;
	public Manage() {
		 this.Manage = new ArrayList<Person>();
	}
	
	//添加人
	public void add(Person p){
        this.Manage.add(p);
	}

	//删除
	public void delete(Person p) {
		int i;
		for(i = 0;i<Manage.size();i++) {
			if(Manage.get(i) == p)
				Manage.remove(i);
		}		
	}
	
	//修改
	public void change(Person p,String name,String id) {
		for(int i = 0;i<Manage.size();i++) {
			if(Manage.get(i) == p) {
				Manage.get(i).setName(name);
			    Manage.get(i).setId(id);
			}
		}			
	}
	void show(){
    	System.out.println("所有人信息： ");
        for(int i = 0;i<this.Manage.size();i++){
            System.out.println("姓名： "+this.Manage.get(i).getName() + "  编号： "+this.Manage.get(i).getId()+ "\n身份： "+this.Manage.get(i).getIdentity());
           System.out.print("行为：");
            this.Manage.get(i).action();
            System.out.print("\n");
       
    }
	}
	

	
}