package sorting;

public class insertionSorting {

	public static void main(String[] args) {
		//int [] arr= {10,6,2,31,25};
		int [] arr= {5,2,3,2,1};
		int n= arr.length;
		for(int i=1;i<n;i++) {
			int temp=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>temp) {
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=temp;
		}
		for(int k:arr) {
			System.out.print(k +" ");
		}
	}

}
