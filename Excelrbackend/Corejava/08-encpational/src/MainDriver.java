class Dog  
{
	private String dogName;
	private String dogBread;
	private int dogAge;

     public String getDogName()
	{
		return dogName;
	}
	public void setDohName(String dogName)
	{
		this. dogName = dogName;
	}

     public String getDogBread()
	{
		return dogBread;
	}
	public void setDogBread(String dogBread)
	{
		this. dogBread = dogBread;
	} 

     public int getDogAge()
	{
		return dogAge;
	}
	public void setDogBread(int dogAge)
	{
		this. dogAge = dogAge;
	}
}
 class MainDriver
{
	public static void main (String[] args)
	{
		Employee dog1 = new Dog("manu","dabarman",2);
		System.out.println(dog1.getdogName());
		System.out.println(dog1.getdogBread());
		System.out.println(dog1.getdogAge());
		System.out.println("----------------------------------");
		dog1.setdogName("rocky");
		dog1.setdogBread("pug");
		dog1.setdogAge(4);
		System.out.println(dog1.getdogName());
		System.out.println(dog1.getdogBread());
		System.out.println(dog1.getdogAge());
	}
}
