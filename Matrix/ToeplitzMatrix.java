class Demo{
	public static void main(String[]args){
		int[][]arr={
				{1,2,3,4},
				{5,1,2,3},
				{6,5,1,2}
			   };
		boolean isToeplitz=true;
		for(int i=1;i<arr.length;i++){
			for(int j=1;j<arr[i].length;j++){
				if(arr[i][j]!=arr[i-1][j-1]){
					isToeplitz=false;
					break;
				}
			}
		}
		if(isToeplitz){
			System.out.println("Toeplitz matrix");
		}
		else{
			System.out.println("not Toeplitz");
		}
	}
}