package CoreJava;

public class Assignments {

	public static void main(String[] args) {
		//1) Write a Java program to add two strings:
				String a = "Hello";
				char ch1 = 'Y';
				String name = "Naveen";
				char ch = 'K';
								
				System.out.println(ch1+""+ch1);
				System.out.println(a+" "+name+" "+ch);

				
				
				//2) Write a Java program to print the sum of two numbers
				byte b = 74;
				byte c = 36;
				//byte total = (byte) (b+c);
				int total = b+c;
				System.out.println(total);
				
				//3) Write a Java program to print the division of two numbers
			
				int k = 50/3;
				System.out.println(k);
				
				
				//4) Write a Java program to compute the specified expressions and print the output. Go to the editor.

				double x = 25.5;
				double y = 3.5;
				double z = 4.5;
				double n = 40.5;
				//((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) 
				double output = (x*y-y*y)/(n-z);
				
				System.out.println(output);
				
				
				//5) Try to concat "Hello Selenium" with a character 't'.
				
					String A ="Hello Selenium";
					char ch2 = 't';
					
					System.out.println(A+""+ch2);
				
				//6) Create three int variables having values like : 100, 200, 3400. Add them and concatenate and generate this output String : 

					//"Your Total  amount is. 3700".
					
					int i = 100;
					int j = 200;
					int l = 3400;
					int m = i+j+l;
					
					System.out.println("Your Total amount is. "+ m);
					
					
				//7) Print the ASCII value of the character 'h'.
					
					char ch3 = 'h';
					System.out.println((int)ch3);
					
					
				//8) Write a program to add 3 to the ASCII value of the character 'd' and print the equivalent character.
					
					char ch4 = 'd';
					System.out.println((int)ch4+3);
					
					
				//9) Write a program to find the square of the number 3.9.
					double d1 = 3.9;
					double sq = d1*d1;
					System.out.println(Math.round(sq));
					
					
				//10) what will be the output of the following program
					
					int i1 = 11;
					
					i1 = i1++ + ++i1;
					// 11 + 13 = 24
					System.out.println(i1);
					
					
				//11) Guess the output of the following program
					
					int a1 = 11, b1 = 22, c1;
					
					c1 = a1+b1 + a1++ + b1++ + ++a1 + ++b1;
					//11+22 + 11   + 22  +  13 + 24
						//103
					System.out.println(c1);
					
					
				//12) what will be the output
					
					int e=0;

					e = e++ - --e + ++e - e--;
					
				// 0  - 0 + 1 - 1
					// 0
					System.out.println(e);


			}

}


