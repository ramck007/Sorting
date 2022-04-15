package sorting;

import java.util.LinkedList;

public class Task2 {
	public static void method2() {
		LinkedList <Integer> ll= new LinkedList();
		ll.add(34);
		ll.add(5);
		ll.add(1);
		ll.add(5);
		System.out.println(ll);
		
		//int k=ll.get(ll.size()-1);
		//System.out.println(k);
		for(int i=0;i<ll.size();i++) {
			int k=ll.get(ll.size()-1);
			if(ll.get(i)>k) {
				int j=ll.get(i);
				ll.set(i,ll.get(ll.size()-1));
				ll.set((ll.size()-1), j);
				
			}
			
		}
		System.out.println(ll);

		}

	
public static void method1() {
	LinkedList <Integer> ll= new LinkedList();
	ll.add(4);
	ll.add(3);
	ll.add(1);
	
	System.out.println(ll);
	
	//int k=ll.get(ll.size()-1);
	//System.out.println(k);
	for(int i=0;i<ll.size();i++) {
		int k=ll.get(ll.size()-1);
		if(ll.get(i)>k) {
			int j=ll.get(i);
			ll.set(i,ll.get(ll.size()-1));
			ll.set((ll.size()-1), j);
			
		}
		
	}
	System.out.println(ll);

	}

	public static void main(String[] args) {
		method1();

}
}
/*
You are given a singly linked list, write a program to sort it using insertion sort.

Problem Note
	-Return the head of the sorted linked list
	-Try to solve the problem using in-place algorithm(O(1) space).
Example
Input: 4->3->1
	Output: 1->3->4	
	Explanation: Firstly,
	 1 is compared to all elements and put in place such that 1->4->3. 
	 Then 3 is put in place after comparing it to all elements such that 1->3->4.
	 4 is already in place and the list is sorted.
*/