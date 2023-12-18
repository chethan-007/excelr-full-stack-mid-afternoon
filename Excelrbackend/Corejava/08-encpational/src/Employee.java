class Employee 
{
	private int employeeId;
	private String employeeName;
	private String employeeDepartment;
	private int employeeAge;
	private double employeeSalary;

	
	public int getEmployeeId()
	{
		return employeeId;
	}
	public void setEmployeeId(int employeeId)
	{
		this employeeId = employeeId;
	}

	public String getEmployeeName()
	{
		return employeeName;
	}
	public void setEmployeeName(String employeeName)
	{
		this employeeName = employeeName;
	}

	public String getEmployeeDepartment()
	{
		return employeeDepartment;
	}
	public void setEmployeeDepartment(String employeeDepartment)
	{
		this employeeDepartment = employeeDepartment;
	}

	public int getEmployeeAge()
	{
		return employeeAge;
	}
	public void setEmployeeAge(int employeeAge)
	{
		this employeeAge = employeeAge;
	}

	public double getEmployeeSalary()
	{
		return employeeSalary;
	}
	public void setEmployeeSalary(double employeeSalary)
	{
		this employeeSalary = employeeSalary;
	}

 }
class MainDriver
{
	public static void main (String[] args)
	{
		Employee emp1 = new Employee(007,"chethan","CEO",23,7777.0);
		System.out.println(emp1.getemployeeId());
		System.out.println(emp1.getemployeeName());
		System.out.println(emp1.getemployeeDepartment());
		System.out.println(emp1.getemployeeAge());
		System.out.println(emp1.getemployeeSalary());
		System.out.println("----------------------------------");
		emp1.setEmployeeId(009);
		emp1.setEmployeeName("ubc");
		emp1.setEmployeeDepartment("groups");
		emp1.setEmployeeAge(39);
		emp1.setEmployeeAge(9999.0);
		;
		System.out.println(emp1.getemployeeNamSystem.out.println(emp1.getemployeeId())e());
		System.out.println(emp1.getemployeeDepartment());
		System.out.println(emp1.getemployeeAge());
		System.out.println(emp1.getemployeeSalary());
	}
}
