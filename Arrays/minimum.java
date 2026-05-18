class Demo{
	public static void main(String[]args){
		int[]arr={8,5,3,2,6,1};
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++){
			if(min>arr[i]){
				min=arr[i];
			}
		}
		System.out.println("Minimum no is:"+min);
	}
}