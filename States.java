package Hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class States {

	public static void main(String[] args) {
		HashMap<Integer,String>hashMap=new HashMap<Integer,String>();
		hashMap.put(1, "Tamil nadu");
		hashMap.put(2, "Kerala");
		hashMap.put(3, "Karnataka");
		hashMap.put(4, "Bihar");
		hashMap.put(5, "Andra predesh");
		hashMap.put(6, "Goa");
		hashMap.put(7, "Haryana");
		hashMap.put(8, "Jammu and Kashmir");
		hashMap.put(9, "Himachala predesh");
		hashMap.put(10, "Gujarat");
		Set<Entry<Integer,String>>entrySet=hashMap.entrySet();
		Iterator<Entry<Integer,String>>iterator=entrySet.iterator();
		while(iterator.hasNext()) {
			Entry<Integer,String>next=iterator.next();
			System.out.println("key:"+next.getKey());
			System.out.println("key:"+next.getValue());
		}
		
	}

}
