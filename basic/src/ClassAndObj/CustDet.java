package ClassAndObj;

import java.util.Scanner;

import javax.swing.Spring;

public class CustDet {
	
	Scanner sc= new Scanner (System.in);
	
	public String name() 
	{
		String name;
		System.out.println("Enter your Name");
		name=sc.next();
	    return name;	
	}
	
	public int number(){
		int number;
		System.out.println("enter the number");
		number=sc.nextInt();
		return number;	
	}

	public void mailId() {
		String mail;
		System.out.println("enter the mail id ");
		mail=sc.next();
	}
	
	public void Address() {
		int Address;
		System.out.println("enter the address");
		Address=sc.nextInt ();
	}
	
	public void AddressProof() {
		
		System.out.println("AddressProof");
		}
}
	
	
	

	
	

