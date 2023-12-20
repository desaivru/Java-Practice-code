package CoreJava;

public class AssignmentOne {

	public static void main(String[] args) {
  
	
			//5 What will be the output of the following program?
//			int i=1, j=2, k=3;
//			
//			int m = i-- - j-- - k--;
//			//  m = 1 - 2 - 3 = -4
//			// i = 0, j= 1, k=2
//			
//			System.out.println("i=" +i);
//			System.out.println("j=" +j);
//			System.out.println("k=" +k);
//			System.out.println("m=" +m);
//			
			//6 What will be the output of the following program?
			int a=1, b=2;
			
			
			System.out.println(--b - ++a + ++b- --a);
			// 1-2 + 2 - 1 = -1 + 1 = 0
			
			
			//What will be the value of i, j and k in the below program?
//			int i =19, j=29, k;
//			
//			int m = i-- - j-- - k--; // error variable k is not initialized
//			
//			System.out.println("i=" +i);
//			System.out.println("j=" +j);
//			System.out.println("k=" +k);
			
			int c=1;
			c = c++ + ++c * --c - c--;
			
			// = 1 + 3 * 2 - 2 = 5
			System.out.println(c);
			
			
			//Invalid arguement
//			int a1 = 11++;
//			System.out.println(a1);
			
			
			int ch = 'A';
			System.out.println(ch++);
			
			char chr = 'A';
			System.out.println(++chr);
			
			double d = 1.5, D = 2.5;
			System.out.println(d++ + ++D);
			// 1.5 + 3.5 = 5.0


			
			
		

	}

}
