package InterviewProgramQuestions;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {

		
		// 2)Reverse the array values
				int b[] = { 1, 3, 5, 7, 9, 11 };
				int d[] = new int[b.length];
				int e = 0;
				System.out.println("Array before reverse:" + Arrays.toString(b));
				for (int c = b.length - 1; c >= 0; c--) {

					d[e] = b[c];
					e++;
				}
				System.out.println("Array after reverse:" + Arrays.toString(d));
				// System.out.println(d[e]);

				
				// with each for loop
				int f[] = { 1, 2, 3, 4, 5, 6 };
				for (int rev : f) {

					System.out.println(rev);
				}
			}
	}


