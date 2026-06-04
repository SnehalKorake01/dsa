import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int count=1;
		for(int i=1;i<=n;i++){
			if(i%2!=0){
				for(int j=1;j<=3;j++){
					System.out.print(count+" ");
					count++;
				}
				count=count-1+n;
			}
			else{
				for(int k=1;k<=3;k++){
					System.out.print(count+" ");
					count--;
				}
				count=count+1+n;
			}
			System.out.println();
		}
	}
}