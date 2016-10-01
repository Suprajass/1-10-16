import java.io.*;
import java.util.*;
public class Array1{
	
	public static void main (String[] args) {
		int n;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		Forward f=new Forward();
		int b[]=f.reverseN(a,n);
		for(int i=0;i<n;i++)
		{
				System.out.println(b[i]);
		}
		
	}
}

