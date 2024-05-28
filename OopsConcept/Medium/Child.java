class Child extends Parent
{
	private int highScore;
	private int man_Ofmatch;
	
	Child(String sport,String format,int no_OfCentury,int highScore,int man_Ofmatch)
	{       
	        super(sport,format,no_OfCentury);
		this.highScore = highScore;
		this.man_Ofmatch = man_Ofmatch;
	}
	
	public int gethighScore()
	{
	    return highScore;
	 }
	 
	 public void sethighScore(int highScore)
	 {
	      this. highScore = highScore;
	 }
	
	public int getman_Ofmatch()
	{
		return man_Ofmatch;
	}
	
	public void setman_ofmatch(int man_Ofmatch)
	{
	     this.man_Ofmatch = man_Ofmatch;
	}
	
	public static void main(String s[])
	 {      Parent obj1 = new Parent("cricket","IPL",5);
	 
	        System.out.println("format : "+obj1.getformat());
	        
		Child obj = new Child("cricket","ODI",100,200,65);

		System.out.println("High Score :"+obj.gethighScore());
		System.out.println("High Score :"+obj.getSport());
	}
}
