package InterviewProgramQuestions;

public class PalindromNumber{ 

	public static void main(String[] args) {
				
//				Scanner sc = new Scanner(System.in);
//				
//				System.out.println("Enter the number:");
//				
//				int number = sc.nextInt(); /// the user input will get store in number
				//using the algorithm
				int number = 8458;
				
				int originalNum = number;
//				
				int rev = 0;
				
				while(number!=0) { //the number will be 121 which is not equal to 0
					rev = rev*10 + number%10;  //0*10+121%10 = 0 + reminder 12 = 12
					number = number/10;        // 121/10 = 12
					
				}
				
				System.out.println("The reverse number is: " +rev);
				if(rev==originalNum) {
					
					System.out.println("The number is palindrom:" +rev);
				}
				else {
					System.out.println("Ther number is not palindrom:" +rev);
				}
			}
}