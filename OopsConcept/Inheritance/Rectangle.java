class Shape
{
	private int numsides;
	double area;
	
	
	Shape(int numsides){
	      this.numsides = numsides;
	      
	   }
	
	public int getnumsides(){
	   return numsides;
	}
	
	public void setnumsides(){
	   this.numsides=numsides;
	}
	
}

class Rectangle extends Shape
{
	
       private double length;
       private double width;

	
	Rectangle(int numsides,double length,double width){    
         super(numsides);
         this.length = length;
         this.width = width;
        }
        
        public  double getlength(){
             return length;
        }
        
        public void setlength(double length){
             this.length = length;
        }
        
        public  double getwidth(){
             return width;
        }
        
        public void setwidth(double width){
             this.width = width;
        }
        
        public double getarea(){   
	    return length * width;
	}
	
	public void setarea(){
	       this.area = area;
	}
	
      public static void main(String args[]){
           Rectangle rect = new Rectangle(4,2,4);
           
           System.out.println("side : "+ rect.getnumsides()+" area : "+ rect.getarea()+" length : "+rect.getlength()+" width : "+rect.getwidth());
           
           rect.setlength(8);
           rect.setwidth(12);
           System.out.println("length :"+rect.getlength()+" width : "+rect.getwidth());
           System.out.println("area : "+rect.getarea());
        }
  }
          	
	
                   
