package java_training4;

import java.util.Scanner;

public class ArrayLarge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int len = sc.nextInt();
		int[] ary1 = new int[len];
		System.out.println("Enter the elements for array: "); 
		for(int i=0;i<len;i++)
		{
			ary1[i] = sc.nextInt();
		}
		System.out.println("The array elements are: ");
		for(int i=0;i<len;i++)
		{
			System.out.print(ary1[i]+",");
		}
		max = ary1[0];
		for(int j=0; j<len;j++)
		{
			if(max < ary1[j])
			{
				max = ary1[j];
			}
		}
		System.out.println("");
		System.out.println("Maximum value in the array is: "+max);
		sc.close();
	}

}
