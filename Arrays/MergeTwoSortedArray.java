import java.util.*;
class Demo{
	public static void main(String[]args){
		int[]arr1={1,3,5,7};
		int[]arr2={2,4,6,8};
		int[]merged=new int[arr1.length+arr2.length];
		int i=0;
		int j=0;
		int k=0;
		while(i<arr1.length && j<arr2.length){
			if(arr1[i]<=arr2[j]){
				merged[k]=arr1[i];
				k++;
				i++;
			}
			else{
				merged[k]=arr2[j];
					k++;
					j++;
			}
		}
		while(i<arr1.length){
			merged[k]=arr1[i];
				i++;
				k++;
		}
		while(j<arr2.length){
			merged[k]=arr2[j];
				k++;
				j++;
		}
		System.out.println(Arrays.toString(merged));
	}
}
