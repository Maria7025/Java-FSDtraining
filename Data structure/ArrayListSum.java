package java_training4;
import java.util.*;
public class ArrayListSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> exm = new ArrayList<Integer>();
		exm.add(10);
		exm.add(23);
		exm.add(37);
		exm.add(48);
		exm.add(50);
		System.out.println(exm);
		int sum=0;
		
		for(int i=0;i<exm.size();i++)  
        {  
			sum=sum+exm.get(i);
        }  
		float avg = (float) sum/exm.size();
		System.out.println();
		System.out.println("The sum of all elements in ArrayList is: "+sum);
		System.out.println("The average of all elements in ArrayList is: "+avg);
		
	}

}
