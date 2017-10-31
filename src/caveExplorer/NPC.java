package caveExplorer;

public class NPC extends CaveRoom{

	public void interpretInput(String input)
	{
		while(!isValid(input))
		{
			printValidMoves();
			
			input = CaveExplorer.in.nextLine();
		}
		int direction = validMoves().indexOf(input);
		if(direction < 4)
		{
			goToRoom(direction);
		}
		else
		{
			performAction(direction);
		}
	}
	public void performAction(int direction)
	{
		
	}
	public void printValidMoves()
	{
		System.out.println("You can only enter 'w', 'a', 's', or 'd'");
	}
	public String validMoves()
	{
		return "wasd";
	}
	public void interact() {
		// TODO Auto-generated method stub
		
	}
	public boolean isActive() {
		// TODO Auto-generated method stub
		return false;
	}
}