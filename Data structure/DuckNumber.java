
   
package javanewsample;

import java.util.Scanner;

public class DuckNumber { //

	static boolean CheckNumber(int n)  
	{
		while(n!=0) 
		{
			if(n%10==0)
			{
				return true;
			}
			n = n/10;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check: ");
		int num = sc.nextInt();
		 if(CheckNumber(num))
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
