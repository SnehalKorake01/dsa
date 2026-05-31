import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int store=n;
		int sum=0;
		while(n!=0){
			int rem=n%10;
			int fact=1;
			for(int i=1;i<=rem;i++){
				fact=fact*i;
			}
			sum=sum+fact;
			n=n/10;
		}
		if(store==sum){
			System.out.println("Strong number");
		}
		else{
			System.out.println("not Strong number");
		}
	}
}