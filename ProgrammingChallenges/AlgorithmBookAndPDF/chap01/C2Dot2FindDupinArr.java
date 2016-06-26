package chap01;

public class C2Dot2FindDupinArr {
	
	
	int []insertionSort1(int arr[]){
		int key;
		for(int i=1;i<arr.length;i++){
			key=arr[i];
			for(int j=0;j<i;j++){
				if(key<arr[j]){
					swap(arr,i,j);
				}
			}
		}
		
		return arr;
		
	}
	
	boolean findDuplicate(int []dup){
		
		boolean duplicate=false;
		
		for(int j=0;j<(dup.length-1);j++){
			if(dup[j]!=dup[j+1]){
				duplicate=false;
			}else{
				duplicate=true;
				break;
			}
		}
		return duplicate;
	
		
	}
	
	int []insertionSort2(int arr[]){
		int key;
		for(int j=1;j<arr.length;j++){
			key=arr[j];
			int i;
			
			i=j-1;
			while(i>0 && arr[i]>key){
				arr[i+1]=arr[i];
				i=i-1;
				arr[i+1]=key;
					//swap(arr,j,i);				
			}
		}
		
		return arr;
		
	}
	
	void swap(int a[],int i, int j){
		int temp;
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	   public void mergeSort1(int[] inputArray) {
	        int size = inputArray.length;
	        if (size < 2)
	            return;
	        int mid = size / 2;
	        int leftSize = mid;
	        int rightSize = size - mid;
	        int[] left = new int[leftSize];
	        int[] right = new int[rightSize];
	        for (int i = 0; i < mid; i++) {
	            left[i] = inputArray[i];

	        }
	        for (int i = mid; i < size; i++) {
	            right[i - mid] = inputArray[i];
	        }
	        mergeSort1(left);
	        mergeSort1(right);
	        merge2(left, right, inputArray);
	    }

	public void merge2(int[] left, int[] right, int[] arr){
		int leftSize=left.length;
		int rightSize=right.length;
		
		int i=0,j=0,k=0;
		
		while(i<leftSize && j<rightSize){
			if(left[i]<=right[j]){
				arr[k]=left[i];
				i++;
				k++;
			}else{
				arr[k]=right[j];
				j++;
				k++;
			}
		}
		while(i<leftSize ){
			arr[k]=left[i];
			i++;
			k++;
		}
		while(j<leftSize ){
			arr[k]=right[j];
			j++;
			k++;
		}
	}
	
	
	public static void main(String args[]){
		
		int[] input={4,6,1,2,7,3,1};
		
		C2Dot2FindDupinArr c=new C2Dot2FindDupinArr();
		
//		for(int k=0;k<c.findOddPair(input).length;k++){
//			System.out.println(c.findOddPair(input)[k]);
//		}
		//c.insertionSort1(input);
		//c.mergeSort1(input);
		
		//for(int i=0;i<input.length;i++)
		
		input=c.insertionSort1(input);
		
		if(c.findDuplicate(input))
			System.out.println("There are some dups");
		else
			System.out.println("None found");
	
		
	}
}
