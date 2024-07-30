package ch03;

public class Ex02 
{
	public static void main(String[] args) 
	{
		int  n[][] = {{1},{1,2,3},{1},{1,2,3,4},{1,2}};
		
		for(int row=0; row<n.length;row++) {
			for(int col=0; col<n[row].length; col++) {
				System.out.print(n[row][col]+"\t");
			}
			System.out.println();//한행이 끝나면 줄바꿈
		}

	}

}
