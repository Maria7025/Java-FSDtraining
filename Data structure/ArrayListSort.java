package java_training4;

import java.util.*;


public class ArrayListSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Tez");
		list1.add("Maddy");
		list1.add("Poppy");
		list1.add("Ali");
		list1.add("Cydney");
		System.out.println(list1);
		System.out.println();
		Collections.sort(list1, Collections.reverseOrder());
		System.out.println("After Sorting in Descending Order: ");
		System.out.println(list1);
		System.out.println();
		Collections.sort(list1);
		System.out.println("After Sorting in Ascending Order: ");
		System.out.println(list1);
	}

}
