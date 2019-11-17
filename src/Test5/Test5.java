package Test5;

import java.util.Scanner; 

class Test5 {
	public static void main (String args[]) {
		Scanner scan = new Scanner (System.in);
		System.out.print("¬ведите длину последовательности - N: ");
		int n  = scan.nextInt ();
		if (n <= 100) {
		int [] array2 = new int[n];	
		array2[0] = 0;
			for (int i = 1; i < n; i++) {
			array2[i] = array2[i - 1] + 1;
			}
			for (int k = 1; k < n; k++) {
				if ((int) array2[k] / 10 == array2[k] % 10) {
				System.out.println(array2[k] + " - число-палиндром");
				}
			}
		}	
		if (n > 100) {
				System.out.println("ƒлина последовательности по условию не больше 100 !!!");
		}	
		scan.close();		
		}
}