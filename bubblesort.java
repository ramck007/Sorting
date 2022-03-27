package sorting;

public class bubblesort {

	public static void main(String[] args) {
		int [] arr= {2,5,6,8,7,1};
		int n=arr.length;
		boolean isSwapped;
		System.out.println("Bubble Sorting\n");
		System.out.println("Before Sorting");
		for(int k:arr) {
			System.out.print(k+" ");
		}
		System.out.println("");
		for(int i=0;i<n;i++) {
			isSwapped=false;
			for(int j=0;j<n-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					isSwapped=true;
				}
				if(!isSwapped) {
					continue;
				}
			}
		}
		System.out.println("After Sorting");
		for(int k:arr) {
			System.out.print(k+" ");
		}
	}

}
