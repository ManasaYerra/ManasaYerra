class Pattern52
{
	public static void main(String[] args) 
	{
		int rows=4;
		int columns=4;
		 char c='i';
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=columns;j++)
			{
				if(i==4 || j==1 || i==j)
				{
		System.out.print(c-- + " ");
				}
				else
				{
					System.out.print(" " + " ");
				}
			}
					System.out.println(" ");
		}
	}
}

