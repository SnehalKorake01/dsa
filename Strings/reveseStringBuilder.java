import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String s=sc.next();
		StringBuilder sb=new StringBuilder(s);
		System.out.println(sb.reverse());
	}
}