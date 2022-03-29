package java_training4;
import java.util.*;
public class ArrayOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int size = sc.nextInt();
		int[] arr1 = new int[size];
		int[] arr2 = new int[size];
		int[] sum = new int[size];
		
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
		for(int i=0;i<size;i++)
		{
			sum[i]= arr1[i]+arr2[i];
		}
		System.out.println("The sum array elements before sorting : ");
		System.out.print(Arrays.toString(sum));
		
		for(int i=0;i<size-1;i++)
		{
			int min=i;
			for(int j=i+1;j<size;j++)
			{
				
				if(sum[j]<sum[min])
				{
					min=j;
				}
			}
			int temp = sum[i];
			sum[i] = sum[min];
			sum[min] = temp;
		}
		System.out.println();
		System.out.println("After sorting sum array is : ");
		System.out.print(Arrays.toString(sum));
		
		sc.close();
	}

}
