package db_CON;

public class Basic 
{
	public static void main(String args[]) 
	{ // 메소드이면서 프로그램실행에 관여함
//		BookList so = new BookList();
//		so.sqlRun();
		
		//1.개별객체
//		new BookStore().getDB_BookList();
//		new BookStore().getDB_CustomerList();
		
		//2.1개 객체
		BookStore bs1 = new BookStore();
		
		bs1.conn();
		bs1.getBookList();
		
		bs1.conn();
		bs1.getCustomerList();
		
		bs1.conn();
		bs1.getBookList();
	}
}
