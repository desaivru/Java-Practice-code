package InterviewProgramQuestions;

public class CharOccuranceCount {

	public static void main(String[] args) {
		charCountOccurance("selenium java selenium", 'S');

	}

	
	public static void charCountOccurance(String value, char characterToCount) {
		
		int valLength =value.length();
		
		String aftercharRemovedLength =value.replace(String.valueOf(characterToCount).toLowerCase().trim(), "");
		int charRemovedLength =aftercharRemovedLength.length();
		int occu = (valLength - charRemovedLength);
		if(occu==0) {
			System.out.println("The given character " +characterToCount+ " is not in the string. count is:" +occu);
		}
		else {
			System.out.println("Total occurance of "+characterToCount+ " is:"+occu);
		}
		
		
	}
	
	
	
}
