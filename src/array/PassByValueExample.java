package array;

import java.util.Arrays;

public class PassByValueExample {
	
	public static void main(String[] args)
	{
		String s = "Hello";
		Person p = new Person("Random","Dude",Borough.NY_BOROUGHS[0]);
		int x = 5;
		int[] arr= {1,2,3};
		test3(arr);
		//changeEVERYTHING(s,x,arr);
		
		System.out.println("p is no "+p+", x is"+x+",arr is now "+Arrays.toString(arr));
		
	}
	
	/**
	 * This is how you can change arrays via the local variables:
	 * through its reference (i.e indices)
	 * because primitives don't reference other data (that's why they're called primitives)
	 * it is not possible to change them via a local variables
	 * like we did with Object and arrays
	 * @param p
	 * @param x
	 * @param arr
	 */
	
	
	private static void test1(Person p, int x, int[] arr)
	{
		String name = p.getFirstName();
		name = "Orginal";
	}
	
	
	private static void test2(Person p)
	{
		p.setFirstName("Orginal");
	}
	
	public static void test3(int[] arr)
	{
		arr[0] = 999;
		arr[1] = 998;
	}
	
	private static void changeEVERYTHING(String s, int x, int[] arr)
	{
		s = "Goodbye";
		x = -5;
		arr = new int[2];
		arr[0] = -1;
		arr[1] = -2;
	}
}
