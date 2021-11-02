public class Main
{
    static int binary_search(int arr[],int k)
    {
        int f=0,l=arr.length-1,m=0;
        while(f<=l)
        {
            m=(f+l)/2;
            if(arr[m]==k)
            {
                return m;
            }
            else
            {
                if(k>arr[m]){f=m+1;}
                else
                    l=m-1;
            }
        }
        return -1;
    }
    static int lower_bound(int arr[],int k)
    {
        int f=0,l=arr.length-1,mid=0;

        while(f<l) {
            mid=(l+f)/2;
            if(k<=arr[mid])
            {
                l=mid;


            }
            else
            {
                f=mid+1;
            }

        }
        if(arr[f]!=k)return -1;
        return  f;
    }
    static int upper_bound(int arr[],int k)
    {
        int f=0,l=arr.length-1,mid=0;
        while(f<l) {
            mid=(l+f)/2 +1;
            if(k>=arr[mid])
            {
                f=mid;
                //System.out.println("f="+f);
            }
            else
            {
                l=mid-1;
            }
        }
        if(arr[f]!=k)return -1;
        return  f;
    }
    static int two_sum(int f,int arr[],int k){
        int l=arr.length-1,mid=0;
        while(f<=l)
        {
            mid=(f+l)/2;
            if(arr[mid]==k)
            {
                return mid;
            }
            if(k>arr[mid])
            {
                f=mid+1;
            }
            else
            {
                l=mid-1;
            }
        }

        return -1;}
    static int[] arrays_intersection(int arr1[],int arr2[]){ return new int[]{1,2,3};}
    public static void main(String[] args)
    {
        int arr[]={1,1,2,2,4,5,5,6,6,6,6,9,10,11};
        System.out.println("Problem 1 Frequency Count");
        int k=9;
        int lower_bound=lower_bound(arr,k) ,upper_bound=upper_bound(arr,k);
        if(lower_bound!=-1)
        System.out.println("Frequency="+(upper_bound-lower_bound+1));
        else
            System.out.println(-1);
        System.out.println("Problem 2 two sum");
        int arr1[]={2,7,11,15},k1=18;
        int ans[]={-1,-1};
        for(int i=0;i<arr1.length;i++)
        {

         if(   (ans[1]=two_sum(i,arr1,k1-arr1[i])) !=-1)
         {
             ans[0]=i;break;
         }
        }
        System.out.println("["+(ans[0]+","+(ans[1])+"]"));
    }
}
