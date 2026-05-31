class Demo{
	public static void main(String[]args){
		int[][]arr={
				{1,2,3},
				{4,5,6},
				{7,8,9}
			   };
		int k=10;
		boolean isFound=false;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				if(arr[i][j]==k){
					isFound=true;
					break;
				}
			}
		}
		if(isFound){
			System.out.println("found");
		}
		else{
			System.out.println("not found");
		}
	}
}
			