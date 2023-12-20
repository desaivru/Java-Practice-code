package CoreJava;

public class LoopsAssignment {

	public static void main(String[] args) {

		//1. WAP to print following output:I am Batman 5 times.
				// Using while loop
				System.out.println("*********Using while loop*********");
				int i=0;
				while(i<5) {
					System.out.println("I am Batman");
					i++;
				}
				
				// Using for loop 
				System.out.println("*********Using for loop*********");
				for(int j=0; j<5; j++) {
					System.out.println("I am Batman");
					}
				
				//2. WAP to print following output:I am Batman 1....up to 9
				System.out.println("*********Using while loop*********");
				int a = 0, count =1;
				while(a<9) {
					System.out.println("I am Batman " +count);
					a++;
					count++;
				}
						
				System.out.println("*********Using for loop*********");
				
				int c=1;
				for(int b=0; b<9; b++) {
				System.out.println("I am Batman "+c++);
				}
				
				//3. WAP to print 10 to 1 using for, while and do-while loop
				
				System.out.println("*********Using for loop*********");
				for(int d=10; d>0; d--) {
					System.out.println(d);
				}
				
				System.out.println("*********Using while loop*********");
				int e=10;
				while(e>0) {
					System.out.println(e);
					e--;
				}
				
				System.out.println("*********Using do while loop*********");
				int f=10;
				do {
					System.out.println(f);
					f--;
				}		
				while(f>0);
				
				
				//4. Write a program in Java to print "Hello World" ten times using while loop
				System.out.println("*********Using while loop*********");
				String str = "Hello World"; int g=0;
				while(g<10) {
					System.out.println(str);
					g++;
				}
				
				
				//5. Write a program in Java to print all the multiplication of 5 from 1 to 100 using while /for/do-while loop
				System.out.println("*********Using for loop*********");
				for(int h=1; h<=100; h++) {
					if(h%5 == 0) {
						System.out.println(h +" is multiplication of 5");
					}
				}
				
				System.out.println("*********Using while loop*********");
				int k=1;
				while(k<=100) {
					if(k % 5==0) 
					{			
						System.out.println(k +" is multiplication of 5");
					}
					k++;
				}
			
			
			//6. Print all odd and even numbers between 1 to 100
				System.out.println("******************Odd Even******************");
				
				for(int l=1; l<100; l++) {
					if(l%2 == 0) {
						System.out.println(l +" is even number");
					}
					else {
						System.out.println(l +" is odd number");
					}
					
				}
			
				
				//8. Print A-Z , a-z, 0-9 with  the respective ASCII numbers the console one using while and for loop.
				System.out.println("******************ASCII value of A-Z with for loop******************");
				
				for(char m='A'; m<='Z'; m++ )
				{
					System.out.println(m + "=" + (byte)m);
				}
				
				
				System.out.println("******************ASCII value of A-Z with while loop******************");
				char n = 'A';
				while(n<='Z') {
					System.out.println(n + "=" + (byte)n);

					n++;
				}
				
				System.out.println("******************ASCII value of a-z with for loop******************");
				for(char o='a'; o<='z'; o++) {
					System.out.println(o +"=" +(int)o);
				}
				
				System.out.println("******************ASCII value of 0-9 with for loop******************");
				int counter = 48;
				for(int p=0; p<10; p++) {	
					System.out.println("ASCII value of " +p +"=" +counter);
					counter++;
				}
				
				
				//9. Print the following series: 1.0 2.0 3.0  ...... 10.0 and 0 9 18 27 36 …99
				System.out.println("***************** 1.0-10.0 with for loop******************");

				for(double q = 1.0; q<=10.0; q++) {
					System.out.println(q);
				}
				
				System.out.println("***************** 0,9,18.....99 with for loop******************");
				int multi = 9;
				for(int r= 0; r<=11; r++) {
					System.out.println(r*multi);
					
				}
				
				
				//Print only vowels (aeiou) using for and while loop. Start the loop from ‘a‘ to ‘z‘.
				System.out.println("***************** (aeiou)with for loop******************");

				for(char ch1 = 'a'; ch1<='z'; ch1++) {
					if(ch1 =='a' || ch1=='e' || ch1=='i' || ch1=='o' ||ch1=='u') {
						System.out.println(ch1);
					}
				}
				
				System.out.println("***************** (aeiou)with while loop******************");

				char ch2 ='a';
				while(ch2<='z') {
					if(ch2 =='a' || ch2=='e' || ch2=='i' || ch2=='o' ||ch2=='u') {
						System.out.println(ch2);
						}ch2++;
				}
			
							
			}

			private static String convertToASCII(int p) {
				// TODO Auto-generated method stub
				return null;
			}
		

	}


