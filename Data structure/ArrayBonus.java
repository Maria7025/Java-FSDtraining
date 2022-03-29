package java_training4;

import java.util.*;
public class ArrayBonus {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of students");
		int len = sc.nextInt();
		
		String[] name = new String[len];
		
		int[] sal = new int[len];
		
		int[] yr = new int[len];
		
		System.out.println("Enter the details of employees: ");
		System.out.println("++++++++++++++++++++++++++++++");
		for(int i=0;i<len;i++)
		{
			System.out.println("Enter the name of employee "+(i+1)+" : ");
			name[i] = sc.next();
			System.out.println("Enter the salary of employee "+(i+1)+" : ");
			sal[i] = sc.nextInt();
			System.out.println("Enter the year of joining of employee "+(i+1)+" : ");
			yr[i] = sc.nextInt();
			System.out.println("+++++++++++++++++++++++++++++++++");
		}
		System.out.println("The Loyaliy bonus of employees are : ");
		int[] bon =new int[len];
		for(int i=0;i<len;i++)
		{
			if(yr[i]<=2017 && sal[i]>30000)
			{
				bon[i] = (sal[i]*22)/100;
				System.out.println("Bonus of "+name[i]+" is: "+bon[i]);
			}
			else if(yr[i]<=2017 && sal[i]<30000)
			{
				bon[i] = (sal[i]*33)/100;
				System.out.println("Bonus of "+name[i]+" is: "+bon[i]);
			}
			else if(yr[i]<=2012)
			{
				bon[i] = (sal[i]*40)/100;
				System.out.println("Bonus of "+name[i]+" is: "+bon[i]);
			}
			else if(yr[i]>2017 && sal[i]<30000)
			{
				bon[i] = (sal[i]*15)/100;
				System.out.println("Bonus of "+name[i]+" is: "+bon[i]);
			}
			else if(yr[i]>2017 && sal[i]>30000)
			{
				bon[i] = (sal[i]*10)/100;
				System.out.println("Bonus of "+name[i]+" is: "+bon[i]);
			}
			else
			{
				System.out.println("No bonus is issued.");
			}
		}
		sc.close();
	}
	

}
