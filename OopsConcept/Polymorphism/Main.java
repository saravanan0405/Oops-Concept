interface Playable
{
	void play();
}

class Guitar implements Playable
{
	public void play()
	{
		System.out.println("Vaaranam Aayiram surya play guitar for megana");
	}
}

class Piano implements Playable
{
	public void play()
	{
		System.out.println("good vibes");
	}
}

class Main
{
	public static void main(String s[])
	{
		Piano music = new Piano();
		music.play();
		
		Guitar gits = new Guitar();
		gits.play();
		
	}
}
