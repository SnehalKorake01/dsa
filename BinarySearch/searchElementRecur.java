class Demo{
	public static void main(String[]args){
		int[]arr={2,5,8,12,16,23,38};
		int target=16;
		int ans=searchElement(arr,0,arr.length-1, target);
		System.out.println(ans);
	}
	public static int searchElement(int[]arr,int low,int high,int target){
	
		if(low>high){
			return -1;
		}
			int mid=(low+high)/2;
			if(arr[mid]==target){
				return mid;
			}
			else if(arr[mid]>target){
				return searchElement(arr,low,mid-1,target);
			}
			else{
				return searchElement(arr,mid+1,high,target);
			}
	}
			
}
			