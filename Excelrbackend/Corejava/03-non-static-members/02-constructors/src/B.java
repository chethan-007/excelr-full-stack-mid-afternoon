class B 
{
	B()
	{
	} 

	public static void main(String[] args) 
	{
		B b1 = new B();
		System.out.println("done");
	}
}
//we can also create the constructor
// constructor should be within a class and out side of any method
// if you are keeping ar least one explicite constructor then , compiler will not  be 
//.kepping no-arg default constructor.
// constructors treated as a special type of methods internally, but they are not normal methodes.
//.thr is a difference b/w constructor amd methods..
//constructors are going be invocked when ever we call them..  
//constructors are going be invocked while we are creating the objest..
//           *** RULES FOR CONDTRUCTORS ***
//1. compulsary constructors name should be same as class name (case-sensitive)
//2.ther is no return type fot a constructor
//3. compulsary constructor should be concrete , or defined,implemented, it should
// be having atleast{}i,e body.

// what are all the similarities between constructors and methods
//parametter ( any nos., can be any type)
//concrete defined, implemented
//access specifier
// and also we can have any numbers of constructors and methods in class but arguments must be 
//... differents (for a group of constructors ,for a groups of ppl )