package CoreJava;

public class StringStringBuffer {

	public static void main(String[] args) {
		
		
		//String is immutable meaning once its object is created the value can not be change.
		//when you try to concat the new string it will create new object with original value + concat value but if you not given rfe
		//it will be consider as noone is refering to that object and java garbage collector will destroy that object.
		//belowis the perfect example of string immutability 
		
		String s = new String("vrushali");
		s.concat("desai");
		System.out.println(s); //output will be vrushali
		
		
		
		
		//StringBufferis mutable which means once the string builder object is created you can modify the value.
		//you can append the another string value here no new object will be created.
		
		StringBuffer sb= new StringBuffer("Vrushali");
		sb.append("desai");
		System.out.println(sb);
		
		
		
		String s1 = new String("desai");
		String s2 = new String("desai");
		System.out.println(s1==s2);  //output is false - == will compare or check if both the object reference are pointing to same 
		//object or not. here s1 and s2 both are pointing to different object hence return will be false.
		
		System.out.println(s1.equals(s2)); //output - true
		
	}

}
