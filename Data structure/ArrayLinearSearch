package java_training4;

import java.util.Scanner;

public class ArrayLinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int size = sc.nextInt();
		int[] arr = new int[size];

		System.out.println("Enter the elements for array : ");
		for(int i=0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the element to be searched: ");
		int val = sc.nextInt();
		int count=-1;
		for(int i=0;i<size;i++)
		{
			if(val==arr[i])
			{
				System.out.println("The element "+val+" is founded at the index: "+i);
				count++;
			}
		}
		if(count<0)
		{
			System.out.println("The element "+val+" is not founded in the array");
		}
		sc.close();
	}

}
