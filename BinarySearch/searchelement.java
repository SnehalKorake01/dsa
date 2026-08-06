class Demo{
	public static void main(String[]args){
		int[]arr={2,5,8,12,16,23,38};
		int target=16;
		int ans=searchElement(arr,target);
		System.out.println(ans);
	}
	public static int searchElement(int[]arr,int target){
		int low=0;
		int high=arr.length-1;
		int ans=-1;
		while(low<=high){
			int mid=low+(high-low)/2;
			if(arr[mid]==target){
s				return mid;
			}
			else if(arr[mid]>target){
				high=mid-1;
			}
			else{
				low=mid+1;
			}
		}
		return -1;
	}
}