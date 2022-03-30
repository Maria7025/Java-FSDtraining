package javanewsample;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;


public class DequeueSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> dq = new ArrayDeque<>();
		dq.add("Sun");
		dq.add("Moon");
		dq.add("Stars");
		
		Iterator<String> itr =  dq.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
