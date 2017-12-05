package LionsPuzzle;

public class Hanoi {
	
	public void main(String[] args)
	{
		String[] = {}
	}
	
	public String solve(int disk, String start, String middle, String end)
	{
		if(disk == 1)
		{
			System.out.println(start+"to"+end);
		}
		else
		{
			return solve(disk-1,start, end, middle);
			System.out.print(start+"to"+end);
			return solve(disk-1,middle,start,end);
		}
	
	}
	
	
}
