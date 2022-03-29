package java_training4;

import java.util.Scanner;

public class ArrayTwoSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int size = sc.nextInt();
		int[] arr1 = new int[size];
		int[] arr2 = new int[size];
		int[] arr3 = new int[size];
		int count = 0;
		System.out.println("Enter the elements for array 1: ");
		for(int i=0;i<size;i++)
		{
			arr1[i] = sc.nextInt();
		}
		System.out.println("Enter the elements for array 2: ");
		for(int i=0;i<size;i++)
		{
			arr2[i] = sc.nextInt();
		}
		
		
		for(int x=0;x<size;x++)
		{
			for(int y=0;y<size;y++)
			{
				if(arr1[x]==arr2[y])
				{
					arr3[count]=arr2[y];
					count++;
				}
			}
		}
		
		
		int len = count;
		System.out.println();
		System.out.println("The resultant array before sorting  : ");
		for(int k=0;k<len;k++)
		{
			System.out.println(arr3[k]+" ");
		}
		for(int i=0;i<len-1;i++)
		{
			for(int j=0;j<len-i-1;j++)
			{
				if(arr3[j] > arr3[j+1])
				{
					int temp = arr3[j];
					arr3[j] = arr3[j+1];
					arr3[j+1] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("After sorting: ");
		for(int k=0;k<len;k++)
		{
			System.out.println(arr3[k]+" ");
		}
		sc.close();	
		
	}

}
