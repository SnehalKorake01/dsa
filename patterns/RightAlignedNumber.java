import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			int store=1;
			for(int j=1;j<=n;j++){
				if(i+j>=n+1){
					System.out.print(store+" ");
					store++;
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}