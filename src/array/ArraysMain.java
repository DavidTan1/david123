package array;

import java.util.Arrays;

public class ArraysMain {

	private int[] testArray;
	
	public ArraysMain() {
		testArray = new int[50];
		populate(testArray);
		
		countOccurences(testArray,2,12);
		System.out.println(Arrays.toString(testArray));
	}
	
	private void countOccurences(int[] arr, int start, int end)
	{
		int[] counter = new int[end-start+1];
		for(int value: arr) 
		{
			counter[value-start]++;
		}
		for(int i=0; i<counter.length; i++)
		{
			System.out.println("The value "+(i+start)+" was rolled "+counter[i]+" times");
		}
			
	
	}
	
	
	private void populate(int[] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = diceRoll(2);
		}

		
	}
	
	
	public void arrayNotes()
	{
		//two ways to make an array
		int[] firstWay = {0,1,2,3,4,5};
		
		String[] secondWay = new String[5];
		//secondWay[0] = 1;
		//secondWay[1] = 10;
		
		//TWO WAYS TO ITERATE THROUGH AN ARRAY
		for(int i=0; i<secondWay.length; i++)
		{
			System.out.println("The #"+i+" element is "+secondWay[i]);
		}
		//For each int in secondWay
		for(String value: secondWay)
		{
			System.out.println("Element is "+value);
		}
		//primitive arrays are automatically populated with 0s
		//object arrays are not populated 
	}
	
	
	public static void main(String[] agrs)
	{
		ArraysMain sample = new ArraysMain();
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
