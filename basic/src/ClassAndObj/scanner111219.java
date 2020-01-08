package ClassAndObj;

import java.util.Scanner;

public class scanner111219 {
	public static void main(String[] args) {
		int n,sum=0;
		Scanner SC=new Scanner(System.in); 
		System.out.println("enter the size of array");
		n=SC.nextInt();
		int s[]=new int[n];
		System.out.println("enter the elements in a");
		for(int i=0;i<n;i++) {
		
			s[i]=SC.nextInt();
			sum=sum+s[i];
		}
		System.out.println("sum="+sum);
		}
}
