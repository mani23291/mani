package basic;


import java.util.Scanner;

public class scanner61219 {
 public static void main(String[] args) {
	   int cutoff;
         String n;
		 Scanner bc=new Scanner(System.in);
		 System.out.println("enter the option");
	 n= bc.next();
		  switch(n) {
		  
		  case "A":
			  int a,b,c;
			  System.out.println("DEEMED UNIVERSITYS");
			  System.out.print("10th mark");
		   a=bc.nextInt();
		   System.out.print("12 mark");
		   b=bc.nextInt();
		   System.out.print("polytechnic mark");
		   c=bc.nextInt();
		   cutoff=(a/4)+(b/4)+(c/2);
		   System.out.println("cutoff percentage"+cutoff);
		   if(cutoff>=60 && cutoff<=120)
		   {
		      System.out.println("can apply for polytechnic");
		   } 
		   else if(cutoff>=121&&cutoff<=160) {
		    	  System.out.println("can apply for SRM");
		      }
		   else if(cutoff>=161&&cutoff<=200) {
			   System.out.println("can apply for VELS");
		   }
					
		   break;
		   
		  case "B":
			  int p,q,r;
			  System.out.println("welcome to the COBMPUTER group");
			  System.out.print("maths mark");
		   p=bc.nextInt();
		   System.out.print("cumputer mark");
		   q=bc.nextInt();
		   System.out.print("bio mark");
		   r=bc.nextInt();
		   cutoff=(p/4)+(q/4)+(r/2);
		   System.out.println("cutoff percentage"+cutoff);
		   if(cutoff>=60 && cutoff<=120)
		   {
			   System.out.println("can apply for ARTS");
		   }
		   else if(cutoff>=121&&cutoff<=160) {
		    	  System.out.println("can apply for engg");
		      }
		   else if(cutoff>=161&&cutoff<=200) {
			   System.out.println("can apply for MBBS SPECALIST");
		   }
					
		   break;
		   
		  
		   
		   
		   
		  }
 }
}
			   