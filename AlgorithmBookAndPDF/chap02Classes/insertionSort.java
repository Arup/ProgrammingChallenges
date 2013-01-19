package chap02Classes;

public class insertionSort {

	public static int[] sort(int [] a){
		int [] dest;
		int len=0;
		int j=0;
		int temp=0;
		int cur=0;
		
		len=a.length;
		for(int i=1;i<len;i++){
			cur=a[i];
			j=i-1;
			while(j>=0){
				if(a[j]>cur){
				temp=a[j+1];				
				a[j+1]=a[j];
				a[j]=temp;
				}
				j--;
			}
		}
		
		return a;
	}
	
	public static void main(String args[]){
		
		int [] a={5,4,7,10,8,6,1};
		
		a=sort(a);
		
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]+" \t");
		}
		
	}
}
