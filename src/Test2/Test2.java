package Test2;
import java.util.Scanner; 

public class Test2 {
	public static void main (String args[]) {
		Scanner scan = new Scanner (System.in);
		System.out.print("������� 2 ����� ����� �����: ");
		double num1 = scan.nextDouble (); // ������ ��������� �����
		double num2 = scan.nextDouble (); // ������ ��������� �����
		scan.close();
		if (num1 % 1 != 0) {
				System.out.println ("������ ����� �� �����! ");
		}
		else if (num2 % 1 != 0) { 
				System.out.println ("������ ����� �� �����! ");
		}
		else if ((num1 % 1 == 0 && num2 % 1 == 0)) {
			double sum = num1 + num2;
			System.out.println ("����� = " + sum);
			double razn = num1 - num2;
			System.out.println ("�������� = " + razn);

			double min;
			double nod = 0;  // ���
				if (num1 != 0 && num2 != 0) {
					if (num1 > num2)
						min = Math.abs(num2);
					else 
						min = Math.abs(num1);
					for (int n = 1; n <= min; n++){
						if (num1 % n == 0 && num2 % n == 0) {
						nod = n;
						}
					}
				}
				else if (num1 == 0)
					nod = num2;
				else if (num2 == 0)
					nod = num1;
				System.out.println ("��� = " + nod);

			double nok; // ���
			nok = Math.abs(num1 * num2) / nod;
			System.out.println("��� = " + nok);

		}
	}
}