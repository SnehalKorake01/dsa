import java.util.*;
class Demo{
	public static void main(String[]args){
		int[]arr={1,7,4,2,9};
		f(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	static void f(int[]arr,int low,int high){
		if(low>=high){
			return;
		}
		int mid=(low+high)/2;
		f(arr,low,mid);
		f(arr,mid+1,high);
		merge(arr,low,mid,high);
	}
	static void merge(int[]arr,int low,int mid,int high){
		int[]merged=new int[high-low+1];
		int i=low;
		int j=mid+1;
		int k=0;
		while(i<=mid && j<=high){
			if(arr[i]<=arr[j]){
				merged[k]=arr[i];
				i++;
				k++;
			}
			else{
				merged[k]=arr[j];
				j++;
				k++;
			}
		}
		while(i<=mid){
			merged[k]=arr[i];
			k++;
			i++;
		}
		while(j<=high){
			merged[k]=arr[j];
			k++;
			j++;
		}
		for(int s=0;s<merged.length;s++){
			arr[low+s]=merged[s];
		}
	   
	}
}