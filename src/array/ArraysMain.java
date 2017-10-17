package array;

import java.util.Arrays;

public class ArraysMain {

	private int[] testArray;
	private String[] suits;
	private String[] values;
	
	
	
	public ArraysMain() {
		
		//suits = new String[4];
		//suits[0] = "Diamonds";
		//suits[1] = "Clubs";
		//suits[2] = "Hearts";
		//suits[3] = "Spades";
		//values = new String[13];
		//for(int i=0; i<values.length; i++)
		//{
		//	values[i] = ""+(i+1);
			
		//}
		//values[0] = "Ace";
		//values[12] ="King";
		//values[11] ="Queen";
		//values[10] ="Jack";
		//printDeck();
		
		//warmUpMethods();
		
		
		
		//testArray = new int[5];
		//populate(testArray);
		//populate1ToN(testArray);
		
		//shuffle(testArray);
		//countOccurences(testArray,2,12);
		
		//reverseOrder(testArray);
		
		//System.out.println(Arrays.toString(testArray));
		
		//tuesdayMethods(); 
		testArray = new int[5];
		testArray[0]=1;
		testArray[1]=7;
		testArray[2]=6;
		testArray[3]=7;
		testArray[4]=8;
		//isConsecutive(testArray, 2, 4);
		
		longestConsectiveSequence(testArray);
	}
	
	private void warmUpMethods() {
		int[] orderTest = {1,2,3,4,5,6,7,8,9,10};
		reverseOrder(orderTest);
		System.out.println(Arrays.toString(orderTest));
	}
	
	private void tuesdayMethods() 
	{
		int[] orderTest = {1,2,3,4,5,6,7,8,9,10};
		cycleThrough(orderTest, 5);
		System.out.println(Arrays.toString(orderTest));
	}
	
	private void cycleThrough(int[] orderTest, int n)
	{
		for(int i=0; i<n; i++)
		{
			frontToBack(orderTest);
		}
	}

	private int longestConsectiveSequence(int[] arr)
	{
		int max=1;
		int currCount=1;
		for(int i=0; i<arr.length; i++)
		{
			while(i + currCount  <arr.length && isConsecutive(arr,i,i+currCount))
			{
				currCount++;
			}
			
			if(currCount>max)
			{
				max = currCount;
			}
			i = i + currCount - 1;
				
			currCount=1;
		}	
		
		return max;
	}
	
	private boolean isConsecutive(int[] arr, int start, int end)
	{
		for(int i=start; i<end; i++)
		{
			if(arr[i]+1 != arr[i+1])
			{
				return false;
			}
		}
		return true;
	}
	
	
	
	
	private void frontToBack(int[] arr)
	{
		int placeholder = arr[0];
		for(int i=0; i<arr.length-1; i++)
		{	
			
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=placeholder;
		
	}
	
	

	private void reverseOrder(int [] arr)
	{
		 for(int i=0; i<arr.length/2; i++)
		 {
			 int placeholder = arr[i];
			 
			 arr[i] = arr[arr.length-1-i];
			 arr[arr.length-i-1] = placeholder;
			 
			 //swap(arr,i,arr.length-1-i);
		 }
	
	}
	
	private int[] subArray(int[] arr,int psn,int length)
	{
		int[] sub = new int[length];
		for(int i=0; i<length; i++)
		{
			sub[i]=arr[i+psn];
		}
		return sub;
	}
	
	
	private void printDeck()
	{
		for(String suit: suits)
		{
			for(String values: values)
			{
				System.out.println(values + " of "+suit);
			}
		}
		
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
	
	
	private void shuffle(int[] arr) {
		for(int i= 0; i<arr.length; i++) 
		{
			swap(arr,i,(int)(Math.random()*arr.length));
		}
	
	}
	
	private void swap(int[] arr, int i, int j)
	{
		int placeholder = arr[i];
		arr[i] = arr[j];
		arr[j] = placeholder;
	}
	
	private void populate1ToN(int[] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=(i+1);
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
