package java_training4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int size = sc.nextInt();
		int[] arr1 = new int[size];

		System.out.println("Enter the elements for array : ");
		for(int i=0;i<size;i++)
		{
			arr1[i] = sc.nextInt();
		}
		System.out.println("Before sorting: ");
		System.out.println(Arrays.toString(arr1));
		System.out.println();
		
		int current=0,j=0;
		
		for(int i=0;i<size;i++)
		{
			 current = arr1[i];
			 j = i-1;
			 while(j>=0 && arr1[j]>current)
			 {
				 arr1[j+1] = arr1[j];
				 j--;
				 
			 }
			 arr1[j+1]=current;
			 
		}
		System.out.println();
		System.out.println("After Insertion sorting: ");
		System.out.println(Arrays.toString(arr1));
		sc.close();
	}

}
