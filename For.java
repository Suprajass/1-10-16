public class For
{
	int n,a[];
	public int[] rotateLeft(int a[],int n)
	{
		int b[]=new int[n];
		for(int i=0;i<n-1;i++)
		{
			b[i]=a[i+1];
		}
		b[n-1]=a[0];
		return b;
	}
}
