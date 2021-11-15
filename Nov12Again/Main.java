import java.util.*;

public class Main
{
	static int recursiveSum(int arr[])
	{
		return arr.length==0?0:( arr.length==1?arr[0]:arr[0]+recursiveSum(Arrays.copyOfRange(arr,1,arr.length)));
		
		
	}
	static String recursivePrint(String s)
	{

		return s.length()==0?s:recursivePrint(s.substring(1,s.length()))+s.charAt(0);
		

	}
	public static void main(String[] args)
	{
		int arr[]=new int[]{1,2,3,4,5};
    // sum of all elements of an array
		System.out.println( recursiveSum(arr));
    // reverse a string
		System.out.println(	recursivePrint("Hi"));
	}
	}
