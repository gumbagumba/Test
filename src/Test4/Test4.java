package Test4;

import java.util.Scanner; 

class Test4 {
	public static void main (String args[]) {
		Scanner scan = new Scanner (System.in);
		System.out.print("������� ����� � ����� �����: ");
		String word = scan.nextLine ();
		String text = scan.nextLine ();
		scan.close();
		text = text.toLowerCase();
		word = word.toLowerCase();
		int count = 0;
		int i = text.indexOf(word);
		while (i >= 0) {
			count++;
			i = text.indexOf(word,i + 1);
		}
		System.out.println ("����� ����������� � ������ " + count + " ���");		
	}
}