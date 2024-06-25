package com.collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class DemoLinkedList {

	public static void main(String[] args) {
		LinkedList<Double> llist=new LinkedList<Double>();
		
		
		llist.add(2000.03);
		llist.add(3005.35);
		llist.add(3200.03);
		llist.add(3205.35);
		llist.add(321.03);
		llist.add(302.35);
		
		System.out.println(llist);
		System.out.println(llist.size());
		
		llist.remove(0);
		System.out.println(llist);
		llist.push(4302.32);
		
  		Iterator<Double> itr=llist.iterator();
  		
  		while(itr.hasNext()) {
  			System.out.println(itr.next());
  		}
  		
  		System.out.println("Max="+Collections.max(llist));
  		System.out.println("Min+"+Collections.min(llist));
  		
  		Collections.sort(llist);
  		System.out.println(llist);
  		
  		System.out.println(Collections.reverseOrder());
  		Collections.reverse(llist);
  		System.out.println(llist);
  		}

	}

