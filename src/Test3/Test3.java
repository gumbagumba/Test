package Test3;
import java.util.Scanner; 

class Test3{
	public static void main (String args[]) {
		Scanner scan = new Scanner (System.in);
		System.out.print("Введите предложение: ");
		String input = scan.nextLine ();
		scan.close();
		int count = 0;
			if (input.length() != 0) {
			count ++;
			int k = 0;
				for (int i = 0; i < input.length(); i++) {
					if (input.charAt(i) == ' ') {
						count ++;
						System.out.println (input.substring(k,k + 1).toUpperCase() + input.substring(k + 1,i));
						k = i + 1;
						}
					}
				System.out.println (input.substring(k,k + 1).toUpperCase() + input.substring(k + 1,input.length()));
				}
			System.out.println ("Всего было слов: " + count);		
		}
	}