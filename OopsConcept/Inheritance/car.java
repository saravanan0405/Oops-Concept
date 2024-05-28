class Vehicle
{
  String make;
  String model;
  int year;

    Vehicle (String make, String model, int year)
  {
	this.make = make;
	this.model = model;
	this.year = year;
  }

  public String getmake()
  {
	return make;
  }
  public void setmake (String make)
  {
	this.make = make;
  }
  public String getmodel()
  {
	return model;
  }
  public void setmodel (String setmodel)
  {
	this.model = model;
  }
  public int getyear ()
  {
	return year;
  }
  public void setyear (int year)
  {
	this.year = year;
  }
}

class car extends Vehicle
{
  String color;
  int numDoors;

    car (String make, String model, int year, String color, int numDoors)
  {
	super (make, model, year);
	this.color = color;
	this.numDoors = numDoors;
  }

  public String getcolor ()
  {
	return color;
  }
  public void setcolor (String color)
  {
	this.color = color;
  }

  public int getnumDoors ()
  {
	return numDoors;
  }

  public void setnumDoors (int numDoors)
  {
	this.numDoors = numDoors;
  }
  
  public static void main (String s[])
  {
	car obj = new car ("swift", "ZXI Plus DT", 2020, "Red", 6);

	  System.out.println ("car name : "+ obj.getmake()+" ,model :"+ obj.getmodel ()+" ,year :"+ obj.getyear()+" ,color :"+ obj.getcolor()+" ,numOfDoors :"+ obj.getnumDoors());
  }
}

