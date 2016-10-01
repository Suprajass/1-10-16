import java.util.*;
import java.io.*;
public class Array4{
	
	public static void main (String[] args) {
		int n;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		Forw f=new Forw();
		boolean b=f.containsPI(a,n);
		System.out.println(b);
		
	}
}

