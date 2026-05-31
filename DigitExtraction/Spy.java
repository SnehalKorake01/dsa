import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int product=1;
		while(n!=0){
			int rem=n%10;
			sum=sum+rem;
			product=product*rem;
			n=n/10;
		}
		if(sum==product){
			System.out.println("Spy No");
		}
		else{
			System.out.println("Not Spy no");
		}
	}
}