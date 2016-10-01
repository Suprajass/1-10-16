import java.util.*;
import java.io.*;
public class Array6{
	
	public static void main (String[] args) {
		int n,x;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
	    x=in.nextInt();
		Fo f=new Fo();
		boolean b=f.isEveryWhere(a,n,x);
		System.out.println(b);
	}
}

