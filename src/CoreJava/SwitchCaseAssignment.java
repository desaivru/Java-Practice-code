package CoreJava;

public class SwitchCaseAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//WAP to check given alphabet character is Vowel or 
				char chr = 'A';
				String ch = Character.toString(chr);
				String vowelConso = ch.toLowerCase();
				
				switch (vowelConso) {
				case"a":
					System.out.println(ch +" is vowel");			
					break;
				case"e":
					System.out.println(ch +" is vowel");			
					break;
				case"i":
					System.out.println(ch +" is vowel");			
					break;
				case"o":
					System.out.println(ch +" is vowel");			
					break;
					
				case"u":
					System.out.println(ch +" is vowel");			
					break;
					
				default:
					System.out.println(ch +" is consonant");
					break;
				}
				
				//WAP to run your test cases in a specific environment like: QA, Stage, Dev, UAT, Prod using using Switch - Case
				
				String env = "  QA";
				String url = env.trim();
				
				switch (url) {
				case"Dev":
					System.out.println("Launch dev environment URL");
					break;
					
				case"QA":
					System.out.println("Launch QA environment URL");
					break;
				case"Stage":
					System.out.println("Launch satge environment URL");
					break;
				case"Prod":
					System.out.println("Launch prod environment URL");
					break;
				case"UAT":
					System.out.println("Launch UAT environment URL");
					break;

				default:
					System.out.println("Invalid environment..." +url);
					break;
				}
				
				//WAP to book the specific type of car from the Uberapp using Switch - Case.
				//Car Type: Mini, Sedan, SUV, Premium
				//If user passes wrong car type, print please select the right car type
				
				String carType = "mini";
				
				switch (carType) {
				case"Mini":
					System.out.println(carType +"car booked");
					break;
				case"Sedan":
					System.out.println(carType +"car booked");
					break;
				case"SUV":
					System.out.println(carType +"car booked");
					break;
				case"Premium":
					System.out.println(carType +"car booked");
					break;
				
				default:
					System.out.println("Please select the right car " +carType);
					break;
				}
				
				
				//WAP to define the interest rate on the basis of Loan type using Switch Case
				//Loan Type: Car Loan, Housing Loan, Personal Loan, Education Loan
				//For Housing Loan, if user’s salary is less than 35000 USD - print : NOT APPLICABLE FOR Housing Loan
				
				String LoanType = "Housing";
				double sal = 35000.00;
				String currencyType = "USD";
				
				switch (LoanType) {
				case"Car":
					System.out.println("Applicable for " +LoanType +" loan");
					break;
				case"Personal":
					System.out.println("Applicable for " +LoanType +" loan");
					break;
				case"Education":
					System.out.println("Applicable for " +LoanType +" loan");
					break;
				case"Housing":
					if(sal<35000 &&currencyType == "USD" )
					System.out.println("Not applicable for " +LoanType +" loan");
					else {
						System.out.println("Applicable for " +LoanType +" loan");
					}
					break;

				default:
					System.out.println("Invalid loan type " +LoanType);
					break;
				}
				
			}
			

	}


