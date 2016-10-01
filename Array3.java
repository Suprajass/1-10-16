import java.io.*;
import java.util.*;
public class Array3 {
	
	public static void main (String[] args) {
		int n;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		Forwa f=new Forwa();
		int b[]=f.makeLast(a,n);
		for(int i=0;i<(2*n);i++)
		{
				System.out.println(b[i]);
		}
		
		
	}
}

