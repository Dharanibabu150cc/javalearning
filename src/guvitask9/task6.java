package guvitask9;

import java.util.Scanner;

public class task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the month in number");
//		int monthnumber = sc.nextInt();
//		System.out.println("enter the no of days");
//		int days=sc.nextInt();
		
int monthnumber = 
6
;
//int monthnumber2 = 2;
//int monthnumber3 = 3;
//int monthnumber4= 4;
//int monthnumber5 = 5;
//int monthnumber6= 6;
//int monthnumber7 = 7;
//int monthnumber8 = 8;
//int monthnumber9 = 9;
//int monthnumber10 = 10;
//int monthnumber11 = 11;
//int monthnumber12 = 12;
float rent=550;
int days =3;
float peakrent= rent* days * 20/100;
int normalrent = (int) (rent * days);
//int daystostay;

switch (monthnumber) {

case(4):
	System.out.println("the tariff is "+peakrent);
break;
case(5):
	System.out.println("the tariff is "+peakrent);
break;

case(6):
	System.out.println("the tariff is "+peakrent);
break;
case(11):
	System.out.println("the tariff is "+peakrent);
break;
case(12):
	System.out.println("the tariff is "+peakrent);
break;
default:
	System.out.println(normalrent);
}




	}

}
