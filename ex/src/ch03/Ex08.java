package ch03;

import java.util.Scanner;

public class Ex08 
{
	public static void main(String[] args) 
	{
		//1.배열의 크기를 입력받는다(1~99)
		//2.만들기:배열 만든다. 입력받은 크기(size)로
		//3.사용하기:만들어진 배열에 값을 넣는다.랜덤하게
		//4.사용하기:배열안에 있는 값을 꺼내서 출력한다.
		
		//1.배열의 크기를 입력받는다(1~99)
		Scanner sc1 = new Scanner(System.in);
		System.out.print("정수 몇 개?(1~99)>>>");
		int size = sc1.nextInt();
		
		if(size<=0 || size >100){
			System.out.println("1~99 사이의 값을 입력해주세요");
			sc1.close();
			return;
		}
		
		//2.만들기:배열 만든다. 입력받은 크기(size)로
		int arr1[] = new int[size];
		
		//3.사용하기:만들어진 배열에 값을 넣는다.랜덤하게
		for(int i=0; i<arr1.length; i++) {
			int rand = (int)(Math.random()*100 +1);
			//중복체크 배열에 랜덤값을 넣기 전에 중복체크
			for(int j=0; j<i; j++) {
				if(rand == arr1[j]){//같은 값이 있으면 다시
					i--;//앞으로 1칸 되돌리기
					break;//비교 중지, 같은값나왔으니까
				}
				//일단 그냥 넣기
				arr1[i] = rand;
			}
		}
		
		//4.사용하기:배열안에 있는 값을 꺼내서 출력한다.
		for(int i=0; i<arr1.length; i++) {
			
			if(i==0)
				System.out.print(arr1[i] + " ");
			else {
				if(i%10 == 0)
					System.out.println();
				
				System.out.print(arr1[i] + " ");
			}
		}
		

	}

}





