package factorial_of_a_number;

import java.util.Scanner;

public class Myclass 
{

	public static void main(String[] args) 
	{
		int n; 
		double fact=1;
		System.out.println("Enter any number ");
		Scanner obj = new Scanner(System.in);
		n= obj.nextInt();
		for(int i=1;i<=n;i++)
			fact=fact*i;
		System.out.println("Factorial of "+n+ "are "+fact);

	}

}
