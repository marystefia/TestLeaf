package week2.day3;

public class ReverseEvenWords {

	public static void main(String[] args) {
		
		String test = "I am a software tester";
		String[] words = test.split(" ");
		int i = 0;
		for(String word:words) {
			if(i%2==1) {
				char[] ch = word.toCharArray();
				//char[] rword = new char[ch.length];
				for(int j=ch.length-1; j>=0; j--) {
					System.out.print(ch[j]);
					
				}
				System.out.print(" ");
			}
			else
				System.out.print(word + " ");
			i++;
		}
	}
}
