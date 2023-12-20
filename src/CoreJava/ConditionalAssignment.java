package CoreJava;

public class ConditionalAssignment {

	public static void main(String[] args) {

		//Find out the greatest number out of four different given numbers:
		
				int a = 25, b=78, c=87, d=97;
//				Scanner sc = new Scanner(System.in);
//				int a = sc.nextInt();
//				System.out.print("Enter the number");
//				
				if(a>b&&a>c&&a>d) {
					System.out.println("The greatest:" +a);
				}
					else if(b>a&&b>c&&b>d) {
						System.out.println("The greatest:" +b);
					}
						else if(c>a&&c>b&&c>d) {
							System.out.println("The greatest:" +c);
						}
						else
						{
							System.out.println("The greatest:" +d);
						}
					
						
				
				// Write a Java program to test a number is positive or negative.
				int e = -0;
				
				if(e>0) {
					System.out.println(e +" is Positive number");
				}
				else if(e<0) {
					System.out.println(e +" is Negavive number");
				}
				else {
					System.out.println("The number is 0");
				}
					
				// WAP to check number is odd or even using If - Else
				
				int num = 17;
				if (num%2 == 0) {
					System.out.println("The number is even");
				}
				else{
						System.out.println("The number is odd");
					}
				
			//WAP to check given alphabet character is Vowel or Consonant using Switch - Case
				
				
			
				
			}	
			}

