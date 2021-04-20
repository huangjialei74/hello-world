

//行政人员类
public class ClericalStaff extends Person{
	ClericalStaff(String name,String id,String idn )
	{
		super(name,id,idn);
	}
	public void action() {
		System.out.print("行政人员说话\n");
	}

}




