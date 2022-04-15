package sorting;

import java.util.Arrays;

public class insertionSort {
	
	public static void insertion(int [] arr) {
		for(int i=1;i<arr.length;i++) {
			for(int j=i;j>0;j--) {
				if(arr[j]<arr[j-1]) {
					int temp= arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
				else {
					break;
				}
			}
		}
		System.out.println(" Booooooo ");
		System.out.print(Arrays.toString(arr));
		System.out.println(" Booooooo ");
	}

	public static void main(String[] args) {
		int arr[]= {10,6,2,31,25};
		insertion(arr);
		/*int n= arr.length;
		int t,i,j;
		for( i=1;i<n;i++) {
			t=arr[i];
			j=i-1;
			while(t<arr[j] &&j>0) {
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=t;
		}
		
		
		
		
		/*for(int i=0;i<arr.length;i++) {
			for(int j=0;j<i-1;j++) {
			
				if((j>0) && (arr[j-1]>arr[j])) {
					int temp= arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
				
			}
		}*/
		
		/**/
		
		for(int k:arr) {
			System.out.print(k + " ");
		}

	}

}

/*
 * public static int[] insertionsort(int[]arr) {
		for(int i=1;i<arr.length;i++) {
			
			int j=1;
			while((j>0) && (arr[j-1]>arr[j])) {
				int temp=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
				j--;
			}
			
		}
		return arr;
	}
	public static void main(String[]args) {
		 
		int arr[]= new int[]{8,9,6,5,2,3};
		arr=insertionsort(arr);
		System.out.println(Arrays.toString(arr));
		
	}*/
