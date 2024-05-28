class Person
{
	private String name;
	private int age;
	private String address;
	
	Person(String name,int age,String address){
	    this.name = name;
		this.age = age;
		this.address = address;
	}
    
    public String getname(){
       return name;
     }
	 
    public void setname(String name){
        this.name = name;
     }
	
	public int getage(){
	    return age;
	}
	
	public void setage(int age){
    	 this.age = age;
	}
	
	public String getaddress(){
	    return address;
	}
	
	public void setaddress(String address){
	    this.address = address;
    }
  	
}

class Student extends Person
{
	private char grade;
	private String school;
	
	Student(String name,int age,String address,char grade,String school){
	     
		 super(name,age,address);
		 this.grade = grade;
		 this.school = school;
	}
	
	public char getgrade(){
		return grade;
	}
	
	public void setgrade(char grade){
	    this.grade = grade;
	}
	
	public String getschool(){
	    return school;
	}
	
	public void setschool(String school){
	    this.school = school;
	}
	
	public static void main(String s[]){
	  
	  Student obj = new Student("Rajesh",23,"512/4 East Street",'B',"Govt school");
	  
	  System.out.println("Name : "+obj.getname()+
	                      " Age : "+obj.getage()+
	                      " Address : "+obj.getaddress()+
	                      " Grade : "+obj.getgrade()+
	                      " School Name : "+obj.getschool());
    }
}
