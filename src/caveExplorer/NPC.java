package caveExplorer;

public class NPC extends CaveRoom{

	private CaveRoom[][] floor;
	private int currentRow;
	private int currentCol;
	private NPCRoom currentRoom;
	
	private boolean active;
	private String activeDescription;
	private String inactiveDescription;
	
	public NPC()
	{
		this.floor = CaveExplorer.caves;
		this.activeDescription = "There is a person standing in the room,"+" waiting to talk you. Press 'e' to talk.";
	
		this.inactiveDescription = "The person you spoke to ealier is "+"standing here.";
		
		this.currentCol = -1;
		this.currentRow = -1;
		currentRoom = null;
		active = true;
	}
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
	public String getDescription()
	{
		return activeDescription;
		
	}
	public String getInactiveDescription()
	{
		return inactiveDescription;
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
		CaveExplorer.print("Let's interact! Type 'bye' to stop.");
		String s = CaveExplorer.in.nextLine();
		while(!s.equalsIgnoreCase("bye"))
		{
			CaveExplorer.print("Yeah... I don't do a whole lot.");
			s = CaveExplorer.in.nextLine();	
		}
		CaveExplorer.print("Later");
		active = false;
	}
	public boolean isActive() 
	{
		return active;
	}
	public String getSymbol() {
		// TODO Auto-generated method stub
		return "P";
	}
	public void setPosition(int row, int col)
	{
		if(row >=0 && row < floor.length && col >= 0 && col < floor[row].length && floor[row][col] instanceof NPCRoom)	
		{
			if(currentRoom != null)
			{
				currentRoom.leaveNPC();
			}
			
			
			currentRow = row;
			currentCol = col;
			//cast the CaveRoom to NPCRoom
			currentRoom = (NPCRoom)floor[row][col];
		}
	}
	public void autoMove() {
		if(active)
		{
			int[] move = calculateMove();
			int newRow = currentRow + move[0];
			int newCol = currentCol + move[1];
			setPosition(newRow, newCol);
		}
	}
	private int[] calculateMove() {
		int[][] possibleMoves = {{-1,0},{0,1},{1,0},{0,-1}};
		int index = 
		return null;
	}
	
}