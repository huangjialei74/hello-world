
/*��������
 ���ԣ����������
��Ϊ������飬���飬���飬��ʾ���ϵ�����
*/

class Person
{
    String person_name;
    String person_job;

    PersonBook personbook;

    Person(String name,String job){
        this.person_name=name;
        this.person_job=job;
        this.personbook=new PersonBook();
    }
    public void add(Book b)
    {
        this.personbook .add(b);
    }

}