
/*������ͼ���
��Ϊ������飬�����ȥ�������������ʾͼ�����������
*/

class Library
{
    LibraryBook librarybook;
    Library(){
        this.librarybook=new LibraryBook();
    }
    public void add(Book b)
    {
        this.librarybook .add(b);
    }

}