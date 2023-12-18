class T
{
	int i;

	 static void test(int i) 
	{
		 i=20;
	}
		public static void main(String[] args) 
	{
		T t1 = new T();
		t1.i = 10;
		System.out.println("before calling  test(int): " + t1.i);
		//call by value / pass by value
		// changes in the desttnation,would not be reflecting to thr source 
		// we are not sending the referece instead just the value, in this case there is 
		// chance of modification to the objects.
		T.test (t1.i);
		System.out.println("after callimg test(int): " + t1.i);
	}
}