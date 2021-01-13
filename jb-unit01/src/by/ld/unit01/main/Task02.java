package by.ld.unit01.main;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, c;
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Введите значение параметра a ");
		    if (scanner.hasNextDouble()) {
		        //System.out.println("You entered : " + scanner.nextInt());
		        a= scanner.nextDouble();
		        c=3+a;
				System.out.println("Значение функции c=3+a, где a="+a+" равно "+c);
		    } else {
		        System.out.println("The input is not numeric");
		    }
		}
		
		

		
	
	

	}

}
