package InterviewProgramQuestions;

import java.util.Arrays;

public class DeleteSpecificArrayValue {

	public static void main(String[] args) {

		
		//1Q1: WAP to delete a specific number from the given array.
				//int p[] = {1,4,5,2,3,22,31, 2}; 
				//Need to remove 22 from the p[] array.
				//output should be: [1, 4, 5, 2, 3, 31, 2]
			
			
			int p[] =  {1,4,5,2,3,22,31,2}; //0-7
			int a [] = new int[p.length-1]; //7
			int k=0;
			for(int j=0; j<p.length; j++) {
				
				if(p[j]!=22) {
					a[k]=p[j];
					k++;
						}
			}
				System.out.println(Arrays.toString(a));
	}

}
