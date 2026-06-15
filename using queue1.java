import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
public class Main
{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Queue<Integer> queue=new LinkedList<>();
		int s;
		int n;
		System.out.print("enter the size:");
		s=scan.nextInt();
		for(int i=0;i<=s-1;i++)
		{
		    n=scan.nextInt();
		    queue.add(n);
		}
		int rem=0;
		System.out.print("enter the no of elements to be removed:");
		rem=scan.nextInt();
		if(rem==s)
		{
		    System.out.print("queue is empty");
		}
		else{
		for(int i=0;i<=rem-1;i++)
		{
		    queue.remove();
		}
		for(int num: queue) {
            System.out.print(num + " ");
		
	}
	}
}
}
