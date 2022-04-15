package sorting;

public class QuickSort {
	static void Quicksort(int arr[],int low,int high) {
		
		int mid = (low+high)/2;
		int i=low;
		int j=high;
		int pivot=arr[mid];
			 
		while(i<=j) { //0 <6  4<5
			while(arr[i]<pivot) { //15<89 25<89 
				i++;// i=3 i=5 i=6
			}
			while(arr[j]>pivot) { //84>89 45>89
				j--;
			}
			
			
			if(i<=j) {//3<6 //84 89
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;         // 25 i=4
				j--;		//45   j=5
			}
		}
		//15 4 5 84 25 89 45
	//recursive quick sort
		
		if(low<j)  //0<5
			Quicksort(arr,low,j);
		if(high>i) //6>6
			Quicksort(arr,i,high);
			  
		 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {15,4,5,89,25,45,84};
		System.out.println("Before sorting");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			
		}
		System.out.println("\n");

		Quicksort(arr,0,arr.length-1);
		System.out.println("After sorting");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
