package sorting;

import java.util.Arrays;

public class SelectionSort {
	
	
	public static void selection(int [] arr) {
		
		for(int i=0;i<arr.length;i++) {
			int min= arr[i];
			int k=i;
			for(int j=i;j<arr.length;j++) {
				if(min>arr[j]) {
					min=arr[j];
					k=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[k];
			arr[k]=temp;
		}
		System.out.println(" Booooooo ");
		System.out.print(Arrays.toString(arr));
		System.out.println(" Booooooo ");
		for(int k:arr) {
			System.out.print(k+" ");
		}
		
		
	}

	public static void main(String[] args) {
		
		int[] arr= {8,9,6,5,2,3};
		System.out.println("Selection Sort\n");
		selection(arr);
		System.out.println("Before sorting");
		for(int k:arr) {
			System.out.print(k+" ");
		}
		System.out.println("\n");
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {//13>15   13>12   12 15 13
					int small = arr[j];
					arr[j]=arr[i]; 
					arr[i]=small;
				}
				//System.out.println(arr[i]);
			}
		}
		System.out.println("After sorting");
		for(int k:arr) {
			System.out.print(k+" ");
		}
	}

}
