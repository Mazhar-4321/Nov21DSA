public class Main  
{
   static int factorial(int n)
	{
		if(n==0)
			return 1;
		return n*factorial(n-1);
	}
	static int firstOccurance(String s,char c)
	{
		if(s.charAt(0)==c)
		{
			return 0;
		}
		else
		{
			return 1+firstOccurance(s.substring(1),c);
		}
	}
     static int lastOccurance(String s,char c)
    {
        if(s.charAt(0)==c&&s.length()==1)
        {
            return  0;
        }
        if(s.length()>=2&&s.charAt(0)==c&&s.charAt(1)!=c)
        {
            return 0;
        }
        else
        {
            return 1+lastOccurance(s.substring(1),c);
        }
    }
	static boolean strictlyIncreasing(int arr[])
	{
		if(arr.length==1)
		{
			return true;
		}
		if(arr[0]<arr[1])
		{
			return strictlyIncreasing(Arrays.copyOfRange(arr,1,arr.length));
		}
		else
		if(arr[0]>arr[1])
		{
			return false;
		}
		return false;
	}
	static String moveAllXToEnd(String s)
	{
		if(s.length()==0)
		{
			return "";
		}
		if(s.charAt(0)=='x')
		{
			return moveAllXToEnd(s.substring(1))+s.charAt(0);
		}
		else
		{
			return s.charAt(0)+moveAllXToEnd(s.substring(1));
		}
	}
	static int minimumInAnArray(int arr[])
	{
		if(arr.length==2)
		{
			return Math.min(arr[0],arr[1]);
		}
		else
		{
			return Math.min(arr[0],minimumInAnArray(Arrays.copyOfRange(arr,1,arr.length)));
		}
	}
    static String removeAllDuplicates(String s,int x)
	{
		if(s.length()==1)
		{
			
			return "";
			
		}
		int p=s.charAt(0)-97;
		int p1=~(1<<p);
		//System.out.println(1<<p);
		if((x&p1)==x)
		{
			//System.out.println("entered");
			x=x|(1<<p);
			return s.charAt(0)+duplicates(s.substring(1,s.length()),x);
			
			//return duplicates(s.substring(1,s.length()),x);
		}
		else
		{
			return duplicates(s.substring(1,s.length()),x);
			
		}
		
	}
    public static void main(String[] args) {
    // factorial 
        System.out.println(factorial(5));
        //first occurance of char in a string
        System.out.println(firstOccurance("abcddddde",'d'));
         //last occurance of char in a string
        System.out.println(lastOccurance("abcddddde",'d'));
        // An Array is strictly increasing or not
 System.out.println(strictlyIncreasing(new int[]{1,2,3,4,5,6}));
        //Move All Xs to end
        System.out.println(moveAllXToEnd("axbcxed"));
        // Minimum In An Array
        System.out.println(minimumInAnArray(new int[]{1,5,0,9}));
        // Remove All duplicates from String
         System.out.println(removeAllDuplicates("aabbccdd,0));
        
    }


}
