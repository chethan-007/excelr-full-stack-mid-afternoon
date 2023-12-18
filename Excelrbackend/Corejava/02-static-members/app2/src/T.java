class S
{
	static 
	{
		System.out.println("SIB1-S");
	}
      public static void main(String[] args) 
	{
		System.out.println("S-main");
	}
}
class T
{
	static 
	{
		System.out.println("SIB-T");
	}
      public static void main(String[] args) 
	{
		System.out.println("T-main-begin");
	    s.main(null);
		s.main(args);
		System.out.println("T-main-end");
	}
}