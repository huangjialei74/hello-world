

//����
public class Person {
	
	private String m_Name;//����
	private String m_Id;//���
	private String m_Identity;//���
	
	Person(String name,String id,String idn )
	{
		setName(name);
		setId(id);
		setIdentity(idn);
	}
	
	
	public void setName(String name) {
		m_Name = name;	
	}
	public String getName() {
		return m_Name;
	}
	
	public void setId(String id) {
		m_Id = id;	
	}
	public String getId() {
		return m_Id;
	}
	
	public void setIdentity(String idn) {
		m_Identity = idn;	
	}
	public String getIdentity() {
		return m_Identity;
	}
	
	//��Ϊ
	public void action(){
		System.out.print("˵��\n");
	}

}

