class Student
{
  private String name;
  private int age;
  private char grade;

    Student (String name, int age, char grade)
  {
	this.name = name;
	this.age = age;
	this.grade = grade;
        // System.out.println(name+" "+age+" "+grade);
  }

  public String getname ()
  {
	return name;
  }
  public int getage ()
  {
	return age;
  }
  public char getgrade ()
  {
	return grade;
  }
  public void setname (String name)
  {
	this.name = name;
  }
  public void setage (int age)
  {
	this.age = age;
  }
  public void setgrade (char grade)
  {
	this.grade = grade;
  }
  public static void main (String s[])
  {
	Student obj = new Student ("surya", 29, 'C');
	System.out.println ("Name =" + obj.getname ());
	System.out.println ("Age =" + obj.getage ());
	System.out.println ("Grade =" + obj.getgrade ());

	obj.setname ("Arun");
	obj.setage (27);
	obj.setgrade ('B');

        System.out.println();
        
	System.out.println ("Name =" + obj.getname ());
	System.out.println ("Age =" + obj.getage ());
	System.out.println ("Grade=" + obj.getgrade ());
  }

}

