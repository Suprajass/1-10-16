public class Forward
{
	int a[],n;
	public int[] reverseN(int a[],int n)
	{
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		{
			b[i]=a[n-1-i];
		}
		return b;
	}
}
