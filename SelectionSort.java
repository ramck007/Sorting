package sorting;

public class SelectionSort {

	public static void main(String[] args) {
		
		int[] arr= {8,9,6,5,2,3};
		System.out.println("Selection Sort\n");
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
			}
		}
		System.out.println("After sorting");
		for(int k:arr) {
			System.out.print(k+" ");
		}
	}

}
