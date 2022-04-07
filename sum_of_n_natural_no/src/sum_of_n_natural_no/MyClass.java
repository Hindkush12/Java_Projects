package sum_of_n_natural_no;

import java.util.Scanner;

public class MyClass
{

	public static void main(String[] args) 
	{
		int n, i, sum = 0;
		System.out.println("Enter any number:");
		Scanner obj = new Scanner(System.in);
		n= obj.nextInt();
			
		for(i=1;i<=n;i++)
          sum = sum + i;
	System.out.println("sum="+sum);
	}

}
