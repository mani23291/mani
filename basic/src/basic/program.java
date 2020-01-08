package basic;

public class program {
 public static void main(String[] args)
 {
	 int n=1,sum=0;
	 while(n<=10)
	 {
    if(n%2==0)
    {
    sum=sum+n;
    }
    n++;
	 }
    System.out.println("even sum:"+sum);
	 }
}
