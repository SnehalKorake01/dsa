class Demo{
	public static void main(String[]args){
		int[]arr={2,4,6,7,9,11};
		int ans=firstOdd(arr);
		System.out.println(ans);
	}
	public static int firstOdd(int[]arr){
		int low=0;
		int high=arr.length-1;
		int ans=-1;
		while(low<=high){
			int mid=(low+high)/2;
			if(arr[mid]%2==0){
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
		