package binarySearch;

public class Pokemon {

	public int level;
	private int hp;
	private String name;
	public boolean poisoned;
	
	public Pokemon(String name, int level) {
		
		hp = 100;
		poisoned = false;		
		
		
	}
	
	public static void main(String[] args) 
	{
		 Pokemon squirtle = new Pokemon("Squirtle", 26);
		 Pokemon bulbasaur = new Pokemon("Bulbasaur", 26);
		 squirtle.iChooseYou();
		 bulbasaur.iChooseYou();
	}
	
	public void iChooseYou()
	{
		System.out.print(name);
		
	}

	public int getHP()
	{
		return hp;
	}
	

	public String getName()
	{
		return name;
	}
	
	public void setHP(int newHP)
	{
		hp = newHP;
	}
	
	public void setPoisoned(boolean b)
	{
		poisoned = true;
	}
 
	
	public void lapse()
	{
		hp = hp - 15;
	}
	
	public void levelUp(Effect e)
	{
		level++;
		e.happen();
	}
	
}
