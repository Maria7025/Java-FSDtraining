package java_training4;


import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class ArrayThreeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int size = sc.nextInt();
		int[] arr1 = new int[size];
		int[] arr2 = new int[size];
		
		
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
		
		TreeSet<Integer> set = new TreeSet<>();
		for(int x:arr1)
		{
			set.add(x);
		}
		for(int y:arr2)
		{
			set.add(y);
		}
		int len = set.size();
		Integer[] res = new Integer[len];
		res = set.toArray(res);
		
		System.out.println();
		System.out.println("The resultant array before sorting  : ");
		System.out.println(Arrays.toString(res));
		for(int i=0;i<len-1;i++)
		{
			for(int j=0;j<len-i-1;j++)
			{
				if(res[j] < res[j+1])
				{
					int temp = res[j];
					res[j] = res[j+1];
					res[j+1] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("After sorting: ");
		System.out.println(Arrays.toString(res));
		sc.close();	
	}

}
