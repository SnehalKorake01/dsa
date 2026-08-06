class Demo{
	public static void main(String[]args){
		int[]arr={2,8,5,1,9};
		int smaller=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<smaller){
				smaller=arr[i];
			}
		}
		System.out.println(smaller);
	}
}