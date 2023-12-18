class X
{
	static int i;
	static int k =i; 
	static int j =k; 
	static int l =l; //self referens in instaltization is not possabel
      public static void main(String[] args) 
	{
		System.out.println(i);
		System.out.println(j);
	}
}
