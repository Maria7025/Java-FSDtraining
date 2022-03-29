package java_training4;

import java.util.*;

public class ArraySortDesc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Double> elm = new ArrayList<Double>();
		elm.add(35.456789);
		elm.add(95.12);
		elm.add(786.148);
		elm.add(1.45799);
		elm.add(0.78962);
		System.out.println(elm);
		System.out.println();
		System.out.println("After sorting in descending order");
		Collections.sort(elm, Collections.reverseOrder());
		System.out.println(elm);
		
	}

}
