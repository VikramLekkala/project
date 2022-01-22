package PracticeProject1;

public class QuickSort {
int partition(int arr[],int low ,int high) {
	int pivot=arr[high];
	int i=(low-1);//index of smaller element
	for(int j=low;j<high;j++) {
		if(arr[j]<=pivot) {
			i++;
			//swap arr[i] and arr[j]
			int temp=arr[i]; 
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
	
	//swap arr[i+1] and arr[high](or pivot)
	int temp=arr[i+1];
	arr[i+1]=arr[high];
	arr[high]=temp;
	return i+1;
}

void sort(int arr[], int low,int high) {
	if(low<high) {
		int pi=partition(arr,low,high);
		
		sort(arr,low,pi-1);
		sort(arr,pi+1,high);
	}
}
static void printArray(int arr[]) {
	int n=arr.length;
	for(int i=0;i<n;++i)
		System.out.println(arr[i]+" ");
	System.out.println();
}

//driver program
	public static void main(String[] args) {
		int arr[]= {11,20,5,1,12,2};
		int n=arr.length;
		
		QuickSort obj=new QuickSort();
		obj.sort(arr, 0, n-1);
		
		System.out.println("Sorted Array");
		printArray(arr);

	}

}
