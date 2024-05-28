class Rectangle
{
  private double length;
  private double width;

    Rectangle (double length, double width)
  {
	this.length = length;
	this.width = width;
  }

  public double getArea ()
  {
	return length * width;
  }
  public double getPerimeter ()
  {
	return 2 * (length + width);
  }

  public static void main (String s[])
  {

	Rectangle rect = new Rectangle (7.5, 3.2);
	System.out.println ("Rectangle Area :" + rect.getArea ());
	System.out.println ("Rectangle perimeter :" + rect.getPerimeter ());
  }
}

