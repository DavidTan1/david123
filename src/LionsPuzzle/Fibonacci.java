package LionsPuzzle;

public class Fibonacci {

	public int solvef(int f, int s)
	{
		if(s == 0)
		{
			return s + solvef(f, s + f);
		}
		else
		{
			return s + solvef(f, s + f);
		}
	}
	
}
