import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int count=n;
		for(int i=0;i<n;i++){
			for(int j=0;j<i;j++){
				System.out.print("  ");
			}
			for(int j=1;j<=2*(n-i)-1;j++){
				System.out.print(count+" ");
			}
			count--;
			System.out.println();
		}
		count=n-1;
		for(int i=n-1;i>0;i--){
			for(int j=1;j<i;j++){
				System.out.print("  ");
			}
			
			for(int j=1;j<=2*(n-i)+1;j++){
				System.out.print(count+" ");
			}
			count++;
			System.out.println();
		}

	}
}