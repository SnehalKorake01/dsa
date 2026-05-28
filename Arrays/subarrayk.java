import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int k=6;
		int count=0;
		for(int i=0;i<n;i++){
			int sum=0;
			for(int j=i;j<n;j++){
				sum +=arr[j];
				if(sum==k){
				    count++;
				}
			}
		}
		System.out.print(count);
	}
}
					