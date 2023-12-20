package CoreJava;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//suppose havelinkedlist [Test, Qtp, Selenium, Java, TestNg]
				//Singly linkedlist
				//have node and node divided into two part first contain data and second contains reference of next element.
				//Last reference element points to null
				
				LinkedList<String>ll = new LinkedList<String>();
				ll.add("Test");
				ll.add("Qtp");
				ll.add("Selenium");
				ll.add("Java");
				ll.add("TestNg");
				
				System.out.println("Linked list is: " + ll);
				
				//If you want to add any element at first node
				ll.addFirst("Vrushali");
				System.out.println("Ater adding first element" +ll);
				
				//if you want to add element at last node
				ll.addLast("Mavem");
				System.out.println("Ater adding first element" +ll);
				
				//if you want to access or get particular element from list
				System.out.println("Get element: " +ll.get(3) );
				
				//if you want to set any value 
				ll.set(0, "BCA");
				System.out.println("Set new emenet into list: "+ ll);
				
				 //if you want to remove first and last element
				ll.removeFirst();
				System.out.println(ll);
				
				 //if you want to remove elements from specific index
				System.out.println(ll.remove(4));
				
				 //if you want to access or print all the values from linked list
				 //For loop
				System.out.println("*****Using for loop*****");
				
				for(int i= 0; i<ll.size(); i++) {
					System.out.println(ll.get(i));
				 }
				
				
				 //advance for loop
				System.out.println("*****Using advance for loop*****");
				for(String str: ll) {
				System.out.println(str);
				 }
				
				 //iterator
				System.out.println("*****Using iterator*****");
				 Iterator<String> it = ll.iterator();
				while(it.hasNext()){;
					System.out.println(it.next());
					
				 }
				 //while loop
				System.out.println("*****Using while loop*****");
				int num =0;
				while(ll.size()>num) {
					System.out.println(ll.get(num));
					num++;
					
				}
			}

	}

