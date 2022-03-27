package sorting;

public class insertionSort {

	public static void main(String[] args) {
		int arr[]= {8,9,6,5,2,3};
		int n= arr.length;
		/*for(int i=0;i<arr.length;i++) {
			for(int j=0;j<i-1;j++) {
			
				if((j>0) && (arr[j-1]>arr[j])) {
					int temp= arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
				
			}
		}*/
		
		int t,i,j;
		for( i=1;i<=n-1;i++) {
			t=arr[i];
			j=i-1;
			while(t<arr[j] &&j>=0) {
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=t;
		}
		
		for(int k:arr) {
			System.out.print(k);
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
