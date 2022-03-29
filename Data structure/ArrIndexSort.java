package java_training4;
import java.util.*;
public class ArrIndexSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int len = sc.nextInt();
		int[] wt = new int[len];
		System.out.println("Enter array elements: ");
		for(int i=0;i<len;i++)
		{
			wt[i] = sc.nextInt();
		}
		System.out.println("Before sorting: "+Arrays.toString(wt));
		
		Arrays.sort(wt, 1,5);
		System.out.println("After sorting: " +Arrays.toString(wt));
		sc.close();
	}

}
