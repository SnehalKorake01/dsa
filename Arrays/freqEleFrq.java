class Demo{
	public static void main(String[]args){
		int []arr={1,2,2,3,1};
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			max=Math.max(arr[i],max);
		}
		int[]freq=new int[max+1];
		for(int i=0;i<arr.length;i++){
			freq[arr[i]]++;
		}
		for(int i=0;i<freq.length;i++){
			if(freq[i]!=0){
				System.out.println(i+" :"+freq[i]);
			}
		}
	}
}