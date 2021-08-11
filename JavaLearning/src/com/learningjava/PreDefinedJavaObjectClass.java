package com.learningjava;

import java.util.Date;
import java.util.Hashtable;
import java.util.Map;
import java.util.HashMap;

public class PreDefinedJavaObjectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// clone() method of Object class.
		Date date1 = new Date();
		Date date2 = (Date) date1.clone();
		Date date3 = new Date();
		
		System.out.println(date1.toString());
		System.out.println(date2.toString());
		System.out.println(date3.toString());

		// equals() method of Object class.
		System.out.println(date1.equals(date2));
		System.out.println(date1.equals(date3));

		String nameOne = "Himanshu";
		String nameTwo = "Himanshu";
		System.out.println(nameOne.equals(nameTwo));

		String nameThree = new String("Himanshu");
		String nameFour = new String("Himanshu");
		System.out.println(nameThree.equals(nameFour));

		System.out.println(nameOne.equals(nameFour));
		
		// hashCode() method of Object class.
		System.out.println(nameOne.hashCode());
		System.out.println(nameTwo.hashCode());
		System.out.println(nameThree.hashCode());
		System.out.println(nameFour.hashCode());
		
		
		
		
		//----------hashtable -------------------------
        Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
        ht.put(101," ajay");
        ht.put(101,"Vijay");
        ht.put(102,"Ravi");
        ht.put(103,"Rahul");
        System.out.println("-------------Hash table--------------");
        for (Map.Entry m:ht.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }
 
        //----------------hashmap--------------------------------
        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        hm.put(100,"Amit");
        hm.put(104,"Amit"); 
        hm.put(101,"Vijay");
        hm.put(102,"Rahul");
        hm.put(102,"Kumar");
        System.out.println("-----------Hash map-----------");
        for (Map.Entry m:hm.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }
		
	}

}
