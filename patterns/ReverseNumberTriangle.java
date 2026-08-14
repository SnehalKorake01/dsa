import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--){
			int store=n;
			for(int j=1;j<=i;j++){
				System.out.print(store+" ");
				store--;
			}
			System.out.println();
		}
	}
}