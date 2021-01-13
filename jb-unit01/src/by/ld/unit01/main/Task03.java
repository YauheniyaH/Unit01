package by.ld.unit01.main;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x,y,z;
		
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Введите значение параметра x ");
		    if (scanner.hasNextDouble()) {
		        //System.out.println("You entered : " + scanner.nextInt());
		       x= scanner.nextDouble();
		       System.out.println("Введите значение параметра y ");
		       if (scanner.hasNextDouble()) {
		    	   y= scanner.nextDouble();  
		    	   z=2*x+(y-2)*5;
		    	   System.out.println("Значение функции z=2*x+(y-2)*5, где x="+x+" и y="+y+" равно "+z);
		       } else {
		    	   System.out.println(" Input y is not numeric");
		       }
		    	
		    } else {
		        System.out.println(" Input x is not numeric");
		    }

	}

}}
