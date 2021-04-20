
public class test {

	public static void main(String[] args) {
		Teaching tea  = new Tutor(new RealTeaching(),20);//传入班级人数
		tea.givelesson(10,10);//传入批改和收集的数量
  //    tea.givelesson(20,10);
  //    tea.givelesson(20,20);
	}

}
