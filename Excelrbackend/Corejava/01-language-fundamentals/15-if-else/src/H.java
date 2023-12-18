class  H
{
	public static void main(String[] args) 
	{
		if(true)
		{
		System.out.println("if");
		if(true)
		{
         System.out.println("inner if");
		}
		{
         System.out.println("inner-inner if");
		}
		System.out.println("inner-inner-inner if")
		}
		}
	}
}
System.out.println("main end");
