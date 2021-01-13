package by.ld.unit01.main;

import java.text.DecimalFormat;
import java.util.*;

public class Task01 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*System.out.println("Введите x ");
	
	x= Scanner(system.in).nextint; 
	
	System.out.println ("Введите y ");*/
	double  x, y;
	double sum, qou, mul, dif;	
	x=1.5;
	y=3.23;
	DecimalFormat f = new DecimalFormat ("##.00");
	
	//Сумма	
	sum=x+y;
	System.out.println("Сумма x+y="+x+"+"+y+"="+sum);
	
	//Разность
	dif=x-y;
	System.out.println("Разность x-y="+x+"-"+y+"="+dif);
	
	//Произведение
	mul=x*y;
	System.out.println("Произведение x*y="+x+"*"+y+"="+f.format(mul));
	
	//Частное
	if (y!=0){
		qou=x/y;
		System.out.println("Частное x/y="+x+"/"+y+"="+f.format(qou));
		
	} 
	else {
		System.out.println("Недопустимая операция: знаменатель равен 0");
	}
		
		
		

	}

	
	
	

}
