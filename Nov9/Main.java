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
  
 public static void main(String[] ar)
 {
   // Move Zeroes To The end
   for(int x:moveZeroesToEnd(new int[]{1,0,0,1,1,0,0}))
   {
     
    System.out.print(x+" "); 
   }
   // sort 0 1 and 2
 
  
   for(int x:sort0s1s2s(new int[]{1,0,2,0,1,0,2,2,0}))
   {
     
    System.out.print(x+" "); 
   }
  
}
