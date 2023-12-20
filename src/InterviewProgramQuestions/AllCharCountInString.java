package InterviewProgramQuestions;

import java.util.HashMap;
import java.util.Map;

public class AllCharCountInString {
	
	//test - t=2, e=1, s=1
	//always use hashmap collection to solve this kind of program.
	//Hashmap maintain the values in <key,value> pair and does not include duplicate value.
	//Hashmap -> <Key, value> --><Character, Integer>
	
	public static void getCharCount(String value) {
		Map<Character,Integer> charMap = new HashMap<Character, Integer>(); //this will create empty hashmap
		
		char strArry[] = value.toCharArray();
		
		for(char c: strArry) {
			if(!String.valueOf(c).isBlank()){ //to remove blank space
			
			if(charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c)+ 1);
			}
			else {
				charMap.put(c, 1);
			}
		}
		}
		System.out.println(charMap);
			
	}
	

	public static void main(String[] args) {
		getCharCount("narayan gawade");

	}

}
