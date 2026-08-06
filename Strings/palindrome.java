import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String rev="";
		for(int i=s.length()-1;i>=0;i--){
			rev +=s.charAt(i);
		}
		if(s.equals(rev)){
			System.out.println("palindrome");
		}
		else{
			System.out.println("not palindrome");
		}
	}
}