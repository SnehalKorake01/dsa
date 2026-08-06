import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String s=sc.next();
		int count=0;
		for(int i=0;i<s.length();i++){
			count++;
		}
		System.out.println(count);
	}
}