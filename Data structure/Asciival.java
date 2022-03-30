package java_training4;
import java.util.*;
public class AsciiVal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int len = sc.nextInt();
		char[] c = new char[len];
		System.out.println("Enter the elements to the array ");
		for(int i=0;i<len;i++)
		{
			c[i] = sc.next().charAt(0);
		}
		System.out.println("The ASCII value: ");
		for(int i=0;i<len;i++)
		{
			int asc = c[i];
			System.out.println("of "+c[i]+" is "+asc);
		}
		sc.close();
	}

}
