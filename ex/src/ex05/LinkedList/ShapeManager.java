package ex05.LinkedList;

import java.util.Scanner;

public class ShapeManager 
{
	Shape start;
	Shape last;
	
	public ShapeManager() {
		start = null;
		last = null;
	}
	
	
	private void insert(int type) {
		
		Shape obj=null;
		switch(type)
		{
			case 1:
				obj = new Line();
				break;
			case 2:
				obj = new Rect();
				break;
			case 3:
				obj = new Circle();
				break;
		}
		
		//1.제일 처음일 경우(=start가 null 일 경우),리스트가 비었을 경우
		//2.그렇지 않을 경우
		
		//1.
		if(start == null) {
			start = obj;
			last = obj;//나중에 또 insert할때를 위해서!
		}
		else {//2.
//			last.next = obj;//private이라서 메소드로 접근
			last.setNext(obj);
			last = obj;
		}
	}
	
	
	private boolean delete(int index) {
		
		//1.0개아무값도 없을때, 리스트가 비었을때, start가 null일 때
		//2.1개만 있을때
		//3.n개
		
		//1.0개일때
		if(start == null)
			return false; //삭제 실패
		
		//2.1개만 있을때
		if(start == last) {
			start = null;
			last = null;
			return true;
		}
		
		//3.2개이상(n개일 경우)
		//3-1.n개중에 첫번째 일 경우
		//3-2.n개중에 중간중에 하나 일 경우
		//3-3.n개중에 마지막 일 경우
		
		//먼저 현재 노드를 찾는다.
		//현재 위치를 저장할 변수를 만든다
		Shape current;//현재 위치를 저장할 변수
		current = start;
		
		Shape previous;
		previous = start;
		
		//0.삭제할 current를 찾으간다
		for(int i=0; i<index;i++) {
			previous = current;
			current = current.getNext();
			if(current == null)
				return false;
		}

		//3-1.n개중에 첫번째 일경우
		if(current == start)
			start = start.getNext();
		else if(current == last) //3-3.마지막 일 경우
		{
			last = previous;
			last.setNext(null);
		}
		else//3-2.중간일 경우
		{
			//previous.next = current.next
			previous.setNext(current.getNext());
		}
		
		
		return true;//삭제 실패시 false반환
	}
	
	
	
	private void view() {
		
		Shape current = start;
		while(current != null)
		{
			current.draw();
			current = current.getNext();
		}
		
	}
	private void finish() {
		
	}
	
	public void run() {
		System.out.println("그래픽 에디터 v1.4를 실행");
		
		Scanner sc1 = new Scanner(System.in);
		int choice=0;
		while(choice != 4)
		{
			System.out.print("입력(1), 삭제(2), 모두보기(3), 종료(4) >>");
			choice = sc1.nextInt();
					
			switch(choice) 
			{
				case 1:
					//입력(1)
					System.out.print("Line(1), Rect(2), Circle(3) >>");
					int type = sc1.nextInt();
					insert(type);
					break;
				case 2:
					//삭제(2)
					System.out.print("삭제할 도형의 위치>>");
					int index = sc1.nextInt();
//					if(delete(index) == false) {
					if(!delete(index)) {
						System.out.println("삭제할수 없습니다.");
					}
					break;
				case 3:
					//모두보기(3)
					view();
					break;
				case 4:
					//종료(4)
					//finish();
					break;
				default :
					System.out.println("잘못입력!!");
			
			}
		}
		System.out.println("종료합니다");
		
		
		
	}

}
