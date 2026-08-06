class Demo{
	public static void main(String[]args){
		int[]arr={-10,-8,-5,-2,3,7};
		int ans=lastNegative(arr);
		System.out.println(ans);
	}
	public static int lastNegative(int[]arr){
		int low=0;
		int high=arr.length-1;
		int ans=-1;
		while(low<=high){
			int mid=(low+high)/2;
			if(arr[mid]<0){
				ans=mid;
				low=mid+1;
			}
			else{
				high=mid-1;
			}
		}
		return arr[ans];
	}
}