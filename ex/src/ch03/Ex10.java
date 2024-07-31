package ch03;

public class Ex10 
{
	public static void main(String[] args) 
	{
		//1.2차원 배열을 만든다
		//2.배열에 값을 랜덤하게(이주 for), 
		//  랜덤한 위치에 넣는데, 
		//  10개만- 문제:랜덤한 위치가 중복->16개를 0으로
		//3.배열에 값을 꺼내서 출력
		
		//1.2차원 배열 만들기		
		int arr1[][] = new int[4][4];
		
		//2.배열값을 전부 0으로
		for(int i=0; i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				arr1[i][j] = 0;
			}
		}
		
		//2.배열에 값을 랜덤하게 10개만 넣기 
		for(int i=0; i<10;i++) {
			int row = (int)(Math.random()*4);
			int col = (int)(Math.random()*4);
			
			if(arr1[row][col] != 0){
				i--;
				continue;
			}
			
			arr1[row][col] = (int)(Math.random()*10 +1);
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





