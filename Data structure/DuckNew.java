package javanewsample;

import java.util.Scanner;

public class DuckNew {

	static boolean Check(String n)  
	{	
		int i=0,len=n.length();
		while(i<len && n.charAt(i) =='0')
		{
			i++;
		}
		while(i<len)
		{
			if(n.charAt(i) == '0')
			{
				return true;
			}
			i++;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check: ");
		String num = sc.nextLine();
		if(Check(num))
		{
			 System.out.println("Given number is a DUCK number");
		}
		else
		{
			 System.out.println("Given number is not a DUCK number");
		}
		sc.close();
	}

}
