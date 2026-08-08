import java.util.*;
class Demo{
	public static void main(String[]args){
		int[]arr={1,2,2,3,3};
		HashMap<Integer,Integer>hm=new HashMap<>();
		int store=0;
		int leastFrequent=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++){
			hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
		}
		for(int key:hm.keySet()){
			if(hm.get(key)<leastFrequent){
				leastFrequent=hm.get(key);
				store=key;
			}
		}
		System.out.println(store);
	}
}