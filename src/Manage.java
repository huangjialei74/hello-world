import java.util.ArrayList;
import java.util.List;

//������

public class Manage{
	List<Person>Manage;
	public Manage() {
		 this.Manage = new ArrayList<Person>();
	}
	
	//�����
	public void add(Person p){
        this.Manage.add(p);
	}

	//ɾ��
	public void delete(Person p) {
		int i;
		for(i = 0;i<Manage.size();i++) {
			if(Manage.get(i) == p)
				Manage.remove(i);
		}		
	}
	
	//�޸�
	public void change(Person p,String name,String id) {
		for(int i = 0;i<Manage.size();i++) {
			if(Manage.get(i) == p) {
				Manage.get(i).setName(name);
			    Manage.get(i).setId(id);
			}
		}			
	}
	void show(){
    	System.out.println("��������Ϣ�� ");
        for(int i = 0;i<this.Manage.size();i++){
            System.out.println("������ "+this.Manage.get(i).getName() + "  ��ţ� "+this.Manage.get(i).getId()+ "\n��ݣ� "+this.Manage.get(i).getIdentity());
           System.out.print("��Ϊ��");
            this.Manage.get(i).action();
            System.out.print("\n");
       
    }
	}
	

	
}