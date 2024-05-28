class Animal
{
	void speak()
	{
		System.out.println("The Animal says roar");
	}
}

class Dog extends Animal
{
	void speak()
	{
		System.out.println("The dog says woof");
	}
}

class Cat extends Animal
{
	void speak()
	{
		System.out.println("The cat says meow");
	}
	
	public static void main(String s[])
	{
		Animal obj = new Cat();
		  obj.speak();
	}
}
