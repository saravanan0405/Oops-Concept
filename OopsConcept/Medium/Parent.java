class Parent
{
	private String sport;
	private String format;
	private int no_OfCentury;
	
	Parent(String sport,String format,int no_OfCentury)
	{
		this.sport = sport;
		this.format = format;
		this.no_OfCentury = no_OfCentury;
	}
	
	public String getSport()
       {
       	return sport;
       }
       
       public void setSport(String sport)
       {
               this.sport = sport;
        }
        
        public String getformat()
        {
        	return format;
        }
        
        public void setformat(String format)
        {
        	this.format = format;
        }
        
        public int getno_OfCentury()
        {
        	return no_OfCentury;
        }
        
        public void setno_OfCentury()
        {
        	this.no_OfCentury = no_OfCentury;
        }
}
