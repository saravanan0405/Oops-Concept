class Shape
{
     public void draw(){
	   System.out.println("Drawing a shape");
	  }
}
class Rectangle extends Shape
{
	public void draw(){
	   System.out.println("Drawing a rectangle");
	 }
}
class Circle extends Shape
{
	public void draw(){
		System.out.println("Drawing a Circle");
	}
	
	public static void main(String s[]){
		 
		 Circle obj = new Circle();
			obj.draw();
		
	}
}
