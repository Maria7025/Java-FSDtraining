package java_training4;

import java.util.ArrayList;

public class ArrayListName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> Fname = new ArrayList<String>();	
		ArrayList<String> Lname = new ArrayList<String>();
		ArrayList<String> Wname = new ArrayList<String>();
		Fname.add("Riyad");
		Fname.add("Raheem");
		Fname.add("Phil");
		Lname.add("Mahrez");
		Lname.add("Sterling");
		Lname.add("Foden");
		for(int i=0;i<Fname.size();i++)
		{
			Wname.add(Fname.get(i)+" "+Lname.get(i));
		}
		System.out.println("Full names are:");
		System.out.println();
		for(String i:Wname)
		{
			System.out.println(i);
		}
		
	}

}
