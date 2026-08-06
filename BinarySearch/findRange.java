import java.util.*;
class Demo{
	public static void main(String[]args){
		int[]arr={5,7,7,8,8,9};
		int k=8;
		int[]result=findRange(arr,k);
		System.out.println(Arrays.toString(result));
	}
	public static int[]findRange(int[]arr,int k){
		int first =firstOccurence(arr,k);
		int last=lastOccurence(arr,k);
		return new int[]{first,last};
	}
	public static int firstOccurence(int[]arr,int k){
		int low=0;
		int high=arr.length-1;
		int ans=-1;
		while(low<=high){
			int mid=(low+high)/2;
			if(arr[mid]==k){
				ans=mid;
				high=mid-1;
			}
			else if(arr[mid]<k){
				low=mid+1;
			}
			else{
				high=mid-1;
			}
		}
		return ans;
	}
	public static int lastOccurence(int[]arr,int k){
		int low=0;
		int high=arr.length-1;
		int ans=-1;
		while(low<=high){
			int mid=(low+high)/2;
			if(arr[mid]==k){
				ans=mid;
				low=mid+1;
			}
			else if(arr[mid]<k){
				low=mid+1;			}
			else{
				high=mid-1;
			}
		}
		return ans;
	}
}



		