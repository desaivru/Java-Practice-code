package CoreJava;

import java.io.InputStream;
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter the number:");
//		
//		int number = sc.nextInt(); /// the user input will get store in number
		// using the algorithm
//	    int number = 13478901;

//		int originalNum = number;
////		
//		int rev = 0;
//		
//		while(number!=0) { //the number will be 121 which is not equal to 0
//			rev = rev*10 + number%10;  //0*10+121%10 = 0 + reminder 12 = 12
//			number = number/10;        // 121/10 = 12
//			
//		}
//		
//		System.out.println("The reverse number is: " +rev);
//		

		// 2 Using String Buffer class
//		int number = 456;
//
//		StringBuffer sb = new StringBuffer(String.valueOf(number));
//		StringBuffer rev = sb.reverse();
//		System.out.println(rev);

		int number = 89076;

		StringBuilder sbl = new StringBuilder(String.valueOf(number));
		StringBuilder rev = sbl.reverse();
		System.out.println(rev);

	}

	private static void Scanner(InputStream in) {

	}

}
