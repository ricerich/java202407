package ch04;

public class Ex01_Basic 
{
	public static void main(String[] args) 
	{
		Circle pizza;//클래스 2.사용하기 
		//pizza라는 이름의 변수를 1.만드는데 2.클래스 사용
		//클래스를 사용해서 만들어진 변수를 객체라고 부른다. 아닌예) int a;
		//하지만 객체를 객체라고 아직 부르기에는 미흡하다. 객체 대신 객체변수라고 부름
		
		pizza = new Circle();//객체 1.만들기
		
		//객체 2.사용하기
		pizza.radius=10; //객체의 멤버변수에 값넣기
		pizza.name ="자바피자";//객체의 멤버변수
		
		double area = pizza.getArea();//객체의 메소드를 사용
		System.out.println(pizza.name + "의 면적은" + area);
		
		//복습
		Circle donut = new Circle();
		donut.radius = 2;
		donut.name = "자바도넛";
		area = donut.getArea();
		System.out.println(pizza.name + "의 면적은" + area);
		
	}

}





