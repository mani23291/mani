package ClassAndObj;

public class poly101219 extends overwriting1012192
{
public int weight(int a) 
{
	System.out.println(a);
	return a;
}

public static void main(String[] args) {
	poly101219 sc=new poly101219();
	sc.name();
    sc.add(10,20);
    sc.add();
    sc.mult(11, 15);
    sc.age(40);
    sc.weight(60);
}

}