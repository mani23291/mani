package basic;

import java.util.Scanner;

public class laksh {
	public static void main(String args[])
	{
		Scanner bc=new Scanner(System.in);
		int a;
		 System.out.println("enter the age");
		   a=bc.nextInt();
		 if(a>20)
		{
			System.out.println("eligible driving");
		}
		else
		{
			System.out.println("not eligible");
		}
	}

}
