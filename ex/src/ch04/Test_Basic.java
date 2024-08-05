package ch04;

public class Test_Basic 
{
	public static void main(String[] args) {
		//1.변수 넘길때(call by value:복사)
		//2.배열 넘길때(call by reference:참조)
		//3.객체 넘길때(call by reference:참조)
		//4.객체배열 넘길때(call by reference:참조)
		
		//1.변수 넘길때(call by value:복사)
		int a = 10;
		System.out.println(a);//10 출력
		add1(a);
		System.out.println(a);//10 출력 //복사기 때문에 add1 변수 너랑 상관없음

		//2.배열 넘길때(call by reference:참조)
		int b[] = {10 , 20, 30};
		System.out.println(b[1]);//20
		add2(b);
		System.out.println(b[1]);//21 //바뀐다
		
		//3.객체 넘길때(call by reference:참조)
		Circle c = new Circle();
		c.radius = 30;
		System.out.println(c.radius);//30
		add3(c);
		System.out.println(c.radius);//31
		
		//4.객체배열 넘길때(call by reference:참조)
		Circle d[] = new Circle[3];
		for(int i=0; i<d.length; i++) {
			d[i] = new Circle();
			d[i].radius = 10*(i+2);
		}
		
		System.out.println(d[2].radius);//40
		add4(d);
		System.out.println(d[2].radius);//41
		
		//5.객체를 넘긴다. 다만 외부 클래스로 만든
		Circle e = new Circle();
		e.radius = 70;
		
		System.out.println(e.radius);
		Calc calc1 = new Calc();
		calc1.add5(e);
		System.out.println(e.radius);		
		
	}
	
	public static void add1(int a){//1.변수(매개변수)
		a++;
	}
	
	public static void add2(int a[]){//2.배열(매개변수)
		a[1]++;
	}
	public static void add3(Circle a){//3.객체(매개변수)
		a.radius++;
	}
	public static void add4(Circle a[]){//4.객체배열(매개변수)
		a[2].radius++;
	}
	
//	public static void add5(Circle a){//3.객체(매개변수)
//		a.radius++;
//	}

}



