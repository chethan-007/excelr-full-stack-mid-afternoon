class G
{
	public static void main(String[] args) 
	{
		int i=0;
		do
		{
          System.out.println("loop1 begin:" + i);
	      int j = 0;
		    do
			{
			  System.out.println("loop2 begin:" + j);
			  j++;
			  System.out.println("loop2 begin:" + j);
			}
			while (j < 2);
			i++;
			System.out.println("loop1 begin:" + i);
		}
		while (i < 3 );
		}
}

	