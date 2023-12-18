class  R
{
	public static void main(String[] args) 
	{
		boolean flag = true;
		if(flag = !(flag ==!(!(false == false) == (flag == true))))
		{
		   System.out.println("from if");
		}
		   System.out.println("end of main:" + flag);
	}
}

