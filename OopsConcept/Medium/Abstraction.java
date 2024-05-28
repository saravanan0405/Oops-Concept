abstract class Mobile
{       
         Mobile(){
         
         }
	private int ram;
	private int storage;
	private int battery;
	private String model;
	
	Mobile(int ram,int storage,int battery,String model){
	this.ram = ram;
	this.storage = storage;
	this.battery = battery;
	this.model = model;
	}
	
	abstract void run();
	
	
	public int getRam(){
	    return ram;
	 }
	
	public void setRam(int ram){
	     this.ram = ram;
	 }
	 
	 public int getStorage(){
	 	return storage;
	 }
	 
	 public void setStorage(int storage){
	 	this. storage = storage;
	 }
	 
	 public int getBattery(){
	 	return battery;
	 }
	 
	 public void setBattery(int battery)
	 {
	 	this.battery = battery;
	 }
	 
	 public String getmodel(){
	 	return model;
	 }
	 
	 public void setmodel(String model){
	 	this.model = model;
	 }
}

class Abstraction extends Mobile
{      
     	
	private double display_Size;
	private String version;
	
	Abstraction(int ram,int storage,int battery,String model,double display_Size,String version)
	{
		super(ram,storage,battery,model);
		this.display_Size = display_Size;
		this.version = version;
	}
	
	public double getdisplay_Size(){
		return display_Size;
	}
	
	public void setdisplay_Size(double display_Size)
	{
		this.display_Size = display_Size;
	}
	
	public String getversion()
	{
		return version;
	}
	
	public void setversion(String version)
	{
		this.version = version;
	}
	
	public void run()
	{
		System.out.println("Movie running sucessfully");
	}
	
	public static void main(String s[])
	{
	    Abstraction obj = new Abstraction(6,128,5100,"Redmi 12 5g",6.2,"snapdragon_4-Gen-2");
	
	       obj.run();
	       System.out.println(obj.getmodel());
	 }
} 
	 
