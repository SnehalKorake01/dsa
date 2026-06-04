import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			int count=1;
			int store=count*i;
			for(int j=1;j<=n;j++){
				System.out.print(store+" ");
				store++;
			}
			System.out.println();
		}
	}
}