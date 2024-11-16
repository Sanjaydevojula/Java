package javapgms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.google.common.collect.Multiset.Entry;

// hashmap class is implemented from Map interface and using key value pair
//key is unique and values are duplicate
// insertion and index not folowed

public class CollectionHashMap {

	public static void main(String[] args) {
HashMap hm=new HashMap(); // HashMap<Integer,String> hm=new HashMap<>(Integer,String);

//Map m= new HashMap();// interface reference variable to class object
hm.put(1, "Sanjay");
hm.put(2, "Sai");
hm.put(3, true);
hm.put(4, 50);
hm.put(4, 55);

System.out.println(hm);//{1=Sanjay, 2=Sai, 3=true, 4=55} old value 50 is replaced by 55 -list {}
System.out.println(hm.size());
 hm.remove(3);// remove key  of that pair
 System.out.println(hm); // {1=Sanjay, 2=Sai, 4=55}
 System.out.println(hm.get(2));// access value with the key
 System.out.println(hm.keySet()); // retrives keys
 System.out.println(hm.values()); // retrive values
 System.out.println(hm.entrySet()); // keys and values- Set[]
 
 for(Object i:hm.keySet()) {
	 System.out.println(i+" "+hm.get(i));
	 
 }
  Iterator<Entry>  it =hm.entrySet().iterator();
  while(it.hasNext()) {
		System.out.println(it.next());
	  Entry entry =it.next();
// System.out.println(entry.getKey()+""+entry.getValue());
	  
  }
 
	}

}
