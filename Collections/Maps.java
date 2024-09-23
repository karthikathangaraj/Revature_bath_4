package com.Collections;

import java.util.HashMap;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {
		Map<Object,String> hm=new HashMap<Object,String>();
		hm.put(1, "a");
		hm.put(2,"B");
		hm.put(3, "J");
		System.out.println(hm);

		for(Map.Entry<Object, String>m1:hm.entrySet())
          {
        	  System.out.println(m1.getValue());
        	  System.out.println(m1.getKey());
                      }

	}

}
