import java.util.*;
class Demo{
	public static void main(String[]args){
		int[]arr={1,2,3,4,5};
		int []newArr=new int[arr.length];
		for(int i=0;i<arr.length;i++){
			newArr[i]=arr[arr.length-1-i];
		}
		System.out.println(Arrays.toString(newArr));
	}
}
			
	