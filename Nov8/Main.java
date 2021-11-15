import java.util.*;

public class Main
{
	static char findDifference(String s1,String s2)
    {
        HashMap<Character,Integer> hmap= new HashMap<>();
        for(char c : s1.toCharArray())
        {
            if(hmap.containsKey(c))
            {
                hmap.put(c,hmap.get(c)+1);
            }
            else
            {
                hmap.put(c,1);
            }
        }
        for(char c:s2.toCharArray())
        {
            if(!hmap.containsKey(c))
                return c;
            else
            {
                if(hmap.get(c)-1==0)
                {
                    hmap.remove(c);
                }
                else
                hmap.put(c,hmap.get(c)-1);

            }
        }
        return ' ';
    }
	static ArrayList<Integer> change3rdIndexElement(ArrayList<Integer> arr,int k)
	{
		arr.set(3,k);
		return arr;
	}
	
	static ArrayList<Integer> copyAllElementsFromOneListToOther(ArrayList<Integer> arr)
	{
		ArrayList<Integer> aL=new ArrayList<Integer>();
		aL.addAll(arr);
		return aL;
	}
  
	static ArrayList<Integer> arrayListDescendingOrder(ArrayList<Integer> arr)
	{
		Collections.sort(arr);
		int f=0,l=arr.size()-1;
		while(f<l)
		{
			int temp=arr.get(f);
			arr.set(f,arr.get(l));
			arr.set(l,temp);
			f++;l--;
		}
		return arr;
	}
	public static void main(String[] args)
	{
		ArrayList<Integer> arr= new ArrayList<>();
		arr.add(1);
		arr.add(12);
		arr.add(3);
		arr.add(5);
		// Change 3rd index
		System.out.println(arr=change3rdIndexElement(arr,67));
    // Copy all elements from one list to another
		System.out.println(arr=copyAllElementsFromOneListToOther(arr));
    // sort arraylist in descending order
		System.out.println(arr=arrayListDescendingOrder(arr));
    // find the difference
    	System.out.println(findDifference("abcd","abcde"));
		}
}
