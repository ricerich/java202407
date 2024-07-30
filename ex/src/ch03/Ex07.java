package ch03;

public class Ex07 
{
	public static void main(String[] args) 
	{
		int arr1[] = new int[10];
		
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = (int)(Math.random()*10 +1);
		}
		
		int sum=0;
		System.out.print("랜덤한 정수들: ");
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		
		for(int i=0; i<arr1.length; i++) {
			sum = sum + arr1[i];
		}
		System.out.println();
		System.out.println("평균은: " + sum/arr1.length);
		

	}
}
