//ѧУ����
public class SchoolManagement {

	public static void main(String[] args) {
		
		Student st1  = new Student();
		st1.setName("����");
		st1.setId("101");
		st1.setIdentity("ѧ��");
		
		Student st2= new Student();
		st2.setName("����");
		st2.setId("102");
		st2.setIdentity("ѧ��");	
		
		Student st3= new Student();
		st3.setName("����");
		st3.setId("103");
		st3.setIdentity("ѧ��");
	
		
		Teacher th1 = new Teacher();//��ʦ
		th1.setName("����");
		th1.setId("201");
		th1.setIdentity("��ʦ");
		
		Teacher th2 = new Teacher();//��ʦ
		th2.setName("����");
		th2.setId("202");
		th2.setIdentity("��ʦ");
		
		
		ClericalStaff cs1 = new ClericalStaff();//������Ա
		cs1.setName("����");
		cs1.setId("301");
		cs1.setIdentity("������Ա");
		
		
		Manager ma1 = new Manager();//����Ա
		ma1.setName("����");
		ma1.setId("401");
		ma1.setIdentity("����Ա");
	
		Manage  m = new Manage();//������
		
		m.add(st1);//����˽���
		m.add(st2);
		m.add(st3);
		m.add(th1);
		m.add(th2);
		m.add(cs1);
		m.add(ma1);
		m.show();
		System.out.print("--------------------------------------\n");
		
		m.delete(st3);//ɾ��
		m.delete(st2);
		m.show();
		System.out.print("--------------------------------------\n");
		
		m.change(st1, "����","106");//�޸���Ϣ��ֻ���޸����ԣ������޸���Ϊ
		m.change(th1, "������", "206");
		m.show();
		System.out.print("--------------------------------------\n");
		
		

	}

}
