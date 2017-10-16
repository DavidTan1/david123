package array;

public class ArraysMain {

	public ArraysMain() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] agrs)
	{
		
	}

	
	public int diceRoll(int n)
	{
		int sum = 0;
		for(int i = 0; i<n; i++)
		{
			int dieRoll = (int) (Math.random()*6)+1;
			sum = sum + dieRoll;
		}
		return sum;
	}
	
}
