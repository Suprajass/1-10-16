import java.util.*;
import java.io.*;
public class Array2{
	
	public static void main (String[] args) {
		int n;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		Forwar f=new Forwar();
		int sum=f.sumN(a,n);
		System.out.println(sum);
	}
}

