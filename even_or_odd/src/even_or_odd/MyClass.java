package even_or_odd;

import java.util.Scanner;

public class MyClass 
{

	public static void main(String[] args)
	{
		// Variable declaration
		int input ;
		Scanner obj = new Scanner(System.in);
		
		// Read value from user
		System.out.println("Enter any number:");
		input = obj.nextInt();
		String result;
		// Logic
		
		if(input%2==0)
			result="Even Number";
		else
			result= "odd number";
		
		System.out.println(result);

	}

}
