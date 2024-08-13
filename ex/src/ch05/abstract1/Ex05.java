package ch05.abstract1;

public class Ex05 {

	public static void main(String[] args) {
//		Calculator c1 = new Calculator();//객체를 발생 시킬 수 없다.
		GoodCalc c = new GoodCalc();
		System.out.println(c.add(2, 3)); 
		System.out.println(c.subtract(2, 3)); 
	
		System.out.println(c.average(new int[]{10,20,30})); 
	}

}
