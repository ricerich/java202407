package ch03;

public class Ex12 
{
	public static void main(String[] args) 
	{
		int sum=0;
		
		for(int i=0; i<args.length; i++)
		{
			try {
				int num = Integer.parseInt(args[i]);
				sum = sum + num;
			}
			catch(NumberFormatException e) {
				
			}
		}
		
		System.out.println("합계는 " + sum);
	}

}
