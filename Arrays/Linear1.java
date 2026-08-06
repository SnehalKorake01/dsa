class Demo{
	public static void main(String[]args){
		int[]arr={10,20,30,40,50};
		int key=100;
		boolean isFound=false;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==key){
				isFound=true;
				break;
			}
		}
		if(isFound){
			System.out.println("Found");
		}
		else{
			System.out.println("not found");
		}
	}
}