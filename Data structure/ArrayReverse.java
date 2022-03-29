package java_training4;

import java.util.Scanner;

public class ArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub //
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int len = sc.nextInt();
		String[] ar2 = new String[len];
		String[] ar3 = new String[len];
		System.out.println("Enter the elements for array: "); 
		for(int i=0;i<len;i++)
		{
			ar2[i] = sc.next();
		}
		System.out.println("The array elements are: ");
		for(int i=0;i<len;i++)
		{
			System.out.print(ar2[i]+",");
		}
		//copying first array into second array
		for(int i=0;i<len;i++)
		{
			ar3[i] = ar2[i];
		}
		System.out.println();
		System.out.println("Reverse order is: "); //index
		for(int i=len-1;i>=0;i--)
		{
			System.out.println(ar3[i]);
		}
		sc.close();
	}
}
