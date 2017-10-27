package caveExplorer;

import java.util.Scanner;

public class CaveExplorer {
	
	public static CaveRoom[][] caves;
	public static Scanner in; //for use input
	public static CaveRoom currentRoom; //changes as the user move
	public static Inventory inventory;
	
	public static void main(String[] args)
	{
		
	}
	
	public static void main(String[] args)
	{
		in = new Scanner(System.in);
		CaveRoom.setUpCaves();
		inventory = new Inventory();
		startExploring();
	}
	
	
	
	private static void startExploring()
	{
		while(playing)
		{
			print(inventory.getDescription());
			print(currentRoom.getDescription());
			print(currentRoom.getDirection());
			print("What will you like to do");
			
		}
	}
}

