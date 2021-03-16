
/*类名：人
 属性：姓名，身份
行为：添加书，借书，还书，显示手上的书类
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