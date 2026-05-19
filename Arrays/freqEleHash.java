import java.util.*;
class Demo{
	public static void main(String[]args){
		int[]arr={1,2,6,8,3,1,9,6};
		HashMap<Integer,Integer>hm=new HashMap<>();
		for(int i=0;i<arr.length;i++){
			hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
		}
		for(Integer key:hm.keySet()){
			System.out.println(key+":"+hm.get(key));
		}
	}
}