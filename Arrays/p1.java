import java.util.*;
class Demo{
	public static void main(String[]args){
		int[]arr={1,5,3,8,6};
		for(int i=0;i<arr.length;i++){
			arr[i]=9;
		}
		System.out.println(Arrays.toString(arr));
	}
}