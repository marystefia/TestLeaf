package week1.day2;

public class IsPrime {
	public static void main(String[] args) {
		int num = 15;
		boolean status=false;;
		for(int i=2;i<=num;i++) {
			if(num%i==0)
				status=true;
			}
		if(status==true)
			System.out.println(num + " is not a prime number");
		else
			System.out.println(num + " is a prime number");
	}
}
