package week1.day2;

public class FindOddNumbers {
	public static void main(String[] args) {
		int a = 10;
		System.out.println("Odd numbers from 1 to 10: ");
		for(int i=1;i<=a;i++) {
			if(i%2==1)
				System.out.println(i);
		}
	}

}
