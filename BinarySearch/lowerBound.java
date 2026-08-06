class Demo{
	public static void main(String[]args){
		int[]arr={1,2,4,6,8,10};
		int k=5;
		int ans=lowerBound(arr,k);
		System.out.println(ans);
	}
	public static int lowerBound(int[]arr,int k){
		int low=0;
		int high=arr.length-1;
		int ans=-1;
		while(low<=high){
			int mid=(low+high)/2;
			if(arr[mid]>=k){
				ans=mid;
				high=mid-1;
			}
			else{
				low=mid+1;
			}
		}
		return arr[ans];
	}
}
				
		