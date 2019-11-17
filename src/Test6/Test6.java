package Test6;

import java.util.Scanner; 

class Test6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.print("Введите грузоподъемность рюкзака: ");
		int maxweight = scan.nextInt ();
		System.out.print("Введите количество вещей: ");
		int kolvo = scan.nextInt ();		
		System.out.print("Введите вес каждой вещи: ");
		int[] weight = new int[kolvo];
		 for (int i = 0; i < kolvo; i++) {
			 weight[i] = scan.nextInt();
         }
		System.out.print("Введите ценность каждой вещи: ");
		int[] price = new int[kolvo];
		 for (int i = 0; i < kolvo; i++) {
			 price[i] = scan.nextInt();
         }
		scan.close();
		
		int cennost = 0;
		int ves = 0;
		double[] koef = new double[kolvo];
			for (int i = 0; i < kolvo; i++) {
		koef [i] = (double) price[i] / weight[i];
			}
			 double tmp;
			 int tmp1;
			 int tmp2;
			 
			 boolean isSorted = false;
			 while(!isSorted) {
				   isSorted = true;
		           for (int i = 0; i < kolvo-1; i++) {
		                if(koef[i] < koef[i + 1]){		
		                    tmp = koef[i];	
		                    koef[i] = koef[i + 1];
		                    koef[i + 1] = tmp;
		                    tmp1 = weight[i];	
		                    weight[i] = weight[i + 1];
		                    weight[i + 1] = tmp1;	
		                    tmp2 = price[i];	
		                    price[i] = price[i + 1];
		                    price[i + 1] = tmp2;
		                    isSorted = false;
		                }
		           	}  
		       }
		         for (int i = 0; i < kolvo; i++) { 
		        	 if (weight[i] < maxweight - ves) 
		        		{
		        		 ves = ves +  weight[i];
		        		 cennost = cennost +  price[i];
		        		 System.out.println("Помещена вещь:" + " вес " + weight[i] + " Стоимость " + price[i]);
         	
		        	 }
		         }

			 System.out.println("Вес сложенных вещей " + ves + " Стоимость " + cennost);
						 
	}
}
