class P
{
	P()
	{
      System.out.println("P()");
	}
	P(int i)
	{
		// we can use this() statement inside a conetructor
		// we can use this() statement inside a method
		// this () calling statment used to call the current class constructor , if it is used
		//... within a constructor
		this();// this is a key world.. in java
		System.out.println("P(int)");
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		P p1 = new P();
		System.out.println("-------------");
		P p2= new P(10);
		System.out.println("-------------");
		System.out.println("main end");
	}
}
