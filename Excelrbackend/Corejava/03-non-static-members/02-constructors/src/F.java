class F
{
	int i;
	F()
	{
		System.out.println("F()");
		i=10;
	} 

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		F f1 = new F();
		System.out.println(f1.i);
		System.out.println("done");
	}
	}