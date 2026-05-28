import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		ArrayList<Integer>al=new ArrayList<>();
		int max=arr[arr.length-1];
		al.add(max);
		for(int i=arr.length-2;i>=0;i--){
			if(arr[i]>max){
				max=arr[i];
				al.add(max);
			}
		}
		for(int i=al.size()-1;i>=0;i--){
			System.out.print(al.get(i)+" ");
		}
	}
}