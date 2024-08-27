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
//		bs1.BookArr();//배열출력
		
		//4.객체 배열 출력 메소드 호출(사용)
//		bs1.BookArr.printBook_o;
		int size = bs1.getBookArr().length;
		for(int i=0; i<size ; i++)
		{
//			System.out.print(bs1.getBookArr()[i].getBookid() +"\t");
//			System.out.print(bs1.getBookArr()[i].getBookname()+"\t");
//			System.out.print(bs1.getBookArr()[i].getPublisher()+"\t");
//			System.out.println(bs1.getBookArr()[i].getPrice());
			
			bs1.getBookArr()[i].printBook();
		}
		
		Book bookArr1[] = bs1.getBookArr();
		for(int i=0; i<size ; i++)
		{
//			System.out.print(bookArr1[i].getBookid() +"\t");
//			System.out.print(bookArr1[i].getBookname() +"\t");
//			System.out.print(bookArr1[i].getPublisher() +"\t");
//			System.out.println(bookArr1[i].getPrice());
			
			bookArr1[i].printBook();
		}
		
//		bs1.conn();
//		bs1.getCustomerList();
//		
//		bs1.conn();
//		bs1.getBookList();
	}
}
