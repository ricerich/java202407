package ex04;

public class ArrayUtil {
	
	
	public static void print(int arr[])
	{
		System.out.print("[");
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("]");
	}

	public static int[] concat(int[] array1, int[] array2) 
	{
		int array3[] = new int[array1.length+array2.length];
		
		for(int i=0; i<array1.length;i++) {
			array3[i] = array1[i];
		}
		
		for(int i=0; i<array2.length;i++) {
			array3[array1.length+i] = array2[i];
		}
		
		return array3;
	}

}
