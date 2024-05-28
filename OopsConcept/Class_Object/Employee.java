class Employee
{

  private String name;
  private int salary;
  private String hireDate;

    Employee (String name, int salary, String hireDate)
  {
	this.name = name;
	this.salary = salary;
	this.hireDate = hireDate;
	System.out.println (name + " " + salary + " " + hireDate);
  }

  public String getname ()
  {
	return name;
  }
  public int getsalary ()
  {
	return salary;
  }
  public String gethireDate ()
  {
	return hireDate;
  }

  public void setname (String name)
  {
	this.name = name;
  }

  public void setsalary (int salary)
  {
	this.salary = salary;
  }
  public void sethireDte (String hireDate)
  {
	this.hireDate = hireDate;
  }

  public static void main (String s[])
  {
	Employee employee1 = new Employee ("vicky", 14000, "20/03/2022");
	Employee employee2 = new Employee ("Ram", 17000, "07/08/2020");
	Employee employee3 = new Employee ("vicky", 10000, "01/06/2023");

	System.out.println ("HireDate :" + employee2.gethireDate ());

	employee3.setsalary (12000);
	System.out.println ("Name : "+employee3.getname()+" "+" Salary :" + employee3.getsalary ());


  }
}

