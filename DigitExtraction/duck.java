import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean isDuck=false;
		while(n!=0){
			int rem=n%10;
			if(rem==0){
				isDuck=true;
				break;
			}
			n=n/10;
		}
		if(isDuck){
			System.out.println("Duck Number");
		}
		else{
			System.out.println("Not Duck Number");
		}
	}
}
