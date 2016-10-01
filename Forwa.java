public class Forwa
{
	int n,a[];
	public int[] makeLast(int a[],int n)
	{
		int b[]=new int[2*n];
		b[2*n-1]=a[n-1];
		return b;
	}
}
