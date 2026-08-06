class Demo{
	public static void main(String[]args){
		int[]arr={2,8,5,1,11};
		int largest=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>largest){
				largest=arr[i];
			}
		}
		System.out.println(largest);
	}
}