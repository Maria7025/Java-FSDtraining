package java_training4;

import java.util.Scanner;

public class ArrayOccur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int len = sc.nextInt();
		int[] ar2 = new int[len];
		System.out.println("Enter the elements for array: "); 
		for(int i=0;i<len;i++)
		{
			ar2[i] = sc.nextInt();
		}
		System.out.println("Enter the integer to count occurence: ");
		int x = sc.nextInt();
		for(int i=0; i<len; i++)
		{
			if(x == ar2[i])
			{
				count++; 
			}
		}
		System.out.println();
		System.out.println("No.of Occurence: "+count);
		sc.close();
	}

}
