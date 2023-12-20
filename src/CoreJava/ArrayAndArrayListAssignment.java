package CoreJava;

import java.util.Arrays;

public class ArrayAndArrayListAssignment {
	
	//Array- It is a collection of similar type of data
	//1 size is fixed - static array --> to overcome this we have dynamic Array ArrayList()
	//2 can store only similar type of data

	public static void main(String[] args) {

		//Array with new keyword and size is fixed.
		//not aware how many values will be stored.
		int i[] = new int[4]; // 0-3
		
		//Array literals 
		//Values are given
		//When you already aware of the values
		//int p[] =  {1,4,5,2,3,22,31,2}; //0-7			

		
				
		//System.out.println(i[2]); This will give you the memeory address of array
		//if you want to print all the values of array we have Arrays.toString() method.
		// default values of array will be 0
		
		//System.out.println(Arrays.toString(i));
		
		//to find the length of array
		//System.out.println(i.length);
		
		
		//if you try to fetch the value outside the array length then it will give AIOB exception
		//System.out.println(i[4]); //ArrayIndexOutOfBoundsException:
		
		
	//Assignments
		//1Q1: WAP to delete a specific number from the given array.
		//int p[] = {1,4,5,2,3,22,31, 2}; 
		//Need to remove 22 from the p[] array.
		//output should be: [1, 4, 5, 2, 3, 31, 2]
	
	
	int p[] =  {1,4,5,2,3,22,31,2}; //0-7
	int a [] = new int[p.length-1];
	int k=0;
	for(int j=0; j<p.length; j++) {
		
		if(p[j]!=22) {
			a[k]=p[j];
			k++;
				}
	}
		System.out.println(Arrays.toString(a));

	
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

////////////VIP Interview question - When to use static array and dynamic array with practical example

//Dynamic Array example
//Shopping website - In sept the product list can be 100
//but in nov diwali festival it can be 500
//again in dec Khrismax it can be 700
//but in newyear it may again reduce to 150 so in such a cases static array is not useful we have to use dynamic array.

//Static array 
//Calender month will alwas be 12 
//Countries will always be fix suddenly it can not get changed in such a cases static array is useful

