import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner(System.in);
        // Get the size of an array
        int arr_size = in.nextInt();
        int arr[] = new int[arr_size];
        // Get the array elements
        for(int idx = 0; idx <= arr_size - 1; idx++)
        {
            arr[idx] = in.nextInt();
        }
       int e1=in.nextInt();
      int e2=in.nextInt();
      int e11=-1;
      int e22=-1;
      for(int i=0;i<arr_size;i++)
      {
        if(e1==arr[i])
        {
          e11=i;
         
        }
        
        if(e2==arr[i])
        {
          e22=i;
          break;
        }
      }
         System.out.println(e11);
         System.out.println(e22);
       
      
    }
}