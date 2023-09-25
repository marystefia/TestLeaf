package week1.day2;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		System.out.println("Enter a number to find its fibonacci series: ");
		
		Scanner obj=new Scanner(System.in);
		int num=obj.nextInt();
		int[] arr=new int[num];
		arr[0]=0;
		arr[1]=1;
		for(int i=2;i<=num-1;i++) {
			arr[i]=arr[i-1]+arr[i-2];
		}
		//System.out.println(arr);
		for(int i=0;i<=num-1;i++) {
			System.out.print(arr[i]+" ");
		}
	 obj.close();
	}
}
//5 --> 0, 1, 1, 2, 3