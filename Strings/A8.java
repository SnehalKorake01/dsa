class Demo{
	public static void main(String[]args){
		StringBuilder sb=new StringBuilder("java");
		sb.delete(1,3);
		System.out.println(sb);
		StringBuilder s1=new StringBuilder("HelloWorld");
		s1.delete(1,4);
		System.out.println(s1);
	}
}