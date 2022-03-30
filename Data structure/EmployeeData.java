package java_training4;
import java.util.*;
public class EmployeeData {
	public static float EmployeeBonus(float y)
	{
		float bonus = (5*y)/100;
		return bonus+y;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Salary: ");
		int salary = sc.nextInt();
		System.out.println("Enter Year of Service: ");
		int yr = sc.nextInt();
		
		if(yr < 5)
		{
			System.out.println("Your not applicable for bonus ");
		}
		else
		{
			float Bon = EmployeeBonus(salary);
			System.out.println("Your Upgraded net bonus amount: "+Bon);
		}
		sc.close();
	}

}
