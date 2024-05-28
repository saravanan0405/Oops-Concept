class Animal 
{
    private String name;
    private int age;
    private String species;

    Animal(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSpecies() {
        return species;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}

class Cat extends Animal
{
	private String color;
	private int numLives;
	
	Cat(String name,int age,String species,String color,int numLives){
	   super(name,age,species);
	   this.color = color;
	   this.numLives = numLives;
	 }
	 
	public String getColor()
	{
		return color;
	}
	
	public int getnumLives()
	{
		return numLives;
	}
	
	public void setColor(String color)
	{
		this.color = color;
	}
	
	public void setnumLives(int numLives)
	{
		this.numLives = numLives;
	}
	
	
	public static void main(String args[])
	{
		Cat obj = new Cat("citty",5,"cat","marron",15);
		
		System.out.println("Name : "+obj.getName()+
			           ", Age : "+obj.getAge()+
			           ", Species : "+obj.getSpecies()+
			           ", Color : "+obj.getColor()+
			           ",  numLives : "+obj.getnumLives());
	}
}
