package com.javacodegeeks.snippets.core;
 
import java.util.LinkedList;
import java.util.ListIterator;
  
public class LinkedListClear {
  
  public static void main(String[] args) {
  
 
    LinkedList linkedList = new LinkedList();
    linkedList.add("element_1");
    linkedList.add("element_2");
    linkedList.add("element_3");
    linkedList.add("element_4");
    linkedList.add("element_5");
	linkedList.add("element_6");
	linkedList.add("element_7");
	linkedList.add("element_8");
	linkedList.add("element_9");
	linkedList.add("element_10");
	linkedList.add("element_11");
  
    System.out.println("LinkedList size before removing elements : " + linkedList.size());
 
    
    linkedList.clear();
 
    System.out.println("LinkedList size after removing elements : " + linkedList.size());
  }
}
