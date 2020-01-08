package basic;

import java.util.Scanner;

public class Homeworkscanner31219
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
        int a,b,c,cuttoff;
        System.out.println("maths marks:");
        a=sc.nextInt();
        System.out.println("physics mark:");
        b=sc.nextInt();
        System.out.println("chemistry mark:");
        c=sc.nextInt();
        cuttoff=(a/2)+(b/4)+(c/4);
        System.out.println("cuttoff marks="+cuttoff);
        if(cuttoff<=90)
        {
        	System.out.println("can apply for arts and science");
        }
        else if(cuttoff>=91&&cuttoff<=180)
        {
        	System.out.println("can apply for engineering");
        }
        else if(cuttoff >=181&&cuttoff<=200)
        {
        	System.out.println("can apply for medicine");
        }
      
        }
	}
