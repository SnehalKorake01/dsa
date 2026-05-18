class Demo{
	public static void main(String[]args){
		int[]arr={2,4,1,7,9,3};
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			if(max<arr[i]){
				max=arr[i];
			}
		}
		System.out.println("Maximum no is:"+max);
	}
}