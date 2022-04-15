package sorting;

public class MergeSort {
	
	 void Mergesort(int arr[],int L,int mid,int R) {
			
		 int l=mid-L+1;
		 int r=R-mid;
		 //temp array
		 int LeftArray[]=new int[l];
		 int RightArray[]=new int[r];
		 
		 
		 for(int i=0;i<l;++i) {
			 LeftArray[i]=arr[L+i];
		 }
		 
		 for(int j=0;j<r;++j) {
			 RightArray[j]=arr[mid+1+j];
		 }		 
		 int i=0,j=0;
		 int k=L;
		 
		 //compare left and right array
		 while(i<l && j<r) {
			 if(LeftArray[i]<=RightArray[j]) {
				 arr[k]=LeftArray[i];
				 i++;
				 
			 }else {
				 arr[k]=RightArray[j];
				 j++;
			 }
			 k++;
		 }
		 
		 //swapping
		 while(i<l) {
			 arr[k]=LeftArray[i];
			 i++;
			 k++;
			 
		 }
		 
		 while(j<r) {
			 arr[k]=RightArray[j];
			 j++;
			 k++;
		 }

	}
	 
	 //recursion

	 void sort(int arr[],int L,int R) {
		 
		 if(L<R) {    //9<18 14<18  // 3<18
			 int mid=(L+R)/2;   // 3//5//5
			 sort(arr,L,mid);   // ,0,3
			 sort(arr,mid+1,R);   //  4,6//,5,6 ///,
			// System.out.println(mid);
			 Mergesort(arr,L,mid,R);// mid=3
			 
		 }
	 }
	public static void main(String[] args) {
	
		
		int arr[]= {9,7,5,2,14,3,18};
		System.out.println("Before sorting");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			
		}
		
		System.out.println("");

		MergeSort ob = new MergeSort();
		ob.sort(arr, 0, arr.length-1);
		
		System.out.println("After sorting");
		for(int i=0;i<arr.length;i++) {
			
			System.out.print(arr[i] + " ");
		}

	}

}
