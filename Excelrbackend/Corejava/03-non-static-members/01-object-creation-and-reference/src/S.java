class S
{
	int i;

	 static void test(S obj) 
	{
		 obj.i=20;
	}
		public static void main(String[] args) 
	{
		S s1 = new S();
		s1.i = 10;
		System.out.println("after calling  test(S): " + s1.i);
		// call  by reference or pass by reference 
		// changes in the destination would reflect to the source
		// its like we are sendind the key to the object itself by suppleing the reference
		//if you are sending a reference ther would be a 100% chance to modify the objects data members
		s1.test (s1);
		System.out.println("after callimg test(S): " + s1.i);
	}
}