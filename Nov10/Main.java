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
    static int downwards(int arr[][],int i,int j,int c)
    {
        while(i<c)
        {
            System.out.print(arr[i][j]+" ");
            i++;
        }
        System.out.println();
        return i-1;
    }
    static int upwards(int arr[][],int i,int j)
    {
        while(i>=0)
        {
            System.out.print(arr[i][j]+" ");i--;
        }
        System.out.println();
        return i+1;
    }


   
    public static void main(String[] args) {
    int [][]arr=new int[][]{{1,2,3,4,5,6},
                {5,6,7,8,8,7},{9,10,11,12,6,7},{13,14,15,16,8,7},{9,10,11,12,6,7},
                {13,14,15,16,8,7}};
        int count=0;
        int i=0,j=0,c=6,t=0;

// Wave
        while(count<25)
        {
            i=downwards(arr,i,j,5);
            j++;
            i=upwards(arr,i,j);
            j++;
            count+=2*5;

        }
        count=0;
        i=4;j=0;
        //Reverse Wave
        System.out.println();
        while(count<25)
        {

            i=upwards(arr,i,j);
            j++;
            i=downwards(arr,i,j,5);
            j++;
            count+=2*5;

        }









    }


}
