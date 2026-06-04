import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			int count=1;
			for(int j=count*i;j<=n;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
