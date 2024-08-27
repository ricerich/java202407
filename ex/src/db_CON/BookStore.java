package db_CON;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

import java.sql.DriverManager;
import java.sql.SQLException;

public class BookStore {
	//1.db관련 멤버변수
	private Connection con;
	private Statement stmt;
	private ResultSet rs;
	
	//멤버변수 (저장용)
	//1.변수(초급)
	private int bookid;
	private String bookname;
	private String publisher;
	private int price;

	//2.배열(중급)
	private int bookidArr[];
	private String booknameArr[];
	private String publisherArr[];
	private int priceArr[];
	
	//3.객체(고급)
	private Book book;
	
	//4.객체배열(특급)
	private Book bookArr[];
	
	public Book[] getBookArr() {
		return bookArr;
	}
	
	public BookStore() {
		con = null;
		stmt = null;
		rs = null;
		
		//1.변수
		bookid=0;
		bookname="";
		publisher="";
		price=0;
		
		//2.배열
		bookidArr = new int[10];
		booknameArr = new String[10];
		publisherArr = new String[10];
		priceArr = new int[10];
		
		//3.객체
		book = new Book();
		
		//4.객체 배열
		bookArr = new Book[10];
		for(int i=0; i<bookArr.length; i++)
			bookArr[i] = new Book();
		
		
	}

	public void conn() {
		
		String url = "jdbc:oracle:thin:@localhost:1522:xe";
		String userid = "c##madang"; // c##추가
		String pwd = "c##madang"; // c##추가

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로드 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		try {
			System.out.println("데이터베이스 연결 준비 .....");
			con = DriverManager.getConnection(url, userid, pwd);
			System.out.println("데이터베이스 연결 성공");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void getBookList() { // 메소드
		String query = "SELECT * FROM book";
		try {
			stmt = con.createStatement(); // 2
			rs = stmt.executeQuery(query); // 3
			System.out.println("BOOK ID \tBOOK NAME \t\tPUBLISHER \t\t\tPRICE");
			
			int index=0;
			int index2=0;
			while (rs.next()) {
//				System.out.print("\t" + rs.getInt(1));
//				System.out.print("\t" + rs.getString(2));
//				System.out.print("\t\t\t" + rs.getString(3));
//				System.out.println("\t\t\t\t" + rs.getInt(4));
				
				//1.변수
				bookid   = rs.getInt(1);
				bookname = rs.getString(2);
				publisher= rs.getString(3);
				price    = rs.getInt(4);
				
				//printBook();//10번 호출해서 사용
				
				
				//2.배열
				bookidArr[index]   = rs.getInt(1);
				booknameArr[index] = rs.getString(2);
				publisherArr[index]= rs.getString(3);
				priceArr[index]    = rs.getInt(4);
				index++;
				
				//3.객체
				//book.bookid = rs.getInt(1);
				book.setBookid(rs.getInt(1));
				book.setBookname(rs.getString(2));
				book.setPublisher(rs.getString(3));
				book.setPrice(rs.getInt(4));
				
//				System.out.println("객체 출력입니다!");
//				printBook_Obj();//객체 출력 -> book객체 안으로 이동/이제 안됨!
				book.printBook();
				
				//4.객체 배열
				bookArr[index2].setBookid(rs.getInt(1));
				bookArr[index2].setBookname(rs.getString(2));
				bookArr[index2].setPublisher(rs.getString(3));
				bookArr[index2].setPrice(rs.getInt(4));
				index2++;
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	//1.변수 출력용 메소드
	private void printBook()
	{
		System.out.print(bookid + "\t");
		System.out.print(bookname + "\t");
		System.out.print(publisher + "\t");
		System.out.println(price);
	}
	
	//2.배열 출력용 메소드
	public void BookArr()
	{
		for(int i=0; i<bookidArr.length; i++)
		{
			System.out.print(bookidArr[i] + "\t");
			System.out.print(booknameArr[i] + "\t");
			System.out.print(publisherArr[i] + "\t");
			System.out.println(priceArr[i]);
		}
	}
	
	//3.객체 출력용 메소드 -> 객체 안으로 보낸다
//	private void printBook_Obj()
//	{
//		System.out.print(book.getBookid() + "\t");
//		System.out.print(book.getBookname() + "\t");
//		System.out.print(book.getPublisher() + "\t");
//		System.out.println(book.getPrice());
//	}
	
	//4.객체 배열 출력용 메소드
	public void printBook_ObjArr()
	{
		for(int i=0; i<bookArr.length; i++)
		{
			System.out.print(bookArr[i].getBookid() + "\t");
			System.out.print(bookArr[i].getBookname() + "\t");
			System.out.print(bookArr[i].getPublisher() + "\t");
			System.out.print(bookArr[i].getPrice() + "\t");
		}
	}
	
	public void getCustomerList() { // 메소드
		String query = "SELECT * FROM customer";
		try {
			stmt = con.createStatement(); // 2
			rs = stmt.executeQuery(query); // 3
			System.out.println(" ID \t 이름 \t\t 주소 \t\t 전화번호");
			while (rs.next()) {
				System.out.print("\t" + rs.getInt(1));
				System.out.print("\t" + rs.getString(2));
				System.out.print("\t\t\t" + rs.getString(3));
				System.out.println("\t\t\t\t" + rs.getString(4));

			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
