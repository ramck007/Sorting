package sorting;

public class Task1 {

	public static void main(String[] args) {
		//method1();
		method2();
	}
	
	public static void method1() {
		int [] arr = {1, 3, 5, 5, 5, 5, 28, 37, 42};
		int count=0;
		int a=0,b=0;
		for(int i=0;i<arr.length-2;i++) {
			if(arr[i]==arr[i+1] && count==0) {
				a=i;
				count++;
			}
			if(arr[i]==arr[i+1] && arr[i+1]!=arr[i+2]) {
				b=i+1;
			}
		}
		System.out.println(a+ " "+b);
	}
	
	public static void method2() {
		int [] arr = {1, 3, 5, 5, 5, 5, 28, 37, 42};
		int k=5;
		int a=0,b=0,count=0,x=0,y=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==k && count==0) {
				a=i;
				count++;
				x=1;
			}
			else if(arr[i]==k && arr[i+1]!=k) {
				b=i;
				y=1;
			}
			
		}
		if(x==0 && y==0) {
			a=-1;b=-1;
		}
		System.out.println(a+ " "+b);		
	}
	
		
}
/*
Given a sorted array arr[] with possibly duplicate elements, write a program to find indexes of first and last occurrences of target element in the given array.

Problem Note 
	-The algorithm's runtime complexity must be in the order of O(log n)
	-If the target is not found in the array, return [-1, -1]
Example 
	Input: arr[] = [1, 3, 5, 5, 5, 5, 28, 37, 42], target = 5
	Output: [2, 5]
	Explanation: First Occurrence = 2 and Last Occurrence = 5*/