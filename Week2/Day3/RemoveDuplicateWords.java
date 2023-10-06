package week2.day3;

public class RemoveDuplicateWords {

	public static void main(String[] args) {

		String text = "We learn java basics as part of java sessions in java week1";
		int count=1;
		String[] words = text.split(" ");
		//String[] text1 = new String[words.length];
		for(int i=0;i<=words.length-1;i++) {
			for(int j=i+1;j<=words.length-1;j++) {
				if(words[i].equals(words[j])) {
					count++;
				}
				if(count>1) {
					words[j] = "";
					count=1;
			}
			}
			
		}
		for(String word:words) {
			System.out.print(word + " ");
		}
	}
}


