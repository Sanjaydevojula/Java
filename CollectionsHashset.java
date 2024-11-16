package javapgms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

//arraylist and hash set are classes which implements the list and set interfaces
//hashset used to store homogeneous and heterogenius data
//insertion order is not preserved(not index concept is available)
//duplicates and multiple  nulls are not allowed
public class CollectionsHashset {

	public static void main(String[] args) {
		//set mylist=new HashSet() // child class object and parent class reference variable

    HashSet hs= new HashSet();// HashSet<String> s=new HashSet<String>(); no primitive type is allowed
    hs.add("sanjay");
    hs.add("sanjay");// added duplicate values and nulls
    hs.add(100);
    hs.add(10.5);  
    hs.add(true);
    hs.add(null);
    hs.add(true);
    hs.add('A');    
    hs.add(null);
    hs.add(100);

    System.out.println(hs); // [null, A, 100, sanjay, 10.5, true] order is not preserved and duplicate and nulls are not allowed
 hs.remove(100); //directly pass value instead of index
 System.out.println(hs);  // inserting in between is not posible as order is not preserved
 System.out.println(hs.size());                
 //accessing specific element is also not posible as order is not preserved but after converting to arraylist then access
 ArrayList a=new ArrayList(hs);
 System.out.println(a);
 
 Iterator it=hs.iterator();
 
 while(it.hasNext()) {
	 System.out.println(it.next());
 }
 
 
	}

}
