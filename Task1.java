class Employee
{
	private String userName;
	private String password;
	private int id;
	
	public String getUserName()
	{
		return userName;
	}
	public void setUserName(String user)
	{
		userName=user;
	}
	public void setPassword(String pswd)
	{
		password=pswd;
	}
	public int getId()
	{
		return id;
	}
}

class Task1
{
	public static void main(String... args)
	{
		Employee e=new Employee();
		e.setUserName("Saranya123");
		System.out.println("userName : "+e.getUserName()+"\nid :"+e.getId());
	}
}
