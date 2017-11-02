package caveExplorer;

public class Fountain extends CaveRoom {
	
	private int hp;

	public int hp(int hp)
	{
		this.hp = hp;
		return hp;
	}
	
	public int fullheal()
	{
		hp = 100;
		return hp;
	}
	
	
	
	public Fountain(String description) {
		super(description);
	}

	
}
