import java.util.*;

public class Main
{
	static int forward(int arr[][],int i,int j,int c)
{
	int count=0;
	
		while(j<c)
		{
			//System.out.print(arr[i][j]+" ");
		System.out.print(arr[i][j]+" ");
			j++;count++;
		}
		System.out.println();
	return count;
}
static int down(int arr[][],int i,int j,int r){
	int c=0;
	while(i<r)
	{
		//System.out.print(i+""+j);
		System.out.print(arr[i][j]+" ");
		i++;c++;
	}
	System.out.println();
	return c;
	
}
static int reverse(int arr[][],int i,int j,int c){
	int count=0;
	while(j>c)
	{
		//System.out.print(arr[i][j]+" ");
		System.out.print(arr[i][j]+" ");
		j--;count++;
	}
	System.out.println();
	return count;
}
static int up(int arr[][],int i,int j,int r){
	int c=0;
	//System.out.println("i="+i+"j="+j);
	while(i>r)
	{
		//System.out.print(arr[i][j]+" ");
		System.out.print(arr[i][j]+" ");
		i--;c++;
	}
	System.out.println();
	return c;
}
	public static void main(String[] args)
	{
		int [][]arr=new int[][]{{1,2,3,4,5,6},
			{5,6,7,8,8,7},{9,10,11,12,6,7},{13,14,15,16,8,7},{9,10,11,12,6,7},
			{13,14,15,16,8,7}};
		int count=0;
		int i=0,j=0,r=6,c=6,lr=0,lc=-1;
		while(count<36)
		{
			count=count+ forward(arr,i,j,c) ;
			i++;j=r-1;
			//System.out.println(count);
			count+=down(arr,i,j,r);
			j--;i=c-1;
			//System.out.println(count);
			count+=reverse(arr,i,j,lc);
			i--;j=lc+1;
			//System.out.println(count);
			count+=up(arr,i,j,lr);
			//System.out.println(count);
			r--;c--;lr++;lc++;
			i=lr;j=lc+1;
			//count+=2;
		}
		 count=0;
		 i=0;j=0;r=5;c=5;lr=-1;lc=0;
		System.out.println();
		while(count<25)
		{
			count+=down(arr,i,j,r);
			//30 31
			i=r-1;j++;
			count+=forward(arr,i,j,c);
			//33 23
			i--;j=c-1;
			count+=up(arr,i,j,lr);
			//03 02
			i=lr+1;j--;
			count+=reverse(arr,i,j,lc);
			r--;c--;lr++;lc++;i=lr+1;j=lc;
		}
		}
}
