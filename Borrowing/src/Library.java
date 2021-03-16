
/*类名：图书馆
行为：添加书，借书出去，收书回来，显示图书馆所有书类
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