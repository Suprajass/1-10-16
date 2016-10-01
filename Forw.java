public class Forw
{
	int n,a[];
	public boolean containsPI(int a[],int n)
	{
		for(int i=0;i<n-2;i++)
		{
			if(a[i]==3)
			{
				if(a[i+1]==1)
				{
					if(a[i+2]==4)
						return true;
				}
			}
			
		}
		return false;
	}
}
