package caveExplorer;

public class TwoDArrayPractice {

	public static void main(String[] args)
	{
		String[][] pic = new String[6][10];
		for(String[] row: pic)
		{
			for(int col = 0; col<row.length; col++)
			{
				row[col] = " ";
			}
		
		}
		print(pic);
	}

	private static void print(String[][] pic) {
		for(String[] row: pic)
		{
			for(String col: row)
			{
				System.out.print(col);
			}
			System.out.println("");
		}
		
		
		
		
		
		
		
		
	}
	
	
}
