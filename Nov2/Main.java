import java.util.*;

public class Main
{
  static int missingTermInSequence(int arr[])
	{
		int diff=(arr[arr.length-1]-arr[0])/arr.length;
		//System.out.println(diff);
		
		int f=0,l=arr.length-1,m=0;
		while(f<=l)
		{
			
			m=(f+l)/2;
			if((arr[m]-arr[f]==(m-f)*diff)&&(arr[l]-arr[m]==(l-m)*diff))
			{
				return -1;
			}
			if(m-f==1&&arr[m]-arr[f]!=(m-f)*diff)
			{
				//System.out.println(arr[m]+" "+diff);
				//System.out.println("r="+(arr[m]-diff));
				return arr[m]-diff;
			}
			if(l-m==1&&arr[l]-arr[m]!=(l-m)*diff)
			{
				//System.out.println("r1="+(arr[m]+diff));
				return arr[m]+diff;
			}
			if(arr[m]-arr[f]!=(m-f)*diff&&arr[l]-arr[m]!=(l-m)*diff)
			{
				return -1;
			}
			if(arr[m]-arr[f]!=(m-f)*diff){
				//System.out.println(arr[m]-arr[f]);
				//System.out.println((m-f)*diff);
				//System.out.println("h");
				l=m;}
			else
			if(arr[l]-arr[m]!=(l-m)*diff){
				//System.out.println("p");
				f=m;}
			
			//System.out.println("f="+f+",l="+l+",m="+m);
		}
		return -1;
	}
	static int smallestMissingElementInSortedArray(int arr[],int m)
	{
		int f,l,mid,flag;
		for(int i=0;i<=m;i++)
		{
			f=0;l=arr.length-1;
			flag=0;
			while(f<=l)
			{
				mid=(f+l)/2;
				if(i>arr[mid]){f=mid+1;}
				if(i<arr[mid]){l=mid-1;}
				if(i==arr[mid]){flag=1;break;}
			}
			if(flag==0)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args)
	{
		int arr[]=new int[]{0,1,2,3,4,5,6,7,8,9,10};
    // Smallest Missing Element In Sorted Array
		System.out.println(smallestMissingElementInSortedArray(arr,10));
    // Missing Element in a sequence
    System.out.println(missingTermInSequence(new int[]{1,3,5,9,11}));
		}
}
