package ex04;

public class Ex09 {
	
	public static void main(String[] args) {
		int [] array1 = { 1, 5, 7, 9, 1,2,3,4,7 };
		int [] array2 = { 3, 6, -1, 100, 77 };
		int [] array3 = ArrayUtil.concat(array1, array2);
		ArrayUtil.print(array3);	
	}
}
