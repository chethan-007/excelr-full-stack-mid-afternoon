class  Q
{
	public static void main(String[] args) 
	{
		boolean flag = true;
		if(false == !(!(flag == false) == (flag == false)))
		{
		   System.out.println("from if");
		}
		   System.out.println("end of main:" + flag);
	}
}

