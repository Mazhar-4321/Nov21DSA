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
  static boolean validAnagram(String s1,String s2)
	{
		if(s1.length()!=s2.length())
		{
			return false;
		}
		HashMap<Character,Integer> hmap=new HashMap<Character,Integer>();
		HashMap<Character,Integer> hmap1=new HashMap<>();
		for(char c:s1.toCharArray())
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
			if(hmap.containsKey(c))
			{
				hmap.put(c,hmap.get(c)-1);
				if(hmap.get(c)==0)
				{
					hmap.remove(c);
				}
			}
			else
			{
				return false;
			}
		}
		return true;
	}
  static String sortingTheSentence(String s)
 {
     SortedMap<Integer,String> sortedMap = new TreeMap<>();
     String key="";
     String value="";
    for(int i=0;i<s.length();i++)
    {

        if((s.charAt(i)-97>=0&&s.charAt(i)-97<=25)||(s.charAt(i)-65>=0&&s.charAt(i)-65<=25)){value=value+s.charAt(i);}
        else
            if(s.charAt(i)==' '){
                if(!sortedMap.containsKey(Integer.parseInt(key)))
                sortedMap.put(Integer.parseInt(key),value);
                key="";value="";
            }
            else
            {key=key+s.charAt(i);}
            if(i==s.length()-1)
            {
                if(!sortedMap.containsKey(Integer.parseInt(key)))
                    sortedMap.put(Integer.parseInt(key),value);

            }


    }
    String ans="";
    for(int i :sortedMap.keySet())
    {
        ans=ans+sortedMap.get(i)+" ";
    }
     //System.out.println(ans);
    return ans;
 }
  
  public static void main(String[] ar)
  {
    // Sorting the sentence
    System.out.println(sortingTheSentence("Myself2 Me1 I4 and3"));
    // Valid Anagaram
     System.out.println(validAnagram("anagram","nagaram"));
    // find the difference
     System.out.println(findDifference("abcd","abcde"));
  }
  
}
