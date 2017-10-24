package caveExplorer;

public class CaveRoom {
	private String description;
	private String directions;//tells you which doors can be used
	private String contents;//a symbol showing you what is in the room.
	private String defaultContent;//what is in the room when you aren't in the room 
	
	private CaveRoom[] borderingRooms;
	private Door[] doors;
	private String defaultContents;
	
	//constants
	public static final int NORTH = 0;
	public static final int EAST = 1;
	public static final int SOUTH = 2;
	public static final int WEST = 3;
	
	public CaveRoom(String description)
	{
		this.description = description;
		setDefaultContents(" ");
		contents = defaultContents;
		borderingRooms = new CaveRoom[4];
		doors = new Door[4];
		setDirections();
	}
	
	/**
	 * for every Door in doors[] that is not null
	 * this method appends a String to "directions"
	 * 
	 * hint: to check if a door is null use doors[0]==null OR USE doors[0] != null
	 */
	
	public void enter()
	{
		contents = "X";
	}
	
	public void leave()
	{
		contents = defaultContents;
	}
	
	/**
	 * This is how we join rooms together
	 * It gives this room access to anotherRoom and vice-versa
	 * It also puts the door between both room
	 * @param direction
	 * @param anotherRoom
	 * @param door
	 */
	public void setConnection(int direction, CaveRoom anotherRoom, Door door)
	{
		addRoom(direction, anotherRoom, door);
		anotherRoom.addRoom(oppositeDirection(direction),this,door);
	}
	public void addRoom(int dir, CaveRoom caveRoom, Door door) 
	{
		borderingRooms[dir] = caveRoom;
		doors[dir] = door;
		setDirections();
		
	}
	public void interpretInput(String input)
	{
		while(!isValid(input))
		{
			System.out.println("You can only enter 'w', 'a', 's', or 'd'");
			input = CaveExplorer.in.nextLine();
		}
		int direction = "wdsa".indexOf(input);
		goToRoom(direction);
	}
	private boolean isValid(String input)
	{
		return "wasd".indexOf(input) > -1 && input.length() == 1;
	}
	
	public static void setUpCaves()
	{
		//This is where you edit your caves!!!
	}
	
	public void goToRoom(int direction)
	{
		if(borderingRooms[direction] != null && doors[direction] != null && doors[direction].isOpen())
		{
			CaveExplorer.currentRoom.leave();
			CaveExplorer.currentRoom = borderingRooms[direction];
			CaveExplorer.currentRoom.enter();
			CaveExplorer.inventory.updateMap();
		}
		else
		{
			//print red text.
			System.err.println("Youc can't do that!");
		}
	}

	/**
	 * oD(0) = 2
	 * oD(1) = 3
	 * @param dir
	 * @return
	 */
	public static int oppositeDirection(int dir)
	{
		int arr[]= {2,3,0,1};
		return arr[dir];
	}
	
	public void setDirections() 
	{
		directions = "";
		boolean doorFound = false;
		
		for(int i=0; i<doors.length; i++)
		{
			if(doors[i]!=null)
			{
				directions = "There is a" +doors[i].getDescription()+"to the "+toDirection(i)+". "+doors[i].getDetails();
			}
			
			if(!doorFound)
			{
				directions = "There is no way out. You are trap!";
			}
		}	
	}
	/**
	 * converts an integer to a direction:
	 * 	0->"the North"
	 * @param dir
	 * @return
	 */
	public static String toDirection(int dir)
	{
		String direction[] = {"the North", "the East", "the South", "the West"}; 
		 return direction[dir];
		
	}
	public void setDefaultContents(String defaultContents)
	{
		this.defaultContents = defaultContents;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDirections() {
		return directions;
	}
	public void setDirections(String directions) {
		this.directions = directions;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public void setDefaultContent(String defaultContent) {
		this.defaultContent = defaultContent;
	}
}
