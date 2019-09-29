
public class MyCustomer 
{
	
	private int age;
	private String name;
	private String city;
	
	public int getAge() 
	{
		return age;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String getCity() 
	{
		return city;
	}
	
	public void setCity(String city) 
	{
		this.city = city;
	}

	@Override
	public String toString() 
	{
		return "MyCustomer [age=" + age + ", name=" + name + ", city=" + city + "]";
	}
	
	
	
	
}
