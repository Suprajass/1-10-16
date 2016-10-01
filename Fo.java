public class Fo
{
	int n,x,a[];
	public boolean isEveryWhere(int a[],int n,int x)
	{
		for(int i=0;i<n-1;i++)
		{
			if(a[i]!=x&&a[i+1]!=x)
			{
				return false;
			}
		}
		return true;
	}
}
