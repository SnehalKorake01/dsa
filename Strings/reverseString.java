import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String store="";
		for(int i=s.length()-1;i>=0;i--){
			store +=s.charAt(i);
		}
		System.out.println(store);
	}
}