//ѧУ����
public class SchoolManagement {

		public static void main(String[] args) {
			
			Student st1 = new Student("����","101","ѧ��");
			Student st2 = new Student("����","102","ѧ��");		
			Student st3= new Student("����","103","ѧ��");
			
			Teacher th1 = new Teacher("����","201","��ʦ");//��ʦ
			Teacher th2 = new Teacher("����","202","��ʦ");//��ʦ
			
			ClericalStaff cs1 = new ClericalStaff("����","301","������Ա");//������Ա
		
			Manager ma1 = new Manager("����","401","����Ա");//����Ա	
	
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
