class  A
{
	A()
	{
		System.out.println("A()");
	}
	// instance initialixtion block - IIB
	// if ther  is a common implementstion for all the objects then we can keep that inside 
	//..the IIB block
	// all the IIB blocks get executed from top to bottom for onr object
	//.. creaction
	{
		System.out.println("IIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		A a1 = new A();
		System.out.println("--------");
		A a2 = new A();
		System.out.println("main end");
	}
}
