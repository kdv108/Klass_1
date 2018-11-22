package com.itschool;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    double a, b, c, x1, x2, D;

	    Scanner in = new Scanner(System.in);
	    System.out.println("Программа находит корни квадратного уравнения: ax^2+bx+c=0");
	    System.out.println("Введите значение коэффициента а не равное '0':");
	    a = in.nextDouble();
	    System.out.println("Введите значение коэффициента b:");
	    b = in.nextDouble();
	    System.out.println("Введите значение коэффициента с:");
	    c = in.nextDouble();

	    if (a == 0) {
	    	System.out.println("Уравнение не имеет решения т.к. коєфициент а = 0.");
		}
		else {
			D = Math.pow(b, 2) - 4 * a * c;
			if (D == 0){
				x1 = -b/(2*a);
				System.out.println("Уравнение имеет один корень: x = "+x1 );
			}
			else if (D < 0){
				System.out.println("Уравнение не имеет корней");
			}
			else {
				x1 = (-b - Math.sqrt(D))/(2*a);
				x2 = (-b + Math.sqrt(D))/(2*a);
				System.out.println("Уравнение имеет два корня: x1 = "+x1+", x2 = "+x2);
			}

		}

    }
}
