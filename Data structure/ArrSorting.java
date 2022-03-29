//Selection sorting: find the minimum value in given array and it will automatically creates sorted and unsorted sub array 
package java_training4;
import java.util.*;
public class ArrSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int len = sc.nextInt();
		int[] arr = new int[len];
		System.out.println("Enter array elements: ");
		for(int i=0;i<len;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.print("Before sorting: ");
		System.out.println(Arrays.toString(arr));
		System.out.println();
		for(int i=0;i<len-1;i++)
		{
			int min=i;
			for(int j=i+1;j<len;j++)
			{
				
				if(arr[j]<arr[min])
				{
					min=j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		System.out.print("After sorting: ");
		System.out.println(Arrays.toString(arr));
		sc.close();		
	}

}
