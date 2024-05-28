class TowerOfHonai
{
	public void towerOfHonai(int num,char src,char aux,char des)
	{
		if(num == 1)
		{
			System.out.println(src+" -> "+des);
		        return;
		}
		
		towerOfHonai(num-1,src,aux,des);
		towerOfHonai(1,src,des,aux);
		towerOfHonai(num-1,des,src,aux);
	}

	public static void main(String s[])
	{
		TowerOfHonai obj = new TowerOfHonai();
			obj.towerOfHonai(4,'A','B','C');
	}
}
