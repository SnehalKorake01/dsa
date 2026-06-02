import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			for(int j=0;j<n-i-1;j++){
				System.out.print("  ");
			}
			for(int k=i+1;k>=1;k--){
				System.out.print(k+" ");
			}
			int count=2;
			for(int j=i;j>=1;j--){
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
	}
}