package Test1;
import java.util.Scanner; 

public class Test1 {
	
		public static void main (String args[]) {
			Scanner scan = new Scanner(System.in);
			System.out.print("������� ����� ����� �����: ");
			double number = scan.nextDouble();
			scan.close();
			if ((number % 1) != 0) 
			{
			System.out.println ("�� ����� �� ����� �����! ");
			}
			else {
				if (number % 2 == 0) {
				System.out.println ("����� ������ ");
				}
				else {
				System.out.println ("����� �������� ");
				}
				boolean f = false;
				for (int i = 2; i < number; i++) {
					if (number % i == 0) { 
						f = true;
						break;
					}
				}
				if (f) {
				System.out.println ("����� ��������� ");
				}
				else {
				System.out.println ("����� ������� ");
				}
			}
		}
}
