class Demo{
	public static void main(String[]args){
		int[][]arr={	
				{1,0,1},
				{0,2,0},
				{0,0,3}
			   };
		boolean isDiagonal=true;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				if(i!=j && arr[i][j]!=0){
					isDiagonal=false;
					break;
				}
			}
		}
		if(isDiagonal){
			System.out.println("Diagonal matrix");
		}
		else{
			System.out.println("not diagonal");
		}
	}
}