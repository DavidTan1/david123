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
	public void setDirections() 
	{
		
	}
	
	
	/**
	 * converts an integer to a direction:
	 * 	0->"North"
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
