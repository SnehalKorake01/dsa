import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=sc.nextInt();
		int oddCount=1;
		int evenCount=2;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i%2==0){
					System.out.print(evenCount+" ");
					evenCount +=2;
				}
				else{
					System.out.print(oddCount+" ");
					oddCount +=2;
				}
			}
		System.out.println();
		}
	}
}