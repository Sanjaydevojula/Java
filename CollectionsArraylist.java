package javapgms;

import java.util.ArrayList;
import java.util.Iterator;

//collection is interface used for storing group of elements
// list interface and set interface is sub parts of collection interface
// arraylist and hash set are classes which implements the list and set interfaces
// arraylist used to store homogeneous and heterogenius data
//insertion order is preserved(index concept is preserved)
// duplicates and multiple nulls are allowed
public class CollectionsArraylist {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		//list mylist=new ArrayList() // child class object and parent class reference variable
		a.add(10);
		a.add(20);
		a.add("Sanjay");
		a.add("Welcome");
		a.add(true);
		a.add(10.5); // adds at the end of list
		
		System.out.println((a));
		System.out.println(a.size()); // size of arraylist
		a.remove(2);                 // remove element from array
		System.out.println((a));		
		a.add(3, "Sanjay");
		System.out.println((a)); // add in middle of list
		a.set(1, 80);// replace/modify/change
		System.out.println((a)); // add in middle of list
		
		System.out.println(a.get(3));// retrive element at specific index
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		for(Object o:a) {
			System.out.print(o+" ");
		}
		System.out.println();

		//using iterator-- purely for Collections
		Iterator it=a.iterator();
		while(it.hasNext()) {    // checks whether there is next element
			System.out.print(it.next()+" ");  // get the element
		}	
		// remove()- specific element at index
		//clear()- remove all elements
		// create new arraylist(arlist2) and mention arraylist.remove(arlist2)- it removes arelist2 elements from arraylist (remoing multiple elements)

	}

}
