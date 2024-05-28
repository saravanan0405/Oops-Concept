class Book
{

  private String title;
  private String author;
  private String publisher;

    Book (String title, String author, String publisher)
  {
	this.title = title;
	this.author = author;
	this.publisher = publisher;
//System.out.println(title+" "+author+" "+publisher);
  }
  public String gettitle ()
  {
	return title;
  }
  public String getauthor ()
  {
	return author;
  }
  public String getpublisher ()
  {
	return publisher;
  }

  public void settitle (String title)
  {
	this.title = title;
  }
  public void setauthor (String author)
  {
	this.author = author;
  }
  public void setpublisher (String publisher)
  {
	this.publisher = publisher;
  }

  public static void main (String s[])
  {
	Book obj = new Book ("Ponniyin selvan ", "Kalki Krishnamurthy ","Vanathi parthippagam");
	Book obj1 = new Book ("Thillana Mohanambal ", "Kothamangalam subbu ","Alliance publication ");

	System.out.println ("publisher :" + obj.getpublisher ());
	obj1.settitle ("Kannaki Sabatham");
	obj1.setauthor ("Iiango Adigal");
	obj1.setpublisher ("Vanathi parthippagam");

	System.out.println ("Book title :" + obj1.gettitle ());
	System.out.println ("Author Nmae :" + obj1.getauthor ());
	System.out.println ("Publisher Name :" + obj1.getpublisher ());
  }

}

