package Test1;
import java.util.Scanner; 

public class Test1 {
	
		public static void main (String args[]) {
			Scanner scan = new Scanner(System.in);
			System.out.print("Введите любое целое число: ");
			double number = scan.nextDouble();
			scan.close();
			if ((number % 1) != 0) 
			{
			System.out.println ("Вы ввели не целое число! ");
			}
			else {
				if (number % 2 == 0) {
				System.out.println ("Число четное ");
				}
				else {
				System.out.println ("Число нечетное ");
				}
				boolean f = false;
				for (int i = 2; i < number; i++) {
					if (number % i == 0) { 
						f = true;
						break;
					}
				}
				if (f) {
				System.out.println ("Число составное ");
				}
				else {
				System.out.println ("Число простое ");
				}
			}
		}
}
