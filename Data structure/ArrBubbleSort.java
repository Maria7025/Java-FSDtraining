//Bubble sorting : so many passes: and checking  adjacent elements and swapping
package java_training4;

import java.util.*;


public class ArrBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int len = sc.nextInt();
		int[] ar = new int[len];
		System.out.println("Enter array elements: ");
		for(int i=0;i<len;i++)
		{
			ar[i] = sc.nextInt();
		}
		System.out.print("Before sorting: ");
		System.out.println(Arrays.toString(ar));
		System.out.println();
		for(int i=0;i<len-1;i++)
		{
			for(int j=0;j<len-i-1;j++)
			{
				if(ar[j] > ar[j+1])
				{
					int temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
				}
			}
		}
		System.out.print("After sorting: ");
		System.out.println(Arrays.toString(ar));
		sc.close();	
	}

}
