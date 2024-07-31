package ch03;

public class Ex13 
{
	public static void main(String[] args) 
	{
		String str1[] = { "박수짝", "박수짝짝" };
		
		for(int num=0; num<100; num++)
		{
			int ten = num / 10;
			int one = num % 10;
			
			int count=0;		
			
			if( ten==3 || ten==6 || ten==9 )
				count++;
			
			if( one==3 || one==6 || one==9 )
				count++;
			
			String res="";
			
			switch(count)
			{
				case 0:
					continue;
				case 1:
					res = num + str1[0];
					break;
				case 2:
					res = num + str1[1];
					break;
			}
			
			System.out.println(res);
			
//			if(count == 0)
//				continue;
//			else if(count == 1)
//				res = num + str1[0];			
//			else if(count == 2)
//				res = num + str1[1];
			
		}

	}
}




