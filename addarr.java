import java.util.Scanner;
class addarr {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=scan.nextInt();
        int[] a=new int[n];
        System.out.print("Input: ");
        for(int i=0;i<=n-1;i++)
        {
            a[i]=scan.nextInt();
        }
        System.out.print("Enter the target: ");
        int b=scan.nextInt();
        for(int i=0;i<=n-1;i++)
        {
            for(int j=i+1;j<=n-1;j++)
            {
                if((a[i]+a[j])==b)
                {
                    System.out.print("Output indexes: "+i+","+j);
                }
            }
        }       
    }
}