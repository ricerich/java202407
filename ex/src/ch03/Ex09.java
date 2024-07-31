package ch03;

public class Ex09 
{
	public static void main(String[] args) 
	{
		//1.2차원 배열 만들기
		//2.배열에 값넣기 (이중 for), 랜덤값으로
		//3.배열에 값꺼내서 출력(이중 for)

		//1.2차원 배열 만들기		
		int arr1[][] = new int[4][4];
		
		//2.배열에 값넣기 (이중 for)
		for(int i=0; i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				arr1[i][j] = (int)(Math.random()*10 +1);
			}
		}
		
		//3.배열에 값꺼내서 출력(이중 for)
		for(int i=0; i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}

	}

}
