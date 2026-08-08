import java.util.*;
class Demo{
	public static void main(String[]args){
		int[]arr={1,3,2,3,4,3,2};
		HashMap<Integer,Integer>hm=new HashMap<>();
		int max=0;
		int store=0;
		for(int i=0;i<arr.length;i++){
			hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
		}
		for(int key:hm.keySet()){
			if(hm.get(key)>store){
				store=hm.get(key);
				max=key;
			}
		}
		System.out.println(max);
	}
}