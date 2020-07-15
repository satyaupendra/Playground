import java.util.Scanner;
class Main{
  public static void fg(int asize,int arr[])
  {
    int num[]=new int[asize];
    int numc=0;
    int ze[]=new int[asize];
    int zc=0;
    for(int i=0;i<asize;i++)
    {
      if(arr[i]==0)
      {
       ze[zc]=arr[i];
       zc++;
      }
    else
    {
      num[numc]=arr[i];
      numc++;
    }
    }
    int ind=0;
    for(int k=0;k<numc;k++)
    {
      arr[ind]=num[k];
      ind++;
    }
      for(int k=0;k<zc;k++)
    {
      arr[ind]=ze[k];
      ind++;
    } 
      
  }  
    public static void main(String args[]) {
       // Type your code here
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int a[]=new int[n];
      for(int j=0;j<n;j++)
      {
        a[j]=in.nextInt();
      }
      fg(n,a);
      for (int h=0;h<n;h++)
      {
        System.out.print(a[h]+" ");
      }
    }
}