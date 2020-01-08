package ClassAndObj;

public class overwriting1012192 extends polymorphism101219{
public void name() {
	System.out.println("mahendran");
}
	public void mult(double a,double b)
	{
		   System.out.println(a*b);
	   }
	public void age(int c)
	{
		   System.out.println(c);
	   }
	

public static void main(String[] args) {
	overwriting1012192 sc=new overwriting1012192();
	sc.name();
    sc.add(10,20);
    sc.add();
    sc.mult(11, 15);
    sc.age(40);
}
}

 