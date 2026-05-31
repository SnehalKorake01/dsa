import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int store=n;
		int sum=0;
		while(n!=0){
			int rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		if(store%sum==0){
			System.out.println("Harshad Number");
		}
		else{
			System.out.println("not harshad number");
		}
	}
}