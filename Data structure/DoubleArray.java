package java_training4;
import java.util.*;
public class DoubleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of row");
		int row = sc.nextInt();
		System.out.println("Enter the size of col");
		int col = sc.nextInt();
		String[][] str1 = new String[row][col];
		System.out.println("Enter "+col+" Students details ");
		System.out.println();
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				
				str1[i][j] = sc.next();
			}
		}
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(" "+str1[i][j]+" ");
			}
			System.out.println("");
		}
		for(int i=1;i<row;i++)
		{
			
			for(int j=0;j<col;j++)
			{
				int count = i-1;
				int temp = Integer.parseInt(str1[i][j]);
				if(temp>400)
				{
					
					System.out.println(str1[count][j]+" is passed exam");
				}
				else
				{
					System.out.println(str1[count][j]+" is not passed exam");
					
				}
			}
		}
		sc.close();
	}

}
