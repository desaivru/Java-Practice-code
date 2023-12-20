package CoreJava;

public class ReverseString {

	public static void main(String[] args) {
		//1 . Using + String concatenation operator
		
		String str = "VRUSHALI";
		String rev = "";
		System.out.println("Before revere: "+ str);
		
		int strLength = str.length(); //it will give 8 as length
		
		for(int i=strLength-1; i>=0; i--) {   //We are using charAt method hence using length-1 because charAt store wirh index 0
			
			rev=rev+str.charAt(i); // charAt will take the character bases on index value and will add into rev variable
			
		}
		
		System.out.println("After reverse: " +rev);
		
		
		
		
		
	}

}
