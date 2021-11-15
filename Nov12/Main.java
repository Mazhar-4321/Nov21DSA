public class Main  
{
    static int[] moveZeroesToEnd(int arr[])
    {
        int count=0;
        int arr1[]= new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                arr1[count]=arr[i];
                count++;
            }
        }
        return arr1;
    }
    static int[] intersection(int arr1[],int arr2[])
    {
        ArrayList<Integer> al= new ArrayList<>();

            Arrays.sort(arr1);
            int f=0,l=arr1.length-1,m=0;
            for(int i=0;i<arr2.length;i++)
            {
                f=0;l=arr1.length-1;
                while(f<=l)
                {
                    m=(f+l)/2;
                    if(arr2[i]>arr1[m]){f=m+1;}
                    if(arr2[i]<arr1[m]){l=m-1;}
                    if(arr2[i]==arr1[m]){
                        if(!al.contains(arr2[i]))
                        {al.add(arr2[i]);}
                        break;
                    }
                }
            }
       int arr[] =new int[al.size()];
            for(int i=0;i<al.size();i++)
            {

                arr[i]=al.get(i);
            }
            return arr;
    }
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
    return  ans;
 }
 static int[] sort0s1s2s(int arr[])
 {
     int f=0,l=arr.length-1,m=0;
     int temp=0;
     while(m<=l)
     {
         if(arr[m]==1){m++;}
         else
         if(arr[m]==0){
             temp=arr[m];
             arr[m]=arr[f];
             arr[f]=temp;f++;m++;
         }
         else
         if(arr[m]==2){
             temp=arr[m];
             arr[m]=arr[l];
             arr[l]=temp;l--;
         }

     }
     return arr;
 }
    public static void main(String[] args) {
     sortingTheSentence("Myself2 Me1 I4 and3");
        System.out.println(findDifference("abcd","abecd"));
        for(int i:intersection(new int[]{4,9,5},new int[]{9,4,9,8,4}))
        {
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i : moveZeroesToEnd(new int[]{1,0,1,0,1,1,0}))
        {
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i : sort0s1s2s(new int[]{1,0,2,0,1,2,0,0}))
        {
            System.out.print(i+" ");
        }
      Scanner sc = new Scanner(System.in);
      int s=sc.nextInt();
      int arr[]= new int[s];

      for(int i=0;i<s;i++)
      {
          arr[i]=sc.nextInt();

      }
   int f=0,l=arr.length-1,m=0,temp;
      while(m<=l)
      {
          if(arr[m]!=0&&arr[l]==0){f++;m++;l--;}
          if(arr[m]!=0&&arr[l]!=0){temp=arr[f];arr[f]=arr[m];
          arr[m]=temp;f++;m++;}
          if(arr[m]==0&&arr[l]!=0){temp=arr[l];
          arr[l]=arr[m];arr[m]=temp;;m++;l--;}
          if(arr[m]==0&&arr[l]==0){m++;l--;}
          for(int x:arr)
          {
              System.out.print(x+" ");
          }
          System.out.println();
      }
for(int x:arr)
{
    System.out.print(x+" ");
}


    }


}
