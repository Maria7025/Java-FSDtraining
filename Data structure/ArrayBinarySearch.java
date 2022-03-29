package java_training4;
import java.util.Scanner;
public class ArrayBinarySearch {
	static int binarySearch(int a[],int beg,int end,int val)
	{
		int mid;
		if(end>=beg)
		{
			mid=(beg + end)/2;
			if(a[mid] == val)
			{
				return mid+1;
			}
			else if(a[mid] < val)
			{
				return binarySearch(a,mid+1,end,val);
			}
			else
			{
				return binarySearch(a,beg,mid-1,val);
			}
		}		
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements for sorted array : ");
		for(int i=0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}	
		System.out.println("Enter the element to be searched: ");
		int item = sc.nextInt();
		System.out.println();
		int result = binarySearch(arr,0,size-1,item);
		if(result == -1)
		{
			System.out.println("Element "+item+" is not present in the array");
		}
		else
		{
			System.out.println("Element "+item+" is present at "+result+" position in the array");
		}
		sc.close();	
	}

}
